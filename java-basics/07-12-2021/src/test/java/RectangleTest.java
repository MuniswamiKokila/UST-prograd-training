import com.rectangle.Area;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    private Area area;
    @BeforeEach
    public void setUp(){
        area =new Area();
    }
    @Nested
    public class CalculatingAreaOfRectangle {
        @BeforeEach
        public void setUp(){
            area =new Area();
        }
        @Test
        public void areaOfLengthThreeAndSixIsEighteen() {
            setUp();
            double result = area.areaOfRectange(3, 6);
            double expected = 18;
            Assertions.assertEquals(result, expected);
        }
        @Test
        public void areaOfLengthSixAndSixIsThirtySix() {
            setUp();
            double result = area.areaOfRectange(6, 6);
            double expected = 36;
            Assertions.assertEquals(result, expected);
        }

        @Test
        public void areaOfLengthMinusOneAndSixIsMinusSix() {
            setUp();


            Assertions.assertThrows(Exception.class, () -> area.areaOfRectange(-1,6));
        }

        @Test
        public void areaOfLengthZeroAndNineIsZero() {
            setUp();
            Assertions.assertThrows(Exception.class,() -> area.areaOfRectange(0, 9));

        }
    }
}
