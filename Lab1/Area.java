import java.util.Scanner;
class Area{
	double Length;
	double Width;
	Area(double Length,double Width)
	{
		this.Length = Length;
		this.Width = Width;
	}
	public double returnArea()
	{
		return Length*Width;
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		System.out.println("Enter The Length Of Rectangle : ");
		double Length = S.nextDouble();
		System.out.println("Enter The Breadth Of Rectangle : ");
		double Width = S.nextDouble();	
		//Area Object
		Area area = new Area(Length,Width);
		//Printing Area
		System.out.println("Area Of The Rectangle : "+area.returnArea());
	}
}