/*WAP to accept the choice from from user and accordingly display the output
1:Greater Between 2 No
2:Profit and Loss
3:Area of rectangle
4:Even ODD*/
import java.util.Scanner;

public class Nested_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice,num1,num2,sp,cp,res;
		System.out.println("Enter the choice :");
		System.out.println("1::Greater Between 2 No \n"
				+ "2:Profit and Loss\n"
				+ "3:Area of rectangle\n"
				+ "4:Even ODD");
		choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter two numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			if(num1>num2)
			{
				System.out.println("Number1 is greater"+num1);
			}
			else
			{
				System.out.println("Number2 is greater"+num2);
			}
			break;
		case 2:
			System.out.println("Enter Selling Price");
			sp=sc.nextInt();
			System.out.println("Enter Cost Price");
			cp=sc.nextInt();	
			res=sp-cp;
			
			System.out.println("The result is ="+res);
			break;
		case 3:
			System.out.println("This is the process of Area of rectangle");
			break;
		case 4:
			System.out.println("This is the process of Even ODD");
			break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
	}

}
