	import java.util.Random;
	import java.util.Scanner;
	 class NLArray3{  
	   
	    boolean NConRep (int arr[][]){
	        boolean isFound = false;
	        for (int i = 0, times = 1; i < arr.length; i++) {
	            times = 1;
	            for (int j = 1; j < arr[0].length; j++) {
	                if(arr[i][0] == arr[i][j])
	                    times++;
	            }
	            if(times == arr.length){
	                isFound = true;
	                break;
	            }
	        }
	        return isFound;
	    }
	    public static void main(String[] args) {
	        NLArray3 nlp = new NLArray3();
	       	Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        System.out.print("Enter the number of rows: ");
	        int row = sc.nextInt();
	        System.out.print("Enter the number of colummns: ");
	        int col = sc.nextInt();
	        int arr [][]= new int[row][col];
	        
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                if(i == 2)
	                	arr[i][j] = 5;
	                else{
	                	int random = rand.nextInt(10);
	                	arr[i][j] = random;
	                }
	            }
	        }
	         for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	             System.out.println();
	        }
	        boolean result = nlp.NConRep (arr);
	        System.out.println("Consicutive array found : " + result);
	        
	    }
	}