import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int index = scanner.nextInt();
            int divisor = scanner.nextInt();
            int result = arr[index] / divisor;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
            
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
            
        } finally {
            scanner.close();
        }
    }
}

    
}
