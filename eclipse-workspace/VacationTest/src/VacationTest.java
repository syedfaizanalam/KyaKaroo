import java.util.Scanner;

public class VacationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		String vacationType;
		int groupSize; 
		
		System.out.println("What kind of trip would you like to go on:");
		System.out.println("musical, tropical, or adventurous?");
		
		vacationType = scnr.nextLine();
	
		if (vacationType.equals("musical")) {
			System.out.println("How many are in your group?");
			groupSize = scnr.nextInt(); 
					if (groupSize == 1 || groupSize == 2) {
				System.out.println("Since you're a group of 1 or 2, you");
				System.out.println("should fly first class to New Orleans.");
			} else if (groupSize > 2 && groupSize < 6) {
				System.out.println("Since you're a group of 3-5, you");
				System.out.println("should take a helicopter to New Orleans."); 
			} else if (groupSize >= 6) {
					System.out.println("Since you're a group of 6 or more, you");
					System.out.println("should take a charter flight to New Orleans");
			}
		} else if (vacationType.equals("tropical")) {
			System.out.println("How many are in your group?");
			groupSize = scnr.nextInt(); 
					if (groupSize == 1 || groupSize == 2) {
				System.out.println("Since you're a group of 1 or 2, you");
				System.out.println("should fly first class to a beach vacation in Mexico.");
			} else if (groupSize > 2 && groupSize < 6) {
				System.out.println("Since you're a group of 3-5, you");
				System.out.println("should take a helicopter to a beach vacation in Mexico."); 
			} else if (groupSize >= 6) {
					System.out.println("Since you're a group of 6 or more, you");
					System.out.println("should take a charter flight to a beach vacation in Mexico");
			}
		} else if (vacationType.equals("adventurous")) {
			System.out.println("How many are in your group?");
			groupSize = scnr.nextInt(); 
					if (groupSize == 1 || groupSize == 2) {
				System.out.println("Since you're a group of 1 or 2, you");
				System.out.println("should fly first class to go Whitewater Rafting in the Grand Canyon.");
			} else if (groupSize > 2 && groupSize < 6) {
				System.out.println("Since you're a group of 3-5, you");
				System.out.println("should take a helicopter to go Whitewater Rafting in the Grand Canyon."); 
			} else if (groupSize >= 6) {
					System.out.println("Since you're a group of 6 or more, you");
					System.out.println("should take a charter flight to go Whitewater Rafting in the Grand Canyon.");
			}
		} else {
			System.out.println("Invalid error. Please try again.");
		}
}
}