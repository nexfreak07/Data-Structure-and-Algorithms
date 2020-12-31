import java.util.Scanner;
class InsertionSort{
    void main(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers");
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<arr.length;i++)
        arr[i] = sc.nextInt();
        //Insertion Sort
        for(int firstUnsortedIndex=1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int i; //Declaring outside as we will need it outside the loop
            for(i= firstUnsortedIndex; i>0 && arr[i-1]>newElement;i--){
                arr[i]=arr[i-1]; // i hasn't been Decremented
            }
           arr[i]=newElement; // Decremented i after postfix
        }
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
