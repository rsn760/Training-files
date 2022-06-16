package Oops;

import java.io.*;
public class fwrite {
	
	
	    public static void main(String[] args) {
	        char [] arry=new char[87];
	        try{
	            FileInputStream f2=new FileInputStream("D:\\java.txt");
	            InputStreamReader obj1=new InputStreamReader(f2);
	            obj1.read(arry);
	            System.out.println(arry);
	        }
	        catch(Exception e)
	        {
	            e.getStackTrace();
	            System.out.println();
	        }
	    }
	}

}
