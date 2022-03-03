package TrickyInterviewPrograms;

/*Pass null arguments in method overloading with a type String or Object
In the case of null, null is valid for both string and object. So, which method will be called?
Object is a parent class and string is a child class. While resolving the overloading method, 
the compiler always uses the presidency for the child type argument. 
So, the compiler will call the method with the string argument.*/
public class NullArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test(null);
	}
	
	public static void test(Object o)
	{
		System.out.println("Object");
	}
	
	public static void test(String s) {
		System.out.println("String");
		
	}

}
