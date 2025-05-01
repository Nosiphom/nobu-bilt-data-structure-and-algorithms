package nobubilt.codesignal.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SocialMediaPosting {
/**
 * You are being asked to enhance a social media interaction system. Initially, your 
 * system supports operations related to posts and reactions, including creating posts, 
 * deleting them, reacting to posts, and summarizing reactions.

Here's a brief overview of what you have in your starter setup:

boolean createPost(String postId, String content): Creates a new post with a unique ID 
and content, returning true if successful.
boolean deletePost(String postId): Deletes an existing post by ID, returning true if 
successful.
boolean reactToPost(String userId, String postId, String reactionType): Allows users to 
react to a post, ensuring each user can react only once per post.
Map<String, Integer> getReactionSummary(String postId): Summarizes reactions to a post, 
returning a dictionary of reaction types and their counts.
Building upon this, you are tasked with adding functionality to support private groups. 
These groups allow users to share posts that are visible only to group members. This 
addition includes creating groups, adding members, sharing posts to groups, and fetching 
posts shared within a group. On top of that, you can no longer leave a reaction to a group
 post unless you belong to the corresponding group.

New functionalities to support:

boolean createGroup(String groupId, String operatorId): Creates a new group with a specified 
unique ID, the admin of the group is operatorId. Returns false if the group with such groupId 
already exists.
boolean addMember(String groupId, String userId, String operatorId): Adds a new member to a 
group, actioned by the group's operator. If the operatorId doesn't match the actual group admin,
 return false.
boolean sharePostToGroup(String postId, String groupId, String userId): Shares an existing 
post to a group's feed, available only if the user is a member of the group.
List<String> getGroupPosts(String groupId): Retrieves posts shared within a group, ordered 
by the time they were shared.
Remember, while incorporating these new features, ensure backward compatibility with your 
existing codebase and functionalities.
 */
	
	 private final Map<String, Post> posts;
	    private final Map<String, List<String>> groupPosts; 
	    private final Map<String, Group> groupMap;
	    public SocialMediaPosting() {
	        posts = new HashMap<>();
	        groupPosts = new HashMap<>();
	        groupMap = new HashMap<>();
	    }

	    public boolean createPost(String postId, String content) {
	        if (posts.containsKey(postId)) return false;
	        posts.put(postId, new Post(content));
	        return true;
	    }

	    public boolean deletePost(String postId) {
	        if (!posts.containsKey(postId)) return false;
	        posts.remove(postId);
	        return true;
	    }

	    public boolean reactToPost(String userId, String postId, String reactionType) {
	        Post post = posts.get(postId);
	        if (post == null) return false;
	        return post.addReaction(userId, reactionType);
	    }

	    public Map<String, Integer> getReactionSummary(String postId) {
	        Post post = posts.get(postId);
	        return post == null ? null : post.getReactionSummary();
	    }
	    public List<String> getGroupPosts(String groupId)
	    {
	        if(groupPosts.containsKey(groupId))
	        {
	            return groupPosts.get(groupId);
	        }
	        return new ArrayList<>();
	    }
	    
	    public boolean sharePostToGroup(String postId, String groupId, String userId)
	    {
	        if(groupMap.containsKey(groupId) && groupMap.get(groupId).getMembers().contains(userId))
	        {
	            groupPosts.get(groupId).add(postId);
	            return true;    
	        }
	        return false;
	    }
	    public boolean addMember(String groupId, String userId, String operatorId)
	    {
	        if(groupMap.containsKey(groupId) && groupMap.get(groupId).getOperatorId().equals(operatorId) && !groupMap.get(groupId).getMembers().contains(userId))
	        {
	            groupMap.get(groupId).getMembers().add(userId);
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean createGroup(String groupId, String operatorId)
	    {
	        if(!groupMap.containsKey(groupId))
	        {
	            groupMap.put(groupId, new Group(groupId,operatorId));
	            groupMap.get(groupId).getMembers().add(operatorId);
	            groupPosts.put(groupId, new ArrayList<>());
	            
	            return true;
	        }
	        return false;
	    }

	    private static class Post {
	        private final String content;
	        private final Map<String, String> reactions;

	        public Post(String content) {
	            this.content = content;
	            this.reactions = new HashMap<>();
	        }

	        public boolean addReaction(String userId, String reactionType) {
	            if (reactions.containsKey(userId)) return false;
	            reactions.put(userId, reactionType);
	            return true;
	        }

	        public Map<String, Integer> getReactionSummary() {
	            Map<String, Integer> summary = new HashMap<>();
	            for (String reaction : reactions.values()) {
	                summary.put(reaction, summary.getOrDefault(reaction, 0) + 1);
	            }
	            return summary;
	        }
	    }
	    
	    class Group 
	    {
	        private Set<String> members;
	        private String groupId;
	        private String operatorId;
	        Group(String groupId, String operatorId)
	        {
	            this.groupId = groupId;
	            this.operatorId = operatorId;
	            this.members = new HashSet<>();
	        }
	        
	        public void setGroupId(String grpId)
	        {
	            this.groupId = grpId;
	        }
	        public String getGroupId()
	        {
	            return groupId;
	        }
	        public void setOperatorId(String opId)
	        {
	            this.operatorId = opId;
	        }
	        public String getOperatorId()
	        {
	            return operatorId;
	        }
	        public void setMembers(Set<String> memberSet)
	        {
	            this.members = memberSet;
	        }
	        public Set<String> getMembers()
	        {
	            return members;
	        }
	    }
	}

