import java.util.Scanner;
public class ASCIITest {
	
	/*		int ascii = (int) character;
	
	What is your message? Java
	Your encoded message is 10-1-22-1
	Message checksum is 290
-----------------------------------------------------
	{
				System.out.println("ASCII value of: " + input.charAt(i) + " is:" 
						+ (int) input.charAt(i));
			}
		
			char character = (char)ascii;  
-----------------------------------------------------	
	
	  public static String stretch3(String word) {
	    StringJoiner longer = new StringJoiner("-");
	    for (int i = 0; i < word.length(); i++) {
	      longer.add(word.substring(i,i+1));
	    }
	    return longer.toString();
	  }
	}
	
-----------------------------------------------------

	
	  public static String stretch(String word) {
     
	  String longer = "" + word.charAt(0);
    
	  for (int i = 1; i < word.length(); i++) {
      longer += "-" + word.charAt(i);
    }
    return longer;
  }
	
-----------------------------------------------------

	
	public static StringBuffer removeUTFCharacters(String data){
		Pattern p = Pattern.compile("\\\\u(\\p{XDigit}{4})");
		Matcher m = p.matcher(data);
		StringBuffer buf = new StringBuffer(data.length());
		while (m.find()) {
		String ch = String.valueOf((char) Integer.parseInt(m.group(1), 16));
		m.appendReplacement(buf, Matcher.quoteReplacement(ch));
		}
		m.appendTail(buf);
		return buf;
		}
	
-----------------------------------------------------
	
	private static String toUnicode(char ch) {
	    return String.format("\\u%04x", (int) ch);
	}
-----------------------------------------------------
	
			for (int i = 0; i < message.length(); i++) {
			System.out.print((int) message.charAt(i));
		} 
	
	*/
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input;
		String message;
		int checksum;
		
		
		System.out.println("What is your message?");
		input = scnr.nextLine();
		message  = input.toUpperCase();
		
		
		
		System.out.print("Your encoded message is ");
	      for(int i=0; i < message.length(); i++){
		  char ch = message.charAt(i);
		  System.out.print((int)ch + " - ");
		      } 
		

		System.out.println();
		System.out.print("Message checksum is ");
		System.out.println();
		
		  



	
}
	}
