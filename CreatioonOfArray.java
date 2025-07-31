//In this Program we can create a Array using index 
//example--->
package basics;

public class Day01 
{
	public static void main(String[] args) 
	{
		int[] var=new int[5];//declare and initilization statement of an array
		System.out.println(var[0]);
		System.out.println("-----------------------------------------------");
		var[0]=10;
		var[1]=20;
		var[2]=30;
		var[3]=40;
		var[4]=50;
		var[5]=60;//ArrayIndexOutOfBoundsException
		for(int index=0;index<var.length;index++)
		{
			System.out.println(var[index]);
		}
	}
}

