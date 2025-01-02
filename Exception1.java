import java.util.Scanner;
 
public class Test6 {
 
	public static void show() throws PositiveException, NegativeException {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number");

		int number=sc.nextInt();

		if(number>0) {

			throw new PositiveException("number is greter than zero");

		}

		else if(number<0) {

			throw new NegativeException("number is less than zero");

		}

		else {

			System.out.println("number is zero");

		}

	}

	public static void main(String[] args) {

		try {

			Test6.show();

		} catch (PositiveException | NegativeException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
 
	}
 
}

 