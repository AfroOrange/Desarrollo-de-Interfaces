package dad.codewars.kyu6;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Find_itTest {

    private find_it FindIt;

    @Before
    public void setup() {
        FindIt = new find_it();
    }

    @Test
    public void test1() {
        assertEquals(1000, FindIt.solution(0,1000));
    }

    @Test
    public void test1() {
        assertEquals(1000, FindIt.solution(0,1000));
    }
}
