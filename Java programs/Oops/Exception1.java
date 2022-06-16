package Oops;

public class Exception1 {

	public static void main(String[] args) {
		 try {
	            int divide = 117 / 0;
	            System.out.println("Hello");
	        } catch (ArithmeticException e) {
	            System.out.println("Error has occured");
	        } finally {
	            System.out.println("Finally will be rectified.");
	        }

	}

}
