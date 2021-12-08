package com.shape;


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    Square square;

    @Nested
    class TestArea {

            @Test
            public void AreaOfSideValuesThreeIsNine() {
                square = new Square(3);
                double actualArea = square.area();
                double expectedArea = 9;
                assertEquals(expectedArea, actualArea);
            }

            @Test
            public void AreaOfSideValuesMinusThreeGivesError() {
                assertThrows(IllegalArgumentException.class, () -> new Square(-3));
            }
        }

        @Nested
        class TestPerimeter {

                @Test
                public void PerimeterOfSideValuesThreeIsNine() {
                    square = new Square(3);
                    double actualPerimeter = square.perimeter();
                    double expectedPerimeter = 12;
                    assertEquals(expectedPerimeter, actualPerimeter);
                }

                @Test
                public void AreaOfSideValuesMinusThreeGivesError() {
                    assertThrows(IllegalArgumentException.class, () -> new Square(-3));
                }
            }


    }

