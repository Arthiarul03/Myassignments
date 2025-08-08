package Week1.day1;
import java.util.Scanner;
public class Primenumber {
		public static boolean primeornot(int n) {
		if(n <=0) {
			return false;
		}
		for (int i=2; i<=n/2;i++) {    //n=6---> 2<=6/2 => 2<=3(condition pass)    //n=2--> 2<=1
			if(n%i==0) {               //  if(6%2)---> 0                           // if condition will not apply 
				return false;          // return false(Not prime)                  // return true
			}
		}
			return true;
		}

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number:");
      int n=sc.nextInt();
      boolean r1=primeornot(n);
      if(r1) {
    	  System.out.println("It is a prime number");
      }
      else {
    	  System.out.println("It is not a prime number");
      }
	}
}
