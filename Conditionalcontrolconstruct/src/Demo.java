import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int marks= scan.nextInt();
		System.out.println("welcome to Kodneest");
		checkEligibility(marks);
	}

	public static void checkEligibility(int marks) {
		// TODO Auto-generated method stub
		if(marks>=80)
		{
			System.out.println("welcome to techclub");
		}
	}

}
