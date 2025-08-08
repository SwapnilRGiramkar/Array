//Bubble Sort using java language
//Example
import java.util.Arrays;

public class BuubleSort
{
    public static void main(String[] args)
    {
        int []a={17,56,12,45,3,4,2,1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            boolean flag=false;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    flag=true;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(!flag)
            {
                break;
            }
        }
    }
}

