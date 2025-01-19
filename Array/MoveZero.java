public class MoveZero {

    public static void printArray(int[] arr){
    int n = arr.length;
    for (int i = 0; i<n; i++){
        System.out.print(arr[i] + " ");
    }
        System.out.println();
    }
    public static void moveZeroToRight(int[]arr, int n){
        int j = 0;
        for (int i =0; i< arr.length; i++){
           if(arr[i] !=0 && arr[j] ==0){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           } else if (arr[j] != 0) {
               j++;
           }
        }

    }
    public void arrayDemo(){
     int[] arr = {9,0,6,0,1,0,6,0,3,0,1,0,6,0,9,0,2,0,5,0};
     printArray(arr);
     moveZeroToRight(arr , arr.length);
     printArray(arr);
    }

    public static void main(String[] args) {
    MoveZero utill = new MoveZero();
    utill.arrayDemo();
    }
}
