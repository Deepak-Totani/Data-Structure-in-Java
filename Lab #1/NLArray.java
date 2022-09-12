import java.io.*;
import java.util.*;
	
	public class NLArray {  
	   
	    
	    
	String [] wordTokenize (String fileName){
	        int wordIndex = -1;
	        String word = null;
	        boolean isFound = false;
	        String words [] = new String[fileName.length()];
	        for (int i = 0; i < words.length; i++) {
	            if(word != "")
	            words[++wordIndex] = word;
	            word = "";
	            while(true){
	                isFound = false;
	                switch(fileName.substring(i,i+1)){
	                    case " ":
	                    case ".":System.out.println(i);
	                    case "/":
	                    case ",": isFound = true;
	                        break;
	                    default:
	                        word += fileName.charAt(i++);
	                }
	                if(isFound)
	                    break;
	            }
	        }
	        return words;
	    }
	 
	   
	    public static void main(String[] args) {
	      try {
	      File myObj = new File("C:\\Users\\Deepak\\OneDrive\\Desktop\\NLP Text.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	//        String []words = nlp.wordTokenize(data);
	//          for (String word : words) {
	//              if (word == null) {
	//                  continue;
	//              }
	//              System.out.println(word);
	//              
	//          }
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	    }
	    }
	}
