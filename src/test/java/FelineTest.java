import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Test
    public void eatMeatReturnListMeat() throws Exception {
        Feline feline = new Feline();
        List<String> meat = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(meat, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnString() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturnOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensReturnCount() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }

}
