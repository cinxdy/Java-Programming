import java.util.Scanner;
public class MyFibonacci{
    public static void main(String[] args){
        do{
            System.out.print("Input n:");
            Scanner kb = new Scanner(System.in);
            int n= kb.nextInt();
            if(n<0) break;
            System.out.println("Fibonacci("+n+") is "+fibonacci(n));
        }while(true);
        System.out.println("Goodbye~!!");
    }

    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}