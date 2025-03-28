

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    //Question 18
    @Test
    public void checkRating()
    {
        SalesItem salesIte1 = new SalesItem("ilsa", 123);
        assertEquals(7, salesIte1.addComment("ilsa", "hello", 7));
        Comment comment1 = new Comment("ilsa", "good", 5);
        assertEquals(5, comment1.getRating());
        comment1.upvote();
        comment1.downvote();
    }
}

