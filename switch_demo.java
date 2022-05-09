import java.util.Scanner;

public class switch_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Pin Change \n 2: Withdraw \n 3:Check theBalance");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("This is the process of pin change");
			break;
		case 2:
			System.out.println("This is the process of Withdraw");
			break;
		case 3:
			System.out.println("This is the process of checking the balance");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}

}
