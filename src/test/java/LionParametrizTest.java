import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionParametrizTest {
    @Mock
    Feline feline;
    private final String sex;
    private final boolean expected;

    public LionParametrizTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

/*    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(feline);
    }*/

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Мужчина", true},
        };
    }

    @Test
    public void doesHaveManeParametrizedTest() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            assertEquals(expected, lion.doesHaveMane());
        } catch (Exception exceptionTest) {
            String expected = "java.lang.Exception: Используйте допустимые значения пола животного - самей или самка";
            assertEquals(expected, exceptionTest.toString());
        }
    }
}
