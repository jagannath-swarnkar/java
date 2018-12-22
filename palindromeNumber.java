/////////////palindrome_number//////////////

// import java.util.Scanner;
// class palindromeNumber{
// 	public static void main(String[] args) {
// 		Scanner obj=new Scanner(System.in);
// 		System.out.println("Enter the number to check for palindrome :");
// 		int user=obj.nextInt();
// 		int input=user, rem, rev=0;
// 		while(user!=0){
// 			rem=user%10;
// 			rev=rev*10+rem;
// 			user=user/10;
// 		}
// 		if(rev==input){
// 			System.out.println("Palindrome");
// 		}else{
// 			System.out.println("Not palindrome");
// 		}
// 	}
// }


//////////////////////palindrome_series///////////////

import java.util.Scanner;
class palindromeNumber{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the String to check for palindrome :");
		String user=obj.nextLine();
		String totalName="";
		for(int i=(user.length()-1); i>=0; i--){
			char a=user.charAt(i);
			totalName=totalName+Character.toString(a);
		}
		System.out.println(totalName);
		if(user.equals(totalName)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}
	}
}


////////////////////////////palindrome_series/////////////

// import java.util.Scanner;
// class palindromeNumber{
// 	public static void main(String[] args) {
// 		Scanner obj=new Scanner(System.in);
// 		System.out.println("Enter the String to check for palindrome :");
// 		String user=obj.nextLine();
// 		String totalName="";
// 		for(int i=1; i<user.length()+1; i++){
// 			char a=user.charAt(user.length()-i);
// 			totalName=totalName+Character.toString(a);
			
// 		}
// 		System.out.println(totalName);
// 	}
// }