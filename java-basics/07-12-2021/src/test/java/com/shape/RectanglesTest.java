package com.shape;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanglesTest {
    Rectangle rectangle;
    @Nested
    class TestArea{

        @Test
        public void checkAreaIsTenWhenLengthIsTwoAndBreadthIsFive(){
            rectangle=new Rectangle(2,5);
            double actualArea = rectangle.area();
            double expectedArea = 10;
            assertEquals(expectedArea , actualArea);
        }
        @Test
        public void checkAreaIsWhenLengthIsThreeAndBreadthIsSix(){
            rectangle=new Rectangle(3,5);
            double actualArea = rectangle.area();
            double expectedArea = 15;
            assertEquals(expectedArea , actualArea);
        }
        @Test
        public void checkAreaIsWhenLengthIsThreeAndBreadthIsThree(){
            rectangle=new Rectangle(3,3);
            double actualArea = rectangle.area();
            double expectedArea = 9;
            assertEquals(expectedArea , actualArea);
        }

        @Test
        public void checkAreaIsErrorWhenLengthIsMinusTwoAndBreadthIsFive(){

            assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2,5));
        }
        @Test
        public void checkAreaIsErrorWhenLengthIsZeroAndBreadthIsZero(){

            assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,0));
        }

    }

    @Nested
    class TestPerimeter{

        @Test
        public void checkPerimeterIsFourteenWhenLengthIsTwoANdBreadthIsFive(){
        rectangle=new Rectangle(2,5);
        double actualPerimeter = rectangle.perimeter();
        double expectedPerimeter = 14;
        assertEquals(expectedPerimeter , actualPerimeter);
    }
        @Test
        public void checkPerimeterIsFourteenWhenLengthIsThreeANdBreadthIsSix(){
            rectangle=new Rectangle(3,6);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 18;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
        @Test
        public void checkPerimeterIsTwelveWhenLengthIsThreeANdBreadthIsThree(){
            rectangle=new Rectangle(3,3);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 12;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
        @Test
        public void checkPerimeterIsErrorWhenLengthIsMinusTwoAndBreadthIsFive(){

            assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2,5));
        }
        @Test
        public void checkPerimeterIsErrorWhenLengthIsZeroAndBreadthIsZero(){

            assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,0));
        }
    }

}