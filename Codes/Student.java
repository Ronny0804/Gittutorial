class Student{
	Student(){
		this(5);
		System.out.println("hello user");
	}
	Student(int x){
		System.out.println(x);
	}
}
class Test{
	public static void main(String[] args) {
		Student s= new Student();
	}
}