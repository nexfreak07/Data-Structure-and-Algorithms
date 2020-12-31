//This BubbleSort Algorithm will take input from users and will sort the respective Array
import java.util.Scanner;// Util pacakage since we are using scanner class
class BubbleSort{
    public void main(){
        System.out.println("Enter the array elements");
        Scanner sc = new Scanner (System.in);// Defining scanner class
        int n = sc.nextInt(); //Maximum size of numbers to create sn array
        int arr[] = new int[n];// Creating Array based on size entered by user
        for(int i=0; i<arr.length; i++){//Loop to intake array elements
            arr[i] = sc.nextInt();
        }
        //Sorting the array
        
        for(int LastUnsortedIndex=arr.length-1; LastUnsortedIndex>0;LastUnsortedIndex--){
             for(int j=0;j<LastUnsortedIndex;j++){
               if(arr[j]>arr[j+1]){
                   swap(arr,j,j+1);
                   
                }
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]); //Printing the sorted Array with printing loop
        }        
        }
    public static  void swap(int array[],int i,int j){
        if(i==j)
        return;
        //Swaping if i!=j
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}    
        
        
        
