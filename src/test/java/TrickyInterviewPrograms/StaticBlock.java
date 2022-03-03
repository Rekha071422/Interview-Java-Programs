package TrickyInterviewPrograms;

/*Q1. Explain static blocks in Java ?
 * Static Block will always excute the before main method and Its written with Static keyword
 * We can write multiple static blocks in class and write static block before and after main method
 * 
*/
public class StaticBlock {

	static {
		System.out.println("Static Block");
		StaticBlock.test();
		test();
	}
	
	static {
		System.out.println("Static block2");
	}
	
	static {
		System.out.println("Static Block3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		test();
	}
	
	static {
		System.out.println("Static Block4");
	}
	
	/*How can we run a java program without making any object?
	 *  Yes we can do that
	 * */
	
	public static void test()
	{
		System.out.println("Test Method");
	}
	/*
	/Similarity and Difference between static block and static method ?
	 * Static block: it always executed before the main method,There is no need to create the object for static block
	 * Static method:It needs to create the object of class or call directly
	 * 
	 * How can we create objects if we make the constructor private ? 
	 * Yes, Creating the class object and calling the private variable using name
	  */
	private int age=20;
	/*Is it possible to compile and run a Java program without writing main( ) method? 
	 * Yes --Create one class with only static blocks and create another class with main method, in that create the staic blocks class object
	 * and call that class.
	 * 
	 * Can we initialize member variables within static block ?
	 * Yes we can do that
	 * static int i;
	 * Static{
	 * i=10//It gives error because it's non static variable, So we need to create the object of class and initialize
	 * Test t-new Test();
	 * t.i=20;
	 * 
	 * */
	
			   
	
	

}
