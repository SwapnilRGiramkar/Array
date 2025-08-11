//This is the Example Of Rotate Array
//Example--->
import java.util.Arrays;
public class RotateArray
{
    public static int[] rotateLeft(int[]arr)
    {
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static int[]  rotateRight(int[]arr)
    {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,6};
        //System.out.println(Arrays.toString(rotateLeft(arr)));
        System.out.println(Arrays.toString(rotateRight(arr)));
    }
}

