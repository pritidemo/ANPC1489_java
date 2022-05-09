import java.util.Scanner;

//WAP to accept two no from user and find out the greatest.
public class If_else_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("Number1 is greater"+num1);
		}
		else//if(num2>num1)
		{
			System.out.println("Number2 is greater"+num2);
		}
		
		

	}

}
