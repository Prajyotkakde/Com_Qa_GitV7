package v7;

public class Reverse_No {

	public static void main(String[] args) {
		int a=5432, rem, rev=0;            
		while(a!=0)
			{
			       rem = a%10;   // rem=5432%10 =rem =2   // rem=543%10=3   //rem= 54%10=4        // rem=5%10=5
			       rev = rev*10+rem;   // rev= 0*10+2 =2 // rev= 2*10+2=23 // rev=23*10+4=234   // rev =234*10+5=2345
			       a= a/10;      // a =5432/10= 543  //a= 543/10 = 54   //  a= 54/10=5   // a=5/10=0
			}
		System.out.println(rev);


	}

}
