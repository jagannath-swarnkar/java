import java.util.Scanner;
	class strlen{
		public static void main(String []args){
			Scanner obj= new Scanner(System.in);
			System.out.println(" Enter your name or any string to see the letter length :");
			String user = obj.nextLine();
			int length = user.length();
			System.out.println("the length of your name is : " +length);
			if (length <5){
				System.out.println("Aapka name bahut chhota hai ");
			}
			else{
				System.out.println("Aapka naam kafi bada hai ");
			}
		}
	}