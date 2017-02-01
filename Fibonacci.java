package CoreJava;
import java.io.*;
import java.math.BigInteger;
public class Fibonacci {
	public static void main(String[] args) {
		int n=0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 n = Integer.parseInt( br.readLine());

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(fibBINET(n));

		for (long i = 1; i <= n; i++) {
			System.out.println(fibBINET(i));
		}
		

// 		The second fastest method with complexity O(n)		
//		BigInteger fib=BigInteger.valueOf(1);
//		BigInteger f1=BigInteger.valueOf(1);
//		BigInteger f2=BigInteger.valueOf(0);
//		for (int i = 1; i <= n; i++) {
//			
//			
//			System.out.println (i + " is " + fib + " ");
//			fib=f1.add(f2);
//			f2=f1;
//			f1=fib;
//			
//			
//			
//		}
		
		
	}
	
	static long fibBINET(long n)
	 {
	    double sqrt5 = Math.sqrt(5);
	    double phi=(1+sqrt5)/2;
	    return (long) (Math.pow(phi, n)/sqrt5);
	 }
}