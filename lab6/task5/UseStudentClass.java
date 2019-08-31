public class UseStudentClass{
	public static void main(String[]args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		Student s7=new Student();
		Student s8=new Student();
		Student s9=new Student();
		Student s10=new Student();
		s1.setInfo("Hira",18,"113,MUET Girls Hostel");
		s2.setInfo("Hania",18,"135,MUET Girls Hostel");
		s3.setInfo("Aemon",19,"B-23,Defence,Karachi");
		s4.setInfo("Dua",18,"A-21,Latifabad no 9, Hyderabad");
		s5.setInfo("Neha",18,"B-12,Latifabad no 8,Hyderabad");
		s6.setInfo("Nittalia",20,"B-23, Barrage Colony,Sukkur");
		s7.setInfo("Amna",19,"113,MUET Girls Hostel");
		s8.setInfo("Laiba",17,"A-218,Muslim Society,Hyderabad");
		s9.setInfo("Ayesha",16,"B-29,Gulistan-e-Sajjad,Hyderabad");
		s10.setInfo("Tooba",11,"201,MUET Girls Hostel");
		Student []std={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		int j=0; //to show the number of students 
		for(int i=0;i<std.length;i++){
			System.out.println("\tStudent: "+ (++j));
			std[i].showInfo();
		}
	}
}