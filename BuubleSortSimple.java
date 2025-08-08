//This is Example of Bubble Sort without using time complexity and Space complexity
//Example---->
import java.util.Arrays;

public class BubbleSortSimple
{
    public static void main(String[] args)
    {
        int []a={9,8,7,6,5,45,67,3,2,1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = 0; j < nums.length - i - 1; j++)
            {
                if(nums[j]>nums[j+1])
                {
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                }
            }
        }
    }
}

