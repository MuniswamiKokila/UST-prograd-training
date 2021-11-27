public class SumOfCubes{
    public static long sumCubes(long n)
    {
        long sum = 0;
        for (long x = 1; x <= n; x++)
            sum += x * x * x;
        System.out.print(sum);
        return sum;
    }
}