import java.util.Scanner;
class SelectionSort{
    public static void main(String []args){
        System.out.println("Enter the elements");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();//Size of the array
        int arr [] = new int [n];// Creating Array based on size by user
        for(int i=0;i<arr.length;i++){ // Taking Input from User to store in array
            arr[i] = sc.nextInt();
        
        }
        //Selection Sort Algorithm
        for(int lastUnsortedIndex = arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest = 0;
            for(int i=1;i<=lastUnsortedIndex;i++){
                //We initialize i=1 as we need to compare largest and i th element
                if(arr[i]>arr[largest]){
                  largest = i;
                }
            }
            swap(arr,lastUnsortedIndex,largest);
            //Swapping the last index with largest hence we will obtain the last element in correct position
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        
        }   
    }
    public static void swap(int array[],int i, int j){
         if(i==j){
            return;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }
}