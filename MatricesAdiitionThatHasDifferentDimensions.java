import java.util.*;
public class MatricesAdiitionThatHasDifferentDimensions {
	static Random rn = new Random();
	static Scanner sc = new Scanner(System.in);
	static int x1, y1, x2, y2,Xson,Yson;
	static void matrixmaker(int arr[][],int arrson[][]) {
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[0].length ; j++) {
				arr[i][j] = rn.nextInt(1, 10);
				arrson[i][j] = arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}


	static void matrixadditioner(int arr1[][], int arr2[][], int arrtotal[][]) {
		for (int i = 0; i < arrtotal.length; i++) {
			for (int j = 0; j < arrtotal[0].length; j++) {
				arrtotal[i][j] = arr1[i][j] + arr2[i][j];
				if(arrtotal[i][j]!=0) {
				System.out.print(arrtotal[i][j] + "\t");}
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// ARRAY 1:
		System.out.println("x1 :");	x1= sc.nextInt();
		System.out.println("y1 :");	y1= sc.nextInt();
		int arr1[][] = new int[x1][y1];	
		// ARRAY 2:
		System.out.println("x2 :");	x2= sc.nextInt();
		System.out.println("y2 :");	y2= sc.nextInt();
		int arr2[][] = new int[x2][y2];	
		// ARRAYSON1 VE SON 2
		System.out.println("Xson :");
		Xson= sc.nextInt();
		System.out.println("Yson :");
		Yson= sc.nextInt();
		int arrson1[][]= new int [Xson][Yson];
		int arrson2[][] = new int [Xson][Yson];
		int arrtotal[][]= new int [Xson][Yson];
		//System.out.println(arrson1.length);
		System.out.println();
		matrixmaker(arr1,arrson1);
		System.out.println();
		matrixmaker(arr2,arrson2);
		System.out.println();
		matrixadditioner(arrson1,arrson2,arrtotal);
	}
}
