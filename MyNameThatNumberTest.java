import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class TestNumbers {
    @Test
    public void basicTests() {
      assertEquals("10 must be supported and return \"ten\"", MyNameThatNumber.nameThatNumber(10), "ten");
      assertEquals("93 must be supported and return \"ninety three\"", MyNameThatNumber.nameThatNumber(93), "ninety three");
      assertEquals("0 must be supported and return \"zero\"", MyNameThatNumber.nameThatNumber(0), "zero");
    }
}

