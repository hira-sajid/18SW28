abstract class Shapes{
	abstract public void drawShapes();
	abstract public void eraseShapes();
}
class Triangle extends Shapes{
	public void drawShapes(){
		System.out.println("Draw Triangle");
	}

	public void eraseShapes(){
		System.out.println("Erase Triangle");
	}
}

class Square extends Shapes{
	public void drawShapes(){
		System.out.println("Draw Square");
	}

	public void eraseShapes(){
		System.out.println("Erase Square");
	}
}

class Lab1Task2{
	public static void main(String[] args) {
		Shapes S=new Triangle();
		Shapes S1=new Square();

		S.drawShapes();
		S.eraseShapes();
		S1.drawShapes();
		S1.eraseShapes();

	}
}