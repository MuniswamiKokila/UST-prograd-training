import com.architect.MeasurementConvertor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class LengthConvertorTest {
    MeasurementConvertor measurementConvertor = new MeasurementConvertor();
    @Nested
    public class TestLengthMeasurements {
        @Nested
        public class TestDifferentLengths {
            @Test
            public void TestingOneCentimeterIsEqualToOneCentimeter() {
                double actualValue = measurementConvertor.centiToCenti(1);
                double expectedValue = 1;
                Assertions.assertEquals(expectedValue, actualValue);
            }

            @Test
            public void TestingOneMeterIsEqualToOneCentimeter() {
                double actualValue = measurementConvertor.baseToCenti(1);
                double expectedValue = 100;
                Assertions.assertEquals(expectedValue, actualValue);
            }

            @Test
            public void TestingOneHundredCmIsEqualToZeroPointZeroZeroOneKilometers() {
                double actualValue = measurementConvertor.centiToKilo(100);
                double expectedValue = 0.001;
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }

        @Nested
        public class AddingLengths {
            @Test
            public void checkAdditionOfOneMeterAndOneHundredCentimetersIsTwoMeters() {
                double actualValue = 1 + measurementConvertor.centiToBase(100);
                double expectedValue = 2;
                Assertions.assertEquals(expectedValue, actualValue);
            }

            @Test
            public void checkAdditionOfTwoHundredCentimeterAndOneKilometerIsOneLakhTwoHundredCentimeter() {
                double actualValue = 200 + measurementConvertor.kiloToCenti(1);
                double expectedValue = 100200;
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }

        @Nested
        public class SubtractingLengths {
            @Test
            public void checkSubtractionOfOneMeterAndFiftyCentimetersIsZeroPointFiveMeters() {
                double actualValue = 1 - measurementConvertor.centiToBase(50);
                double expectedValue = 0.5;
                Assertions.assertEquals(expectedValue, actualValue);
            }

            @Test
            public void checkSubtractionOfTwoThousandCentimeterAndOneMeterIsNineteenHundredCentimeter() {
                double actualValue = 2000 - measurementConvertor.baseToCenti(1);
                double expectedValue = 1900;
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }
    }
}





















// For All Test Cases

//import com.architect.Architect;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//
//public class ArchitectTest {
//    Architect architect;
//    @Nested
//    public class TestingCentimeter {
//        @Nested
//        public class TestingCentimeterToCentimeter {
//            @Test
//            public void testingOneCentimeterIsEqualToOneCentimeter() {
//                architect = new Architect(1);
//                double actualValue = architect.centimeterToCentimeter();
//                double expectedValue = 1;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//
//            @Test
//            public void testingTwoCentimeterIsEqualToTwoCentimeter() {
//                architect = new Architect(2);
//                double actualValue = architect.centimeterToCentimeter();
//                double expectedValue = 2;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//            @Test
//            public void checkIfErrorWhenValueIsZero(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(0));
//            }
//            @Test
//            public void checkIfErrorWhenValueIsNegative(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(-2));
//            }
//        }
//
//        @Nested
//        public class TestingCentimeterToMeter {
//            @Test
//            public void TestingOneCentimeterIsEqualToZeroPointZeroZeroOneMeter() {
//                architect = new Architect(1);
//                double actualValue = architect.centimeterToMeter();
//                double expectedValue = 0.01;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//
//            @Test
//            public void TestingTwoCentimeterIsEqualToZeroPointZeroZeroTwoMeter() {
//                architect = new Architect(2);
//                double actualValue = architect.centimeterToMeter();
//                double expectedValue = 0.02;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//            @Test
//            public void checkIfErrorWhenValueIsZero(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(0));
//            }
//            @Test
//            public void checkIfErrorWhenValueIsNegative(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(-2));
//            }
//        }
//
//        @Nested
//        public class TestingCentimeterToKilometer {
//            @Test
//            public void TestingOneCmIsEqualToZeroPointFiveZerosAndOne() {
//                architect = new Architect(1);
//                double actualValue = architect.centimeterToKilometer();
//                double expectedValue = 1.0E-5;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//
//            @Test
//            public void TestingTwoCmIsEqualToZeroPointFiveZerosAndTwo() {
//                architect = new Architect(2);
//                double actualValue = architect.centimeterToKilometer();
//                double expectedValue = 2.0E-5;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//            @Test
//            public void checkIfErrorWhenValueIsZero(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(0));
//            }
//            @Test
//            public void checkIfErrorWhenValueIsNegative(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(-2));
//            }
//        }
//    }
//    @Nested
//    public class TestingMeter {
//        @Nested
//        public class TestingMeterToCentimeter {
//            @Test
//            public void TestingOneMeterIsEqualToOneCentimeter() {
//                architect = new Architect(1);
//                double actualValue = architect.meterToCentimeter();
//                double expectedValue = 100;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//
//            @Test
//            public void TestingTwoMetersIsEqualToTwoCentimeters() {
//                architect = new Architect(2);
//                double actualValue = architect.meterToCentimeter();
//                double expectedValue = 200;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//            @Test
//            public void checkIfErrorWhenValueIsZero(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(0));
//            }
//            @Test
//            public void checkIfErrorWhenValueIsNegative(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(-2));
//            }
//        }
//
//        @Nested
//        public class TestingMeterToMeter {
//            @Test
//            public void TestingOneMeterIsEqualToOneMeter() {
//                architect = new Architect(1);
//                double actualValue = architect.meterToMeter();
//                double expectedValue = 1;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//
//            @Test
//            public void TestingTwoMeterIsEqualToTwoMeters() {
//                architect = new Architect(2);
//                double actualValue = architect.meterToMeter();
//                double expectedValue = 2;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//            @Test
//            public void checkIfErrorWhenValueIsZero(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(0));
//            }
//            @Test
//            public void checkIfErrorWhenValueIsNegative(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(-2));
//            }
//        }
//
//        @Nested
//        public class TestingMeterToKilometer {
//            @Test
//            public void TestingOneMeterIsEqualToZeroPointZeroZeroOneKilometer() {
//                architect = new Architect(1);
//                double actualValue = architect.meterToKilometer();
//                double expectedValue = 0.001;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//
//            @Test
//            public void TestingTwoMetersIsEqualToZeroPointZeroZeroTwoKilometer() {
//                architect = new Architect(2);
//                double actualValue = architect.meterToKilometer();
//                double expectedValue = 0.002;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//            @Test
//            public void checkIfErrorWhenValueIsZero(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(0));
//            }
//            @Test
//            public void checkIfErrorWhenValueIsNegative(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(-2));
//            }
//        }
//    }
//    @Nested
//    public class TestingKilometer {
//        @Nested
//        public class TestingKilometerToCentimeter {
//            @Test
//            public void TestingOneKilometerIsEqualToOneLakhCentimeter() {
//                architect = new Architect(1);
//                double actualValue = architect.kilometerToCentimeter();
//                double expectedValue = 100000;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//
//            @Test
//            public void TestingTwoKilometersIsEqualToTwoLakhCentimeters() {
//                architect = new Architect(2);
//                double actualValue = architect.kilometerToCentimeter();
//                double expectedValue = 200000;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//            @Test
//            public void checkIfErrorWhenValueIsZero(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(0));
//            }
//            @Test
//            public void checkIfErrorWhenValueIsNegative(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(-2));
//            }
//        }
//
//        @Nested
//        public class TestingKilometerToMeter {
//            @Test
//            public void TestingOneKilometerIsEqualToOneThousandMeters() {
//                architect = new Architect(1);
//                double actualValue = architect.kilometerToMeter();
//                double expectedValue = 1000;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//
//            @Test
//            public void TestingTwoKilometerIsEqualToTwoThousandMeters() {
//                architect = new Architect(2);
//                double actualValue = architect.kilometerToMeter();
//                double expectedValue = 2000;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//            @Test
//            public void checkIfErrorWhenValueIsZero(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(0));
//            }
//            @Test
//            public void checkIfErrorWhenValueIsNegative(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(-2));
//            }
//        }
//
//        @Nested
//        public class TestingKilometerToKilometer {
//            @Test
//            public void TestingOneKilometerIsEqualToOneKilometer() {
//                architect = new Architect(1);
//                double actualValue = architect.kilometerToKilometer();
//                double expectedValue = 1;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//
//            @Test
//            public void TestingTwoKilometersIsEqualToTwoKilometer() {
//                architect = new Architect(2);
//                double actualValue = architect.kilometerToKilometer();
//                double expectedValue = 2;
//                Assertions.assertEquals(expectedValue, actualValue);
//            }
//            @Test
//            public void checkIfErrorWhenValueIsZero(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(0));
//            }
//            @Test
//            public void checkIfErrorWhenValueIsNegative(){
//                Assertions.assertThrows(IllegalArgumentException.class,() -> new Architect(-2));
//            }
//        }
//    }
//
//}
