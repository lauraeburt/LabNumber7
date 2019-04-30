import java.util.Scanner;						//Laura Burt
import java.util.regex.Pattern;


public class RegularExpressions {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a valid first name beginning with a capital letter:");
		String name = scan.next();
		scan.hasNextLine();

		if (validateFirstName(name)) {
			System.out.println("Name is valid!");

		} else {
			System.out.println("Sorry, name is not valid!");

		}

		System.out.println("Please enter a valid email address:");
		String email = scan.next();
		scan.hasNextLine();

		if ((validateEmail(email))) {
			System.out.println("Email is valid!");
		}

		else {
			System.out.println("Sorry, email is not valid!");
		}

		System.out.println("Please enter a valid phone number(ex. 313-867-5309:");
		String phone = scan.next();
		scan.hasNextLine();

		if ((validatePhoneNumber(phone))) {
			System.out.println("Phone number is valid!");
		} else {
			System.out.println("Sorry, phone number is not valid!");
		}

		System.out.println("Please enter a valid date (dd/mm/yyyy:");
		String date = scan.next();
		scan.hasNextLine();

		if ((validateDate(date))) {
			System.out.println("Date is valid!");
		} else {
			System.out.println("Sorry, date is not valid!");
		}

		scan.close();
	}

	public static boolean validateFirstName(String name) {

		boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{1,29}", name);
		// System.out.println(firstName);
		return firstName;
	}

	public static boolean validateEmail(String email) {

		boolean userEmail = Pattern.matches("[A-Za-z0-9]{5,30}\\@[A-Za-z0-9]{5,10}\\.[A-Za-z]{2,3}", email);
		// System.out.println(userEmail);
		return userEmail;
	}

	public static boolean validatePhoneNumber(String phone) {
		boolean testPhone = Pattern.matches("[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}", phone);
		// System.out.println(testPhone);
		return testPhone;
	}

	public static boolean validateDate(String date) {
		boolean testDate = Pattern.matches("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$", date);
		// System.out.println(testDate);
		return testDate;

	}

}
