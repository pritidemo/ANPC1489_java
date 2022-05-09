import java.util.Scanner;

//WAP to accept a no from user if no is divisible by 5 than find out the cube.
public class If_demo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		num=sc.nextInt();//Converting into Int
		if(num%5==0)  
		{
			res=num*num*num;
			System.out.println("The cube is ="+res);
		}
		
	}

}
