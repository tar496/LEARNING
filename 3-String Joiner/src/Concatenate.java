import java.util.Scanner;

public class Concatenate{
	public static void main(String []args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your First Name and Last name");
		String FirstName=scan.next();
		String LastName=scan.next();
		System.out.println(joinStrings(FirstName, LastName));
		}
	public static String joinStrings(String str1, String str2) {
		return str1+str2;
	}
}