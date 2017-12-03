package utils;

public class ArrayUtils
{
    public static int[] reverse(int arr[])
    {
        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static String stringifyArray(int[] arr)
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
        {
            builder.append(arr[i]).append("");
            if (i != arr.length - 1) builder.append(", ");
        }
        return builder.toString();
    }
}