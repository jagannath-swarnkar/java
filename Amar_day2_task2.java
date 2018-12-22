
import java.util.Scanner;
class Test{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String user = obj.nextLine();
		String test = "";
		String result="";
		for(int i=user.length()-1; i>=0; i--){
			char a=user.charAt(i);
			test=Character.toString(a)+test;
			if (test.equals("ing")){
				System.out.println(user+"ly");
				break;
			}
			else if (test.equals("ly")) {
				break;
			}
			else if (test.equals("e")) {
			}
			else{
				result=Character.toString(a)+result;
			}
		}
		if (test.equals("ing") || test.equals("ly7")) {
			System.out.println();
		}
		else{
			System.out.println(result+"ing");
		}
	}
}