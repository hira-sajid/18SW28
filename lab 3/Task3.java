//  task 3 lab 3
import java.util.Scanner;
class Task3{
 public static void main( String[]args){
 	System.out.println("Enter a cheracter:");
 	Scanner sc = new Scanner (System.in);
 	char ch = sc.next().charAt(0);
 	switch (ch){
 		case 'a':
 		case 'e':
 		case 'i':
 		case 'o':
 		case 'u':
 		System.out.println(ch+" is vowel");
 		break;
 		default:
 		System.out.println( ch + " is constant");

 	
 }
	
}
	
}C:\Users\18sw28\DesktopN