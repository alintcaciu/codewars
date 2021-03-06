//import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class SortDeckRanksTest {

	public class SortCardsTest {
		  private SortDeckRanks SortDeckRanks;
		  
		  @Before
		  public void setUp() throws Exception {
			  SortDeckRanks = new SortDeckRanks();
		  }

		  @After
		  public void tearDown() throws Exception {
			  SortDeckRanks = null;
		  }
		  
		  @Test
		  public void basicTests() {
		    /// Example test case
		    assertArrayEquals(new String []{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"}, SortDeckRanks.sortCards(new String []{"3", "9", "A", "5", "T", "8", "2", "4", "Q", "7", "J", "6", "K"}));
		    assertArrayEquals(new String []{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"}, SortDeckRanks.sortCards(new String []{"Q", "2", "8", "6", "J", "K", "3", "9", "5", "A", "4", "7", "T"}));
		    assertArrayEquals(new String []{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"}, SortDeckRanks.sortCards(new String []{"5", "4", "T", "Q", "K", "J", "6", "9", "3", "2", "7", "A", "8"}));
		  }
		}
	

	

}
