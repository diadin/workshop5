package foo;

public class StudentConsumer {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setName("Ion");
		s1.setAge(24);
        System.out.println("hello "+ s1.getName()); 
// <<<<<<< HEAD
        StudentConsumer.displayAge(s1);
//=======
        System.out.println("hello?");
//>>>>>>> branch 'master' of https://github.com/diadin/workshop5.git
      //  System.out.println("hello");
	}
	
	public static void displayAge(Student s){
	    long age = s.getAge();
		System.out.println(age );
	}

}
