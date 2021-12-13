import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertCurrencyTest {
    ConvertCurrency convertCurrency = new ConvertCurrency();
    @Nested
    class TestingCurrencyConverter {
        @Test
        public void checkSeventyFourPointEightFiveIsEqualToOneDollar() {

            double actualCurrency = convertCurrency.rupeesToDollar(74.85);
            double expectedCurrency = 1;
            assertEquals(expectedCurrency, actualCurrency);
        }
    }
    @Nested
    class AddingAmount{
        @Test
        public void addingMoneyToWallet(){
            double actualCurrency=convertCurrency.addMoney(100);
            double expectedCurrency=actualCurrency;
            assertEquals(expectedCurrency,actualCurrency);
        }
    }
    @Nested
    class TestingAdditionOfCurrency{
        @Test
        public void checkAdditionOfFiftyRupeesAndOneDollarIsOneTwentyFourPointEightFive(){
            double actualCurrency=50 + convertCurrency.dollarToRupees(1);
            double expectedCurrency=124.85;
            assertEquals(expectedCurrency,actualCurrency);
        }

        @Test
        public void checkAdditionOfSeventyFourPointEightFiveRupeesAndOneDollarAndOneFortyNinePointSeven(){
            double actualCurrency=convertCurrency.rupeesToDollar(74.85) + 1 + convertCurrency.rupeesToDollar(149.7);
            double expectedCurrency=4;
            assertEquals(expectedCurrency,actualCurrency);
        }
    }
    @Nested
    class RetrievingAmount{
        @Test
        public void retrieveTheMoneyFromWallet(){
            double actualCurrency=convertCurrency.retrieveMoney(1);
            double expectedCurrency=1;
            assertEquals(expectedCurrency,actualCurrency);
        }
    }

}