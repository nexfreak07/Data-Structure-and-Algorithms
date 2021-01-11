import java.util.Scanner;
public class QuickSort{
    public void main(){
       System.out.println("Enter the array ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr [] = new int [n];
       for(int i=0;i<arr.length;i++)
        arr[i] = sc.nextInt();
       
        // Calling Quick Sort 
        
        quicksort(arr,0,arr.length);
       for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public void quicksort(int input[], int start, int end){
        if(end - start<2)
        return;
        
        // Setting Pivot Index
        int pivotIndex = partition(input,start,end);
        quicksort(input,start,pivotIndex);
        quicksort(input,pivotIndex+1,end);
    }
    public int partition(int input[],int start, int end){
        // Set the values
        int pivot = input[start];
        int i = start;
        int j = end ;
        while(i<j){
            while(i<j && input[--j]>=pivot); // do nothing just decrement until a less than pivot is found
            if(i<j)
            input[i] = input[j]; // put j element in i  
            
            while(i<j && input[++i]<=pivot); // Do noting just increment i until a large element is found than pivot
            if(i<j)
            input[j] = input [i]; // put i elements in j
        }
        // Now index j is position for pivot
        input[j] = pivot;
        return j;

    }
}
        