import java.util.Scanner;

public class else_if_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		num=sc.nextInt();//Converting into Int
		
		if(num==0)
		{
			System.out.println("Neither Positive Nor Negative");
		}
		else if(num>0)
		{
			System.out.println("It is Positive");
		}
		else
		{
			System.out.println("It is Negative");
		}
	}

}
