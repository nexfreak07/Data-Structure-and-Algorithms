import java.util.Scanner;
public class ShellSort{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // Shell Sort Algorithm
        for(int gap = arr.length/2;gap>0;gap/=2){
             for(int i=gap;i<arr.length;i++){
                int newElement = arr[i];
                int j =i;
                while(j>=gap&&arr[j-gap]>newElement)
                {
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j] = newElement;
            }
        }
           for(int i=0; i<arr.length ; i++){
            System.out.println(arr[i]);
            
        }
    }
}

