 public static String timeInWords(int h, int m) {
    String[] number = new String[]  {
                            "zero", "one", "two", "three", "four",
                            "five", "six", "seven", "eight", "nine",
                            "ten", "eleven", "twelve", "thirteen",
                            "fourteen", "fifteen", "sixteen", "seventeen",
                            "eighteen", "nineteen", "twenty", "twenty one",
                            "twenty two", "twenty three", "twenty four",
                            "twenty five", "twenty six", "twenty seven",
                            "twenty eight", "twenty nine"
                        };
     
        if (m == 0)
           { return (number[h] + " o' clock ");}
     
        else if (m == 1)
            {return ("one minute past " + number[h]);}
     
        else if (m == 59)
           {return ("one minute to " + number[(h % 12) + 1]);}
     
        else if (m == 15)
            {return ("quarter past " + number[h]);}
     
        else if (m == 30)
           {return ("half past " + number[h]);}
     
        else if (m == 45)
            {return ("quarter to " +  number[(h % 12) + 1]);}
                               
     
        else if (m <= 30)
           { return ( number[m] + " minutes past " +   number[h]);}
                                                  
     
        else if (m > 30)
        {return ( number[60 - m] + " minutes to " +  number[(h % 12) + 1]);  }
            
    return "";                         
    }
}