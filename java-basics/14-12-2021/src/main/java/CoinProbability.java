public class CoinProbability {
    double possibleOutcomes = 2;

    public double probability(double favorableOutcomes, double possibleOutcomes){
        if(favorableOutcomes == 0){
            throw new IllegalArgumentException(("Favorable Outcomes Cant be Zero"));
        }

        return favorableOutcomes/possibleOutcomes;

    }

    public double probabilityEquality(double favorableOutcomes, double possibleOutcomes){
        double tail = 1- (favorableOutcomes/possibleOutcomes);
        return  tail;
    }

    public double twoEventsOccurringTogether(double event1, double event2){
        return  probability(event1,possibleOutcomes) * probability(event2,possibleOutcomes);
    }

    public double twoEventsNotOccurringTogether(double event1, double event2){
        if(event1 ==1){
            return 1 - probability(event1,possibleOutcomes);
        }
        else {
            return 1 - probability(event2,possibleOutcomes);
        }
    }
    public double eitherEventsOccurring(double event1, double event2){
        return  probability(event1,possibleOutcomes) + probability(event2,possibleOutcomes) - twoEventsOccurringTogether(event1,event2);

    }
}


//    double possibilityOutComes=2;
//    String array[]={"H","T"};
//    public double probabilityEquality(String sideOfCoin) {
//        int count = 0,count1=0;
//        double result = 0, result1 = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].contains(sideOfCoin)) {
//                count++;
//                result = count++ / possibilityOutComes;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].contains("T")) {
//                count1++;
//                result1 = count1++ / possibilityOutComes;
//            }
//        }
//        return result1;
//    }

