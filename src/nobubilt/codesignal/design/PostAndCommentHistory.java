package nobubilt.codesignal.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class PostAndCommentHistory {
/**
 * In this task, you'll develop a social media platform from the ground up, which 
 * includes capabilities for handling user posts and comments, along with newer 
 * functionalities to edit comments and a system-wide rollback mechanism for edits
 *  made to posts and comments. All features need to be integrated while ensuring 
 *  backward compatibility.

The following methods are already implemented:

boolean createPost(String postId, String content, long timestamp) - Creates a new 
post with the given content and timestamp. Returns true if the post is successfully 
created and false if a post with the same ID already exists.
boolean editPost(String postId, String newContent) - Edits the content of an 
existing post. Returns true if the edit is successful and false if the post does 
not exist. This method doesn't change the timestamp of the post.
boolean deletePost(String postId) - Deletes a post by its id. Returns true if the 
deletion is successful and false if the post does not exist.
boolean likePost(String postId) - Increments the like count of a post. Returns true 
if successful and false if the post does not exist.
List<String> topNLikedPosts(int n) - Returns a list of the n most liked posts, 
sorted by likes in descending order, breaking ties by timestamp.
boolean commentOnPost(String postId, String commentId, String content, 
long timestamp) - Adds a comment to a post. Returns true if successful, false if 
either the post does not exist or a comment with the same id already exists.
List<String> topNCommentedPosts(int n) - Returns a list of the n most commented 
posts, sorted by the number of comments in descending order, breaking ties by 
timestamp.
Your task, however, is to implement the new functionalities:

boolean editComment(String postId, String commentId, String newComment) - Allows 
users to modify their comments on posts. Each comment is uniquely identified within 
its post by a commentId. Returns true if successful, false if the post or the 
comment does not exist. Editing comment doesn't change the post's timestamp.
boolean rollbackPostEdit(String postId) - Reverses the last edit made to a 
post's content, restoring its previous content. Returns true if there is an edit 
to rollback and operation is successful, otherwise false. This method changes only 
post's content, leaving likes, comments and everything else intact.
boolean rollbackCommentEdit(String postId, String commentId) - Reverses the last 
edit made to a comment's content, restoring its previous content. Returns true if 
there is an edit to rollback and operation is successful, otherwise false.
 */
	
	 private Map<String, Post> posts;
	    private Map<String, Comment> comments;
	    private Map<String, Stack<Post>> postHistory;
	    private Map<String, Map<String, Stack<Comment>>> commentHistory;

	    public PostAndCommentHistory() {
	        this.posts = new HashMap<>();
	        this.comments = new HashMap<>();
	        this.postHistory = new HashMap<>();
	        this.commentHistory = new HashMap();
	    }

	    public boolean createPost(String postId, String content, long timestamp) {
	        if (posts.containsKey(postId)) {
	            return false;
	        }
	        posts.put(postId, new Post(content, timestamp));
	        postHistory.put(postId, new Stack<>());
	        commentHistory.put(postId, new HashMap<>());
	        return true;
	    }

	    public boolean editPost(String postId, String newContent) {
	        if (!posts.containsKey(postId)) {
	            return false;
	        }
	        postHistory.get(postId).push(new Post(posts.get(postId).getContent(), posts.get(postId).getTimestamp(), posts.get(postId).getLikes(), posts.get(postId).getComments()));
	        posts.get(postId).setContent(newContent);
	 
	        return true;
	    }

	    public boolean deletePost(String postId) {
	        if (!posts.containsKey(postId)) {
	            return false;
	        }
	        posts.remove(postId);
	        return true;
	    }

	    public boolean likePost(String postId) {
	        if (!posts.containsKey(postId)) {
	            return false;
	        }
	        posts.get(postId).incrementLikes();
	        return true;
	    }

	    public List<String> topNLikedPosts(int n) {
	        return posts.entrySet().stream()
	                .sorted((e1, e2) -> {
	                    int cmp = Integer.compare(e2.getValue().getLikes(), e1.getValue().getLikes());
	                    return cmp != 0 ? cmp : Long.compare(e1.getValue().getTimestamp(), e2.getValue().getTimestamp());
	                })
	                .limit(n)
	                .map(Map.Entry::getKey)
	                .toList();
	    }

	    // Getters for testing purposes
	    public Map<String, Post> getPosts() {
	        return posts;
	    }

	    public Map<String, Comment> getComments() {
	        return comments;
	    }

	    public boolean commentOnPost(String postId, String commentId, String content, long timestamp) {
	        if (!posts.containsKey(postId) || comments.containsKey(commentId)) {
	            return false;
	        }
	        comments.put(commentId, new Comment(content, timestamp));
	        posts.get(postId).addComment(commentId);
	        commentHistory.get(postId).put(commentId, new Stack<>());
	        return true;
	    }

	    public List<String> topNCommentedPosts(int n) {
	        return posts.entrySet().stream()
	                .sorted((e1, e2) -> {
	                    int cmp = Integer.compare(e2.getValue().getComments().size(), e1.getValue().getComments().size());
	                    return cmp != 0 ? cmp : Long.compare(e1.getValue().getTimestamp(), e2.getValue().getTimestamp());
	                })
	                .limit(n)
	                .map(Map.Entry::getKey)
	                .toList();
	    }
	    public boolean editComment(String postId, String commentId, String newComment)
	    {
	        if(!posts.containsKey(postId) || !comments.containsKey(commentId))
	        {
	            return false;
	        }
	        if(!commentHistory.containsKey(postId) || !commentHistory.get(postId).containsKey(commentId))
	        {
	            return false;
	        }
	        commentHistory.get(postId).get(commentId).push(new Comment(comments.get(commentId).getContent(), comments.get(commentId).getTimestamp()));
	        comments.get(commentId).content = newComment;
	        return true;
	    }
	    
	    public boolean rollbackPostEdit(String postId)
	    {
	        //postHistory
	        if(posts.containsKey(postId) && postHistory.containsKey(postId) && postHistory.get(postId).size() > 0)
	        {
	            Post latestHistoricalRecord = postHistory.get(postId).pop();
	            posts.get(postId).setContent(latestHistoricalRecord.getContent());
	            return true;
	        }
	        return false;
	    }
	    public boolean rollbackCommentEdit(String postId, String commentId)
	    {
	        if(!posts.containsKey(postId) && !comments.containsKey(commentId))
	        {
	            return false;
	        }
	        if(!commentHistory.containsKey(postId) || (!commentHistory.get(postId).containsKey(commentId) && commentHistory.get(postId).get(commentId).size() == 0))
	        {
	           return false;
	        }
	         Comment historicComment = commentHistory.get(postId).get(commentId).pop();
	         comments.get(commentId).content = historicComment.getContent();
	        return true;
	    }

	    public static class Post {
	        private String content;
	        private long timestamp;
	        private int likes;
	        private List<String> comments;

	        public Post(String content, long timestamp) {
	            this.content = content;
	            this.timestamp = timestamp;
	            this.likes = 0;
	            this.comments = new ArrayList<>();
	        }
	        
	         public Post(String content, long timestamp, int likes, List<String> comments) {
	            this.content = content;
	            this.timestamp = timestamp;
	            this.likes = 0;
	            this.comments = new ArrayList<>();
	        }

	        public String getContent() {
	            return content;
	        }

	        public void setContent(String content) {
	            this.content = content;
	        }

	        public long getTimestamp() {
	            return timestamp;
	        }

	        public int getLikes() {
	            return likes;
	        }

	        public void incrementLikes() {
	            this.likes++;
	        }

	        public List<String> getComments() {
	            return comments;
	        }

	        public void addComment(String commentId) {
	            this.comments.add(commentId);
	        }
	    }

	    public static class Comment {
	        private String content;
	        private long timestamp;

	        public Comment(String content, long timestamp) {
	            this.content = content;
	            this.timestamp = timestamp;
	        }

	        public String getContent() {
	            return content;
	        }

	        public void setContent(String content) {
	            this.content = content;
	        }

	        public long getTimestamp() {
	            return timestamp;
	        }
	    }
}
