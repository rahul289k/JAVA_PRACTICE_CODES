package begincoding;
import java.util.Scanner;

public class practices {

	public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in);
				System.out.print("\nEnter your age ");
				int age = input.nextInt();
				if(age<0 || age>100) {
					System.out.println("please enter valid age, age must be between 0 and 100 ");
				}
				else if (age <18) 
					System.out.println("You are under age");
				else if (age < 21 && age >18)
					System.out.println("you need parental consent");
				else {
					System.out.println("Congratulations you can proceed with the event");
				}
				

	}

}
