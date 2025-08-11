//Rotating the Array Nth Times
//Example--->
import java.util.Arrays;
import java.util.Scanner;
public class RoatateArrayNTimes
{
    public static int[] rotateLeft(int[] arr)
    {
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static int[] RoatateRight(int []arr)
    {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }
    public static int[] rotateNTimeLeft(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            rotateLeft(arr);
        }
        return arr;
    }
    public static void main(String[]args)
    {
        int []arr={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("how many time you want to rotate the array");
        int n=sc.nextInt();
        System.out.println(Arrays.toString(rotateNTimeLeft(arr,n)));
    }
}

