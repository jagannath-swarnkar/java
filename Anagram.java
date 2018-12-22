import java.util.Arrays;
import java.util.Scanner;
class Anagram{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first string for Anagram :");
    String a = input.nextLine();
    System.out.println("Enter the Anagram :");
    String b = input.nextLine();

    char[] Array1 = a.replaceAll(" ","").toLowerCase().toCharArray();
    char[] Array2 = b.replaceAll(" ","").toLowerCase().toCharArray();

    if(a.length()==b.length()){
          Arrays.sort(Array1);
          Arrays.sort(Array2);

          if(Arrays.equals(Array1,Array2)){
            System.out.println("It is an Anagram. ");
          }else{
            System.out.println("It is not an Anagram !");
          }
    }else{
      System.out.println("It is not an Anagram !");
    }
  }
}