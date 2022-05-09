import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp,cp,res;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Selling Price");
		sp=sc.nextInt();
		System.out.println("Enter Cost Price");
		cp=sc.nextInt();	
		res=sp-cp;
		System.out.println("The result is ="+res);
	}

}
