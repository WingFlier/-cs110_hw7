package utils;

public class Math
{
    public static long factorial(long num)
    {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

    public static long factorialLoop(int num)
    {
        long fact = 1;
        while (num != 1)
        {
            fact *= num;
            num--;
        }
        return fact;
    }
}