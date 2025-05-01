package nobubilt.codesignal.design;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SocialMediaPostingTest {
	  @Test
	    public void testCreatePost() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        assertTrue(sm.createPost("001", "Hello World!"));
	    }

	    @Test
	    public void testCreateGroup() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        assertTrue(sm.createGroup("grp_001", "admin_001"));
	    }

	    @Test
	    public void testAddMemberToGroup() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        sm.createGroup("grp_001", "admin_001");
	        assertTrue(sm.addMember("grp_001", "user_002", "admin_001"));
	        assertFalse(sm.addMember("grp_001", "user_002", "admin_001"));
	    }

	    @Test
	    public void testReactToPostFailPreShare() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        sm.createPost("001", "Hello World!");
	        sm.createGroup("grp_001", "admin_001");
	        sm.addMember("grp_001", "user_002", "admin_001");
	        assertTrue(sm.reactToPost("user_002", "001", "like"));
	    }

	    @Test
	    public void testSharePostToGroupAndReact() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        sm.createPost("001", "Hello World!");
	        sm.createGroup("grp_001", "admin_001");
	        sm.addMember("grp_001", "user_002", "admin_001");
	        assertTrue(sm.sharePostToGroup("001", "grp_001", "admin_001"));
	        assertTrue(sm.reactToPost("user_002", "001", "like"));
	    }

	    @Test
	    public void testGetGroupPosts() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        sm.createPost("001", "Hello World!");
	        sm.createGroup("grp_001", "admin_001");
	        sm.sharePostToGroup("001", "grp_001", "admin_001");
	        assertEquals(List.of("001"), sm.getGroupPosts("grp_001"));
	    }

	    @Test
	    public void testGetReactionSummary() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        sm.createPost("001", "Hello World!");
	        sm.reactToPost("user_001", "001", "like");
	        Map<String, Integer> expected = new HashMap<>();
	        expected.put("like", 1);
	        assertEquals(expected, sm.getReactionSummary("001"));
	    }

	    @Test
	    public void testDeletePost() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        sm.createPost("001", "Hello World!");
	        assertTrue(sm.deletePost("001"));
	    }

	    @Test
	    public void testAddMemberToNonexistentGroup() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        assertFalse(sm.addMember("grp_999", "user_002", "admin_999"));
	    }

	    @Test
	    public void testCreateDuplicateGroup() {
	        SocialMediaPosting sm = new SocialMediaPosting();
	        sm.createGroup("grp_001", "admin_001");
	        assertFalse(sm.createGroup("grp_001", "admin_001"));
	    }
}
