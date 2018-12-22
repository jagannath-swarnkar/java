import java.util.Scanner;
class factorial{
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
	long a=1;
		System.out.println("Enter the number for factorial ");
		long fac = obj.nextLong();
		for(long i=1; i<=fac; i++){
			a=i*a;
		}
		System.out.println(a);
	}
}
