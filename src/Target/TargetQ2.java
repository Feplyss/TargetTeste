package Target;
import java.util.Scanner;

public class TargetQ2 {

	public static void fibonacci(int fib[]) {
		
		fib[0] = fib[1];
		fib[1] = fib[2];
		fib[2] = fib[0] + fib[1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero desejado: ");
		int num = sc.nextInt();
		int fib[]= {0, 1, 1};
		
		while(num > fib[2]) {
			
			fibonacci(fib);
			
			if(num == fib[2]) {
				System.out.println("Numero encontrado. Ele faz parte da sequencia de Fibonacci.");
			}
			
			if(num < fib[2]) {
				System.out.println("Numero nao encontrado. Ele nao faz parte da sequencia de Fibonacci.");
			}
		}
		
		sc.close();
	}
}
