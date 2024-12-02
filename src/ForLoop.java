import java.util.Scanner;

public class ForLoop {
    public void loop5Times(){
        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
    }
    public void sumNaturalNumbers(){
        int sum = 0;
        int n = 1000;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }
    public void isPalindrome(){
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome: ");
        original = sc.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    public void pyramidExample(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
