import java.util.Scanner;
public class greatest_of_two
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //import scanner
		
		System.out.print("Enter the first number : ");  //input first number		
		int num1 = sc.nextInt();

		System.out.print("Enter the second number : "); //input second number
		int num2 = sc.nextInt();
	
		if(num1 > num2)		//conditions										
			System.out.println(first+" is greater than "+num2);
		else if(num2 > num1)
			System.out.println(second+" is greater than "+num1);
		else
			System.out.println("Both numbers are Equal");
	}
}
