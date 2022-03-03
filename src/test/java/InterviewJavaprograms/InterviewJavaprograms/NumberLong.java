package InterviewJavaprograms.InterviewJavaprograms;

public class NumberLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long numberWithoutL=1000*65*65*365*89;//it takes 36 bit but interger range 32 bit and it will remove the firt 2 bits
		System.out.println(numberWithoutL);//189828472
		long numberwithL=1000*65*65*365*89L;//It takes 36 bits
		System.out.println(numberwithL);//137249125000
	}

}
