import java.io.*;

interface PerformOperation {
    boolean operation(int num);
}

public class Prog8 {
    static PerformOperation checkEvenOdd  = (int x) -> {
        return (x % 2 == 0);
    };

    static PerformOperation checkPrime = (int x) -> {
        for(int i = 2; i*i <= x; i++)
            if(x % i == 0)
                return false;

        return true;
    };

    static PerformOperation checkPalindrome = (int x) -> {
        int temp = x, rev = 0;
        while(temp != 0) {
            int lastDigit = temp % 10;
            rev = (rev * 10) + lastDigit;
            temp /= 10;
        }

        return (rev == x);
    };

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("MENU:");
            System.out.println("1. Check even or odd");
            System.out.println("2. Check if number is prime or not");
            System.out.println("3. Check if number is palindrome or not");
            System.out.println("4. Exit the program");
            System.out.print("Enter choice of operation: ");
            int ch = Integer.parseInt(br.readLine());
            if(ch==4){
                System.out.println("Ending the program");
                System.exit(0);
            }
            System.out.print("Enter number to be checked for the chosen option: ");
            int num = Integer.parseInt(br.readLine());
            if (ch == 1) {
                if(checkEvenOdd.operation(num))
                    System.out.println("Given number is even");
                else
                    System.out.println("Given number is odd");
            }
            else if (ch == 2) {
                if(checkPrime.operation(num))
                    System.out.println("Given number is prime");
                else
                    System.out.println("Given number is not prime i.e. composite");
            }
            else if (ch == 3) {
                if(checkPalindrome.operation(num))
                    System.out.println("Given number can be represented as palindrome");
                else
                    System.out.println("Not a palindrome");
            }
            else
                System.out.println("No matching option");
        }
    }
}