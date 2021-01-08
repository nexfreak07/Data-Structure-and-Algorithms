import java.util.Scanner;
public class FactorialIterative{
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int n = sc.nextInt();
        int fact = 1;
        if(n==0)
        {
            System.out.println("Factorial = "+ fact);
        }
        else
        for(int i=n;i>1;i--)
        fact = fact*i;
         System.out.println("Factorial = "+ fact);
        }
    }
        