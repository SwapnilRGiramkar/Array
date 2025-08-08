//This Program gives Union elements of an Array
//Example->
import java.util.Arrays;

public class Union
{
    public static void main (String[]args)
    {
        int count = 0;
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8, 9};

        boolean[] check = new boolean[a.length + b.length-count];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                {
                    check[j] = true;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(check));

        int[] ans = new int[a.length + b.length - count];
        for (int i = 0, j = 0; i < ans.length; ) {
            if (i < a.length) {
                ans[i] = a[i];
                i++;
            }
            else
            {
                if (!check[j])
                {
                    ans[i] = b[j];
                    i++;
                    j++;
                }
                else
                {
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}

