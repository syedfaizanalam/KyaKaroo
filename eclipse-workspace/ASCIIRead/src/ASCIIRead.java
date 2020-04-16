import java.util.Scanner;
public class ASCIIRead {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input;
		String message;
		int checksum = 0;
		
		
		System.out.println("What is your message?");
		input = scnr.nextLine();
		message  = input.toUpperCase();
		
		
		
		System.out.print("Your encoded message is ");
	      for(int i=0; i < message.length(); i++){
		  char ch = message.charAt(i);
		  checksum += (int) ch;
		  int code = (int)ch - 64;
		  System.out.print(code + " - ");
		  
		  } 
	      
	      System.out.println(); 
	      System.out.print("Message checksum is " + checksum);	
}
}
