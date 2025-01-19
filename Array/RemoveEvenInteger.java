public class RemoveEvenInteger {
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] removeEven(int[] arr){
       int OddCount = 0;
       for (int i = 0; i< arr.length; i++){
           if (arr [i] % 2 != 0){
               OddCount++;
           }
       }
       int [] result = new int [OddCount];
       int index = 0;
       for (int i =0; i<arr.length; i++){
           if (arr [i] % 2 != 0){
               result[index] = arr[i];
               index++;
           }
       }
       return result;
    }


    public static void main(String[] args) {
    int [] arr = {2,3,4,5,6,7,8,9,11,10,12,14,17,19,44,22};
    printArray(arr);
    int[] result = removeEven(arr);
    printArray(result);
    }
}
