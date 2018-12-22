import java.util.Scanner;
	class calculators extends operators{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		calculators obj2 = new calculators();
		System.out.println("Enter the choise for calculation :\n Type 1:add , 2:sub , 3:multiply , 4:divide , 5:modulus , 6:square , 7:cube");
		int user=obj.nextInt();
		System.out.println("Enter the first number for a=? for calculation :");
		int a=obj.nextInt();
		
		if(user==1){
			System.out.println("Enter the second number for b=? for calculation :");
			int b=obj.nextInt();
			obj2.add(a,b);

		}
		else if (user==2) {
			System.out.println("Enter the second number for b=? for calculation :");
			int b=obj.nextInt();
			obj2.sub(a,b);
		}
		else if (user==3) {
			System.out.println("Enter the second number for b=? for calculation :");
			int b=obj.nextInt();
			obj2.multiply(a,b);
		}
		else if (user==4) {
			System.out.println("Enter the second number for b=? for calculation :");
			int b=obj.nextInt();
			obj2.divide(a,b);
		}
		else if (user==5) {
			System.out.println("Enter the second number for b=? for calculation :");
			int b=obj.nextInt();
			obj2.modulus(a,b);
		}
		else if (user==6) {
			obj2.square(a);
		}
		else if (user==7) {
			obj2.cube(a);
		}
		
	}
}