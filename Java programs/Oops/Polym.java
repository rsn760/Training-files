package Oops;

public class Polym {
	 static String concat(String a,String b)
	    {
	        String c=a+b;
	        return c;
	    }
	    static int Add(int a, int b,int c)
	    {
	        int d=a+b+c;
	        return d;
	    }

	public static void main(String[] args) {
		 System.out.println("Concatinating two strings: "+concat("Raja","sekhar"));
	     System.out.println("Sum of salary a,b,c: "+Add(12000,8150,6500));

	}

}
