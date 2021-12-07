import com.rectangle.Area;
import com.rectangle.Perimeter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Perimeter perimeter;
    private Area area;
    @BeforeEach
    public void setUp(){
        area =new Area();
        perimeter= new Perimeter();
    }
    @Nested
    public class CalculatingAreaOfRectangle {
        @Test
        public void areaOfLengthThreeAndBreadthSixIsEighteen() {
            setUp();
            double result = area.areaOfRectange(3, 6);
            double expected = 18;
            Assertions.assertEquals(result, expected);
        }
        @Test
        public void areaOfLengthSixAndBreadthSixIsThirtySix() {
            setUp();
            double result = area.areaOfRectange(6, 6);
            double expected = 36;
            Assertions.assertEquals(result, expected);
        }

        @Test
        public void areaOfLengthMinusOneAndBreadthSixIsMinusSix() {
            setUp();


            Assertions.assertThrows(Exception.class, () -> area.areaOfRectange(-1,6));
        }

        @Test
        public void areaOfLengthZeroAndBreadthNineIsZero() {
            setUp();
            Assertions.assertThrows(Exception.class,() -> area.areaOfRectange(0, 9));

        }
    }
    @Nested
    public class CalculatingPerimeterOfRectangle{
        @Test
        public void perimeterOfLengthThreeAndBreadthSixIsEighteen(){
            setUp();
            double result=perimeter.perimeterOfRectangle(3,6);
            double expected=18;
            Assertions.assertEquals(result,expected);
        }
        @Test
        public void perimeterOfLengthSixAndBreadthSixIsTwentyFour(){
            setUp();
            double result=perimeter.perimeterOfRectangle(6,6);
            double expected=24;
            Assertions.assertEquals(result,expected);
        }
        @Test
        public void perimeterOfLengthZeroAndBreadthZeroIsError(){
            setUp();
            Assertions.assertThrows(Exception.class,() -> perimeter.perimeterOfRectangle(0,0));
        }
        @Test
        public void perimeterOfLengthMinusThreeAndBreathMinusTwoIsError(){
            setUp();
            Assertions.assertThrows(Exception.class,() -> perimeter.perimeterOfRectangle(-3,-2));
        }
        @Test
        public void perimeterOfLengthMinusTwoAndBreathMinusThreeIsError(){
            setUp();
            Assertions.assertThrows(Exception.class,() -> perimeter.perimeterOfRectangle(-2,-3));
        }
        @Test
        public void perimeterOfLengthMinusTwoAndTwoIsError(){
            setUp();
            Assertions.assertThrows(Exception.class,() -> perimeter.perimeterOfRectangle(-2,2));
        }
        @Test
        public void perimeterOfLengthTenAndMinusElevenIsError(){
            setUp();
            Assertions.assertThrows(Exception.class, () -> perimeter.perimeterOfRectangle(10,-11));
        }
    }
}
