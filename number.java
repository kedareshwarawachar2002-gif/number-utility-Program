import java.util.Scanner;
public class number{
    public static boolean isprime(int num){
        if(num <= 1){
            return false;
        }
        else{
            for(int i=2 ; i*i <= num ; i++){
                if(num%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean ispalindrome(int num){
        int original_num = num;
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse *10 + digit;
            num /= 10;
        }
        return original_num == reverse;
    }
    public static long factorial(int num){
        long fact = 1 ;

        for(int i = 1; i <= num ; i++){
            fact *= i;
        }
        return fact;
    }
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series : ");

        for(int i = 1 ; i<=n ; i++){
            System.out.print(a+" ");
            int next = a+b;
            a=b;
            b = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("1. Prime Number Check.");
            System.out.println("2. Palindrome check.");
            System.out.println("3. Factorial.");
            System.out.println("4. Fibonacci Series");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();
            if(choice == 5){
                System.out.println("Exiting program..");
                break;
            }
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            switch(choice){
                case 1:
                    if(isprime(num))
                        System.out.println(num + " is a prime number.");
                    else
                        System.out.println(num + " is not a prime number.");
                    break;

                case 2:
                    if(ispalindrome(num))
                        System.out.println(num + " is palindrome number.");
                    else
                        System.out.print(num +" is not a palindrome number. ");
                    break;

                case 3:
                    System.out.println("Factorial of "+num + " = "+ factorial(num));
                    break;

                case 4:
                    fibonacci(num);
                    break;

                default:
                    System.out.println("invalid choice ! please try again.");
                    
            }
        }

        sc.close();
        
    }
}