//This is the example of Binary Search
//Example-->
import java.util.Arrays;

public class BinarySearch
{
    public static void main(String[]args)
    {
        int []ar={1,2,3,4,5,6,7,8,9};
        int find=5;
        search(ar,find);

    }
    public static void search(int[] a,int find)
    {

        int start=0;
        int end=a.length;
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(find==a[mid])
            {
              System.out.println("Element found at index: "+mid);
              break;
            }
            else if(find>a[mid])
            {
                start=mid+1;
            }
            else if(find<a[mid])
                end = mid - 1;
        }
        if(end < start)
        {
            System.out.println("NO Element Found");
        }
    }
}

