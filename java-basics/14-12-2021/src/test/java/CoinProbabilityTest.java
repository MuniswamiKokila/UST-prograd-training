
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CoinProbabilityTest {
    CoinProbability coinProbability=new CoinProbability();

    @Nested
    class TestEqualProbability{
        @Test
        public void checkProbabilityOfHeadIsEqualToProbabilityOfTailInACoinToss(){
            double actualProbability = coinProbability.probabilityEquality(1,2);
            double expectedProbability = 0.5;
            assertEquals(expectedProbability,actualProbability);
        }
    }
    @Nested
    class TestTwoEventsOccurring{
        @Test
        public void checkProbabilityOfTwoEventsOccurringTogetherInCoinToss(){
            double actualProbability = coinProbability.twoEventsOccurringTogether(1,1);
            double expectedProbability = 0.25;
            assertEquals(expectedProbability,actualProbability);
        }
    }

    @Nested
    class EventsNotOccurrence {

        @Test
        public void checkProbabilityOfHeadEventsOccurringInCoinToss() {
            double actualProbability = coinProbability.twoEventsNotOccurringTogether(1, 0);
            double expectedProbability = 0.5;
            assertEquals(expectedProbability, actualProbability);
        }

        @Test
        public void checkProbabilityOfSecondEventsOccurringInCoinToss() {
            double actualProbability = coinProbability.twoEventsNotOccurringTogether(0, 1);
            double expectedProbability = 0.5;
            assertEquals(expectedProbability, actualProbability);
        }
    }
    @Nested
    class EitherEventsOccurrence {

        @Test
        public void checkProbabilityOfEitherEventsOccurringInCoinToss() {
            double actualProbability = coinProbability.eitherEventsOccurring(1, 1);
            double expectedProbability = 0.75;
            assertEquals(expectedProbability, actualProbability);
        }

        @Test
        public void checkIfFavorableOutcomeIsZero() {
            assertThrows(IllegalArgumentException.class, () -> {
                coinProbability.probability(0, 2);
            });
        }
    }

}