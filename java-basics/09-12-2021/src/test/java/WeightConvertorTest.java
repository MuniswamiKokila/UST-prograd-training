import com.architect.WeightConvertor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class WeightConvertorTest {
    WeightConvertor weightConvertor;
    @Nested
    public class TestWeightMeasurements{
        @Nested
        public class TestDifferentWeights{
            @Test
            public void checkIfOneGramIsEqualToOneGram(){
                weightConvertor=new WeightConvertor(1);
                double actualValue=weightConvertor.gramToGram();
                double expectedValue=1;
                Assertions.assertEquals(expectedValue,actualValue);
            }
            @Test
            public void checkIfZerPointOneKilogramIsEqualToOneHundredGram(){
                weightConvertor=new WeightConvertor(0.1);
                double actualValue=weightConvertor.kilogramToGram();
                double expectedValue=100;
                Assertions.assertEquals(expectedValue,actualValue);
            }
            @Test
            public void checkAdditionOfTenGramAndOneKilogramIsThousandAndTenGrams(){
                weightConvertor=new WeightConvertor(1);
                double actualValue=10+weightConvertor.kilogramToGram();
                double expectedValue=1010;
                Assertions.assertEquals(expectedValue,actualValue);
            }
            @Test
            public void checkSubtractionOfOnePointFiveKilogramAndFiveHundredGramIsOneKilogram(){
                weightConvertor=new WeightConvertor(500);
                double actualValue=1.5-weightConvertor.gramToKilometer();
                double expectedValue=1;
                Assertions.assertEquals(expectedValue,actualValue);
            }
        }
    }
}
