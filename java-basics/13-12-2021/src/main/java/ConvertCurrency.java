
public class ConvertCurrency {
    public double rupeesToDollar(double currencyInRupees) {
        return currencyInRupees /74.85;
    }
    public double dollarToRupees(double currencyInDollar) {
        return currencyInDollar * 74.85;
    }

    public double addMoney(double moneyInRupees) {
        double wallet=0;
        if(wallet == 0) {
            wallet=moneyInRupees;
        } else {
            wallet=wallet+moneyInRupees;
        }
        return wallet;
    }
    public double retrieveMoney(double Amount){
        double amountInRupees=74.85, amountInDollar=1, otherAmountInRupees= 149.7;
        double retrieveMoney=0;
        if(Amount==amountInRupees || Amount==amountInDollar || Amount==otherAmountInRupees) {
            retrieveMoney=Amount;
        }
        return retrieveMoney;
    }
}
