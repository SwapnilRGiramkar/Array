//This is the Example of Reverse Array
//Example-->
import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,6};
        int [] arr2=new int [arr.length];
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            arr2[arr.length-i-1]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
