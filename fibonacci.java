package Week1.day1;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=8;
        int x=0,y=1;
       // System.out.println(n);
		for (int i=1; i<=n; i++) {
		System.out.println(x+ " ");  // 0--> temp=0+1, x=1,y=1
		int temp=x+y;                // 1--> temp=1+1, x=1, y=2
		x=y;                         // 1--> temp=1+2, x=2, y=3
		y=temp;                      // 2--> temp=2+3, x=3,y=5
		}                            // 3--> temp=3+5, x=5,y=8
	}                                // 5--> temp=5+8, x=8, y=13
                                     // 8--> temp=8+13,x=13,y=21
}