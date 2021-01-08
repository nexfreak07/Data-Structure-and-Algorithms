import java.util.Scanner;
public class MergeSort{
    public void main(){
        System.out.println("---MergeSort---");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        split(arr,0,arr.length);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public void split(int input[],int start,int end){
     int mid =(end+start)/2;
     if((end-start)<2)
     return;
     split(input,start,mid);
     split(input,mid,end);
     merge(input,start,mid,end);
    }
    public void merge(int input[],int start,int mid, int end)
    {
      if(input[mid-1]<=input[mid]){
         return;
      }
      int i= start;
      int j= mid;
      int tempIndex=0;
      int temp[] = new int[end-start];
      while(i<mid&&j<end){
        temp[tempIndex++] = input[i]<=input[j]? input[i++]:input[j++];
        
        }
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);

    }
}