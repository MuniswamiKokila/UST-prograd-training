import com.converter.CurrencyConverter;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static java.lang.System.exit;

public class ConvertCurrency {
    public static void main(String[] args) throws IOException {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Scanner sc = new Scanner(System.in);
        Logger logger=Logger.getLogger("MyLog");
        FileHandler fileHandler;
        fileHandler=new FileHandler("log.txt");
        logger.addHandler(fileHandler);
        SimpleFormatter formatter=new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.info("Program Started.......");
        int choice;
        while (true){
            System.out.println("\n1.INR To USD");
            System.out.println("2.USD To INR");
            System.out.println("3.INR To AUD");
            System.out.println("4.AUD To INR");
            System.out.println("5.INR To CAD");
            System.out.println("6.CAD To INR");
            System.out.println("7.INR To KRW");
            System.out.println("8.KRW To INR");
            System.out.println("0.Exit");
            System.out.println("Enter your Choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    logger.info("User wanted to convert INR to USD");
                    System.out.println(" Enter Amount in INR");
                    double amountInRupees = sc.nextDouble();
                    logger.info("User Entered Amount of: " +amountInRupees);
                    if (amountInRupees <= 0) {
                        throw new IllegalArgumentException("amount cannot be negative");
                    } else
                        System.out.printf(" Amount in USD %.2f" ,currencyConverter.rupeesToDollar(amountInRupees));
                    break;
                case 2:
                    logger.info("User wanted to convert USD to INR");
                    System.out.println("Enter Amount in USD");
                    double amountInUSD = sc.nextDouble();
                    logger.info("User Entered Amount of: " +amountInUSD);
                    if (amountInUSD <= 0) {
                        throw new IllegalArgumentException("amount cannot be negative");
                    } else
                        System.out.printf(" Amount in INR %.2f" ,currencyConverter.dollarToRupees(amountInUSD));
                    break;
                case 3:
                    logger.info("User wanted to convert INR to AUD");
                    System.out.println("Enter Amount in INR to convert it to AUD");
                    double amountInINR = sc.nextDouble();
                    logger.info("User Entered Amount of: " +amountInINR);
                    if (amountInINR <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative");
                    else
                        System.out.printf(" Amount in AUD %.2f " , currencyConverter.rupeesToAustralianDollar(amountInINR));
                    break;
                case 4:
                    logger.info("User wanted to convert AUD to INR");
                    System.out.println("Enter Amount in AUD");
                    double amountInAUD = sc.nextDouble();
                    logger.info("User Entered Amount of: " +amountInAUD);
                    if (amountInAUD <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative");
                    else
                        System.out.printf(" Amount in INR %.2f " ,currencyConverter.australianDollarToRupees(amountInAUD));
                    break;
                case 5:
                    logger.info("User wanted to convert INR To CAD");
                    System.out.println("Enter Amount in INR to convert it to CAD");
                    amountInINR = sc.nextDouble();
                    logger.info("User Entered Amount of: " +amountInINR);
                    if (amountInINR <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative");
                    else
                        System.out.printf(" Amount in CAD %.2f " , currencyConverter.rupeesToCanadianDollar(amountInINR));
                    break;
                case 6:
                    logger.info("User wanted to convert CAD to INR");
                    System.out.println("Enter Amount in CAD");
                    double amountInCAD = sc.nextDouble();
                    logger.info("User Entered Amount of: " +amountInCAD);
                    if (amountInCAD <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative or zero");
                    else
                        System.out.printf(" Amount in INR %.2f " , currencyConverter.canadianDollarToRupees(amountInCAD));
                    break;
                case 7:
                    logger.info("User wanted to convert INR to KRW");
                    System.out.println("Enter Amount in INR");
                    amountInINR = sc.nextDouble();
                    logger.info("User Entered Amount of: " +amountInINR);
                    if (amountInINR <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative or zero");
                    else
                        System.out.printf(" Amount in WON %.2f " , currencyConverter.rupeesToSouthKoreanWon(amountInINR));
                    break;
                case 8:
                    logger.info("User wanted to convert KRW to INR");
                    System.out.println("Enter Amount in WON");
                    double amountInKRW = sc.nextDouble();
                    logger.info("User Entered Amount of: " +amountInKRW);
                    if (amountInKRW <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative or zero");
                    else
                        System.out.printf(" Amount in INR %.2f " , currencyConverter.southKoreanWonToRupees(amountInKRW));
                    break;
                case 0: exit(0);
                default:
                    System.out.println("Enter correct Input");
                    break;
            }
            logger.info("Program Stopped...");
        }
    }
}