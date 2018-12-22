import java.util.Scanner;
	class palindrome{
		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter your string : ");
			String user = obj.nextLine();
			int l=user.length;
			for(int i=0; i<l; i++){
				String user(i)=user(l-(i+1));
			}
				System.out.println(user);


		}
	}