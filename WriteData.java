import java.io.FileWriter;

import java.io.IOException;
 
public class WriteData {
 
	public static void main(String[] args) {

		  try {  

		        FileWriter fwrite = new FileWriter("D:JavaIntern.txt");  

		        // writing the content into the FileOperationExample.txt file  

		        fwrite.write("Hi All welcome to this java tutorials.");   

		   String name="Create By -Anjana Sarode";

		   fwrite.write(name);

		        // Closing the stream  

		        fwrite.close();   

		        System.out.println("Content is successfully wrote to the file.");  

		    } catch (IOException e) {  

		        System.out.println("Unexpected error occurred");  

		        e.printStackTrace();  

		        }  

		    }  
 
	}
 
 