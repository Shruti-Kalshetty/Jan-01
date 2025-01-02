import java.util.Scanner;
 
public class Test5 {
 
	public static  void disp() throws AgeNotFound 

	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter name:");

		String name=sc.next();

		System.out.println("Enter age:");

		int age=sc.nextInt();

		if(age<18) {

			throw new AgeNotFound("Age is below 18 u cant vote!!!");

		}

		else {

			System.out.println("u can vote");

		}

	}

	public static void main(String[] args) {

		try {

			Test5.disp();

		} catch (AgeNotFound e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
 
	}
 
}

 