public class DigitalRoot {
    public static int digital_root(int n) {
        int sum=0;
        int m=0;
        while(n>0){
            m=n%10;
            sum+=m;
            n=n/10;
        }
        if(sum>9)
        {
            return digital_root(sum);
        }
        else{
            return sum;
        }
    }