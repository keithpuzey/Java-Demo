/*Creating a failure test case*/
import org.junit.Test;
import static org.junit.Assert.*;

public class AppFailTest2 {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
