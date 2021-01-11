import java.util.Scanner;
public class CountingSort{
    public void main(){
        System.out.println("Enter the size of element, the min and max assumed length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the min and max respectively");
        int min = sc.nextInt();
        int max = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++)
        arr[i] = sc.nextInt();
        
        countingsort(arr,min,max);
        
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public void countingsort(int input[],int min,int max){
        int countArray[] = new int[(max-min)+1];
        
        //Writing the Count Array
        for(int i=0;i<input.length;i++)
        countArray[input[i]-min]++;
        int j=0;
        //Writing back the input Array
        for(int i=min; i<=max;i++){
            while(countArray[i-min]>0){
                input[j++]=i;
                countArray[i-min]--;
            }
        }
    }
}