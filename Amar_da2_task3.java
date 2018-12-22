import java.util.Scanner;
class Task{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.print("Enter the string : ");
		String user = obj.nextLine();
		String result="";
		String test="";
		for(int i=user.length()-1; i>=0; i--){
			char a= user.charAt(i);
			test=Character.toString(a)+test;
			if (test.equals("e")) {}-
			else if (test.equals("ly")) {
				System.out.println(user);
				break;}
			else{
				result=Character.toString(a)+result;

			}
			else if (test.equals("ing")) {}

		}
		if (test.equals("ly")) {}
		else{
			System.out.println(result+"ing");
		}
	}
}