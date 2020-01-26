import java.util.Arrays;
class Lab2Task1
{
	public static void main(String[] args)
	{
		int[] Array = new int[50];
		int count =0;
		int insert=0;
		while(count<50)
		{
			Array[count]=insert;
			count++;
			insert=insert+2;
		}
		System.out.println(Arrays.toString(Array));
	}
}
