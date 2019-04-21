// task 4 lab 3
class Task4{
	public static void main(String[]args){
		int Firstno=Integer.paresInt(args[0]);
		int Secondno=Integer.parseInt(args[1]);
		char Operator=args[2].charAt(0);
		System.out.println(args[0]+args[2]+args[1]);



		switch (Operator){
			case '+':
			System.out.println(Firstno+Secondno);
			break;
			case'-':
			System.out.println(Firstno-Secondno);
			break;
			case'*':
			System.out.println(Firstno*Secondno);
			break;
			case'/':
			System.out.println(Firstno/Secondno);
			break;
			default:
			System.out.println("invilid entry");

		}
	}
}