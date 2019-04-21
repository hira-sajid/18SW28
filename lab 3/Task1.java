//task 1 lab 3
import java.util.Scanner;
class Task1
{
	public static void main (String[]args)
	{
	int marksobtained;
	char grade='a';
	Scanner input=new scanner(System.in);
	System.out.println("enter your obtained marks:");
	marksobtained=input.nextInt();
	double perc = marksobtained*100/300;
	if(perc>90)
	{
		grade='A';

	}
	else if (perc>70 && perc<79)
	{
		grade ='B';

	}
	else if ( perc>60 && perc<69 )
	{
	grade ='C';
		
	}	
	else if(perc<60)
	{
		grade='F';

	}
	System.out.println("grade");
	}

	}
