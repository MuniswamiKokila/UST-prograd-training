
public class ConvertCurrency {
    public double rupeesToDollar(double currencyInRupees) {
        return currencyInRupees /74.85;
    }
    public double dollarToRupees(double currencyInDollar) {
        return currencyInDollar * 74.85;
    }

    public double addMoney(double Money,String Currency) {
        if (Money<=0 || !"rupees".equals(Currency) && !"dollars".equals(Currency)){
            throw new IllegalArgumentException("Invalid Currency or Money");
        }
        double wallet=0;
        if(Currency.equals("rupees")) {
            if (wallet == 0) {
                wallet = Money;
            } else {
                wallet = wallet + Money;
            }
        }
        else if(Currency.equals("dollars")){
            if (wallet == 0) {
                wallet = dollarToRupees(Money);
            } else {
                wallet = wallet + dollarToRupees(Money);
            }
        }
        return wallet;
    }
    public double retrieveMoney(double Amount, String Currency){
        double amountInRupees=74.85, amountInDollar=1, otherAmountInRupees= 149.7;
        double retrieveMoney;
        if(Amount==amountInRupees && Currency.equals("rupees") || Amount==amountInDollar && Currency.equals("dollars") || Amount==otherAmountInRupees && Currency.equals("rupees")) {
            retrieveMoney=Math.round(Amount * 100) / 100;
        }
        else {
            throw new IllegalArgumentException("This is not the specified amount");
        }
        return retrieveMoney;
    }
}
