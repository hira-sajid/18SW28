public class MainClass{
	public static void main(String[]args)
	{
		Person p1=new Person("Hira","A-9, Prince town, Hyderabad");
		System.out.println(p1.toString());
		Student s1=new Student("Misbah","MUET Hostel","Software Engineering",2018,3200);
		System.out.println(s1.toString());
		Staff st=new Staff("Nittalia","MUET Society","Model School",19000);
		System.out.println(st.toString()); 
	}
}