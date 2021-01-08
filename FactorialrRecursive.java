import java.util.Scanner;
public class FactorialrRecursive{
    public void  main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        int y = fact(n);
        System.out.println("Factorial = "+y);
    }
    public int fact(int k)
    {
      if(k==0)
      return 1;
      else 
      return (k * fact(k-1));

    }
}
        