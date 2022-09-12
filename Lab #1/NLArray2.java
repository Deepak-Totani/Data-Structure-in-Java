	import java.util.Scanner;
	import java.util.*;

	class NLArray2 {  

	    void extractBoundaries (int arr[][]) {
	        for (int i = 0; i < arr[0].length; i++) {
	            for (int j = 0; j < arr.length; j++) {
	                if(i==0|| j==0|| i==arr[0].length-1 || j==arr.length-1)
	                    System.out.print(arr[i][j]);
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }
	    
	    void cropCenterPart (int arr[][]){
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[0].length; j++) {
	                if(i==0|| j==0|| i==arr[0].length-1 || j==arr.length-1)
	                    System.out.print(" ");
	                else
	                    System.out.print(arr[i][j]);
	            }
	            System.out.println();
	        }
	    }
	    
	    public static void main(String[] args) {
	        NLArray2 nlp = new NLArray2();
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        System.out.print("Enter the number of rows: ");
	        int row = sc.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int col = sc.nextInt();
	        int arr [][]= new int[row][col];
	        
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                int random = rand.nextInt(10);
	                arr[i][j] = random;
	            }
	        }
	        
	        System.out.println("\n\nPrinting Boundaries.......");
	        nlp.extractBoundaries(arr);
	        System.out.println("\n\nPrinting Center.......");
	        nlp.cropCenterPart(arr);
	    }
	} 