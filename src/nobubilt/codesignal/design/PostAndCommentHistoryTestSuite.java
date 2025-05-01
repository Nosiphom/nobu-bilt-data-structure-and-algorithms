package nobubilt.codesignal.design;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.Test;

public class PostAndCommentHistoryTestSuite {

	 @Test
	    void testPostCreationAndRollback() {
	        PostAndCommentHistory platform = new PostAndCommentHistory();
	        assertTrue(platform.createPost("1", "Post 1 content", 1L));
	        assertFalse(platform.createPost("1", "Duplicate Post 1 content", 2L));  // Test duplicate post id
	        assertTrue(platform.editPost("1", "Edited Post 1 content"));
	        assertTrue(platform.rollbackPostEdit("1"));
	        assertEquals("Post 1 content", platform.getPosts().get("1").getContent());
	    }

	    @Test
	    void testCommentCreationEditAndRollback() {
	        PostAndCommentHistory platform = new PostAndCommentHistory();
	        platform.createPost("1", "Post 1 content", 1L);
	        assertTrue(platform.commentOnPost("1", "C1", "Comment 1", 1L));
	        assertTrue(platform.editComment("1", "C1", "Edited Comment 1"));
	        assertTrue(platform.rollbackCommentEdit("1", "C1"));
	        assertEquals("Comment 1", platform.getComments().get("C1").getContent());
	    }

	    @Test
	    void testLikePostAndQueryTopLiked() {
	        PostAndCommentHistory platform = new PostAndCommentHistory();
	        platform.createPost("1", "Post 1 content", 1L);
	        platform.createPost("2", "Post 2 content", 2L);
	        platform.likePost("1");
	        platform.likePost("2");
	        platform.likePost("1");
	        List<String> topLiked = platform.topNLikedPosts(2);
	        assertEquals(List.of("1", "2"), topLiked);
	    }

	    @Test
	    void testCommentAndQueryTopCommented() {
	        PostAndCommentHistory platform = new PostAndCommentHistory();
	        platform.createPost("1", "Post 1 content", 1L);
	        platform.createPost("2", "Post 2 content", 2L);
	        platform.commentOnPost("1", "C1", "Comment 1", 1L);
	        platform.commentOnPost("1", "C2", "Comment 2", 2L);
	        List<String> topCommented = platform.topNCommentedPosts(2);
	        assertEquals(List.of("1", "2"), topCommented);
	    }

	    @Test
	    void testEditAndRollbackMultipleTimes() {
	        PostAndCommentHistory platform = new PostAndCommentHistory();
	        platform.createPost("1", "Post 1 content", 1L);
	        platform.commentOnPost("1", "C1", "Comment 1", 1L);
	        assertTrue(platform.editPost("1", "Edited Post 1 content"));
	        assertTrue(platform.editComment("1", "C1", "Edited Comment 1"));
	        assertTrue(platform.rollbackPostEdit("1"));
	        assertTrue(platform.rollbackCommentEdit("1", "C1"));
	        assertEquals("Post 1 content", platform.getPosts().get("1").getContent());
	        assertEquals("Comment 1", platform.getComments().get("C1").getContent());
	    }

	    @Test
	    void testDoubleEditAndDoubleRollbackPost() {
	        PostAndCommentHistory platform = new PostAndCommentHistory();
	        assertTrue(platform.createPost("2", "Initial Post Content", 2L));
	        assertTrue(platform.editPost("2", "First Edit Post Content"));
	        assertTrue(platform.editPost("2", "Second Edit Post Content"));
	        assertTrue(platform.rollbackPostEdit("2"));  // Rollback to first edit
	        assertEquals("First Edit Post Content", platform.getPosts().get("2").getContent());
	        assertTrue(platform.rollbackPostEdit("2"));  // Rollback to initial content
	        assertEquals("Initial Post Content", platform.getPosts().get("2").getContent());
	    }

	    @Test
	    void testDoubleEditAndDoubleRollbackComment() {
	        PostAndCommentHistory platform = new PostAndCommentHistory();
	        platform.createPost("2", "Post Content", 2L);
	        assertTrue(platform.commentOnPost("2", "C2", "Initial Comment Content", 2L));
	        assertTrue(platform.editComment("2", "C2", "First Edit Comment Content"));
	        assertTrue(platform.editComment("2", "C2", "Second Edit Comment Content"));
	        assertTrue(platform.rollbackCommentEdit("2", "C2"));  // Rollback to first edit
	        assertEquals("First Edit Comment Content", platform.getComments().get("C2").getContent());
	        assertTrue(platform.rollbackCommentEdit("2", "C2"));  // Rollback to initial content
	        assertEquals("Initial Comment Content", platform.getComments().get("C2").getContent());
	    }
}
