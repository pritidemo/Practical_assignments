import java.util.Scanner;

//WAP to accept ano from user and find out the sqaure if no is postive
public class if_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers");
		num1=sc.nextInt();
		if(num1>0)
		{
			System.out.println("The square is ="+ num1*num1);
		}
		else
		{
			System.out.println("The no is invalid . \n KIndly enter postive no :)");
		}

	}

}
