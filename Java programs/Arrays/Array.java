package Arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//creating array
		
		Scanner ip= new Scanner(System.in);
		System.out.println("1d array: ");
		int []arr= new int [10];
		for(int i=2;i<12;i++)
		{
			arr[i-2]=i;
		}
		for(int x:arr)
		{
		
		System.out.print(" "+x);
		}
//creating 2d array
		System.out.println("\n2d array : ");
		int [][]ar= {
				{1,2,3,4,5},
				{2,4,6,8,10},
				{3,6,9}
		};
		for(int []x:ar) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
//creating 2d array using for loop
//		System.out.println("\n2d array :");
//		int [][]ar= new int[5][10];
//		for(int i=1;i<6;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//			ar[i-1][j-1]=i*j;
//			}
//		}
//		
//		for(int []x:ar) {
//			for(int y:x) {
//			System.out.print(" "+y);
//			if(y<10) {
//				System.out.print(" ");
//			}
//			}
//			System.out.println();
//		}
		
//creating 2d array object
		
		Object [][]arob= {{"Pillodu",22,"Male"},{"Pilla",21,"Female"}};
		for(Object []x:arob) {
			for(Object y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
