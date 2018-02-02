import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentClass {

	String DeptName;
	List<ParentClassStudents> students;

	void createDept(String DeptName, List<ParentClassStudents> students)
	{
		this.DeptName = DeptName;
		this.students = students;
	}

	void displayStudents(StudentClass studentClass) {
		System.out.println("Dept Name : " + this.DeptName);
		List<ParentClassStudents> stu = studentClass.students;
		for(ParentClassStudents stu1 : stu)
		{
		
			System.out.println("Name : "+ stu1.name + " Age : "+ stu1.age +  " gender : "+ stu1.gender);
			
		}
       

	}
	
	public static void main(String args[])
	{
		ParentClassStudents p1 = new ParentClassStudents("Sathya", 37, "male");
		ParentClassStudents p2 = new ParentClassStudents("kavitha", 28, "female");
		ParentClassStudents p3 = new ParentClassStudents("Thanya", 3, "female");
		List<ParentClassStudents>  studs = new ArrayList();
		studs.add(p1);
		studs.add(p2);
		studs.add(p3);
		StudentClass st =  new StudentClass();
		st.createDept("Computer Science", studs);
		st.displayStudents(st);
		
		
	}

}
