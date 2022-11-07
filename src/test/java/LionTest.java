import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensReturnOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeReturnTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }


    // Юзлесс тест, проверяется в  Feline, но уже написал, не буду стирать. Вызывает метод мока, а не класса Lion
    @Test
    public void getFoodReturnListOfMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> meat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(meat);
        assertEquals(meat, lion.getFood());
    }

    @Test(expected = Exception.class)
    public void doesHaveManeExceptionTestMin() throws Exception {
        Lion lion = new Lion("МужчинаЛев", feline);
        lion.doesHaveMane();
    }
}
