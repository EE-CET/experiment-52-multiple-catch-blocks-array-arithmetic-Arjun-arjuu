import java.util.Scanner;

public class MultipleCatch {
    
        // TODO: Read N
        // TODO: Create array and read N integers
        // TODO: Read index
        // TODO: Read divisor
        
        // TODO: 
        // TODO: catch ArrayIndexOutOfBoundsException -> Print "Invalid Index"
        // TODO: catch ArithmeticException -> Print "Divide by zero error"

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();
		int[] arr= new int[n];

		for(int i=0;i<n;i++)arr[i]= sc.nextInt();

		int idx= sc.nextInt();
		int a= sc.nextInt();

		try{

			int r= arr[idx]/a;
			System.out.println(r);

		}
		catch(ArrayIndexOutOfBoundsException ae){

			System.out.println("Invalid Index");

		}
		catch(ArithmeticException e){

			System.out.println("Divide by zero error");

		}
		sc.close();

	}    
}
