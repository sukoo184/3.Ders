
public class Main {

	public static void main(String[] args) {
		Student student =new Student("��kran","Karakaya","sukooo123@gmail.com","123",1111111);

		Instructor �nstructor=new Instructor("Engin","Demirog","engin456@gmail.com","567","C#,Java");
		
		
		UserManager userManager=new UserManager();
		userManager.add(student);
		userManager.delete(student);
		userManager.update(student);
		
		
		StudentManager studentManager= new StudentManager();
		studentManager.login(student);
		
		InstructorManager �nstructorManager =new InstructorManager();
		�nstructorManager.login(�nstructor);

	
	
	
	}

}
