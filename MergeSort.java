//This is the Example of Merge Sort
//Example-->
import java.util.Arrays;

public class MergeSort
{
    public static void main(String[]aq)
    {
        int []ar={9,8,7,6,5,4,3,2,1};

        conquare(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));

    }
    public static void conquare(int[] a,int start,int end)
    {
        if(start>=end)return;

        int mid=(start+end)/2;
        conquare(a,start,mid);
        conquare(a,mid+1,end);
        devide(a,start,mid,end);

    }
    public static void devide(int[] a,int start,int mid,int end)
    {
        int []ans=new int[(end - start) + 1];
        int i=start,j=mid+1, k=0;
        while(i<=mid&&j<=end)
        {
            if(a[i]<=a[j])
            {
                ans[k++]=a[i++];
            }
            else if(a[i]>=a[j])
            {
                ans[k++]=a[j++];
            }
        }
        while(i<=mid)
        {
            ans[k++]=a[i++];
        }
        while(j<=end)
        {
            ans[k++]=a[j++];
        }
        for (i = 0; i < ans.length; i++) {
            a[start + i] = ans[i];
        }
    }
}

