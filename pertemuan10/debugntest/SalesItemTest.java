import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  Ahmad Satrio Arrohman
 * @version 0.0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
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
    
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Java for complete Idiots", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I learned all my Java from it.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    
    @Test
    public void demo()
    {
        SalesItem item1 = new SalesItem("C for beginner", 15000000);
        assertEquals(true, item1.addComment("Daniel", "Good product!", 5));
        item1.showInfo();
        assertEquals(false, item1.addComment("Prabroro", "Nope, this is garbage", 0));
        assertEquals(false, item1.addComment("Daniel", "Good product! (again)", 4));
        item1.findMostHelpfulComment();
    }
}