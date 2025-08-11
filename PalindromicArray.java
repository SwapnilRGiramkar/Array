//This is the Example of Palindromic Array
//Example--->
import java.util.Arrays;

public class PalindromicArray
{
    public static void main(String[] args)
    {
        int [] arr={1,2,3,2,1};
        boolean isPalindrome=true;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]!=arr[arr.length-i-1])
           {
               isPalindrome=false;
               break;
           }
        }
        if(isPalindrome)
        {
            System.out.println("Its Palindrome");
        }
        else {
            System.out.println("Its Not Palindrome");
        }
    }
}

