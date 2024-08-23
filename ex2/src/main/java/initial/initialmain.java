package initial;

public class initialmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student();
		s.setName("Saba");
		s.setFamily("Mahboob");
		Grade g =new Grade(10.75f, 11.5f);
		Display d= new Display();
		System.out.println(d.displyMygrade(s,g));

	}

}
