import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundReturnString() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnListPredator() throws Exception {
        Cat cat = new Cat(feline);
        List<String> meat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(meat);
        assertEquals(meat, cat.getFood());
    }
}
