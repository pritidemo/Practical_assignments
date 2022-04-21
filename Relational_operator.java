import java.util.Scanner;

public class Relational_operator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		boolean res=num1<num2; // using res to store the value of expression
		System.out.println("A<b="+res);

		System.out.println("A>b="+(num1>num2));

	}

}
