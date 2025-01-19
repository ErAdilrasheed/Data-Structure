public class RemoveOddInteger {

    public static void printArray(int [] arr){
        int n = arr.length;
        for (int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeOdd(int [] arr){
        int countEven = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
               countEven++;
            }
        }
        int[] result = new int [countEven];
        int index = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
                result[index] = arr[i];
                index++;
            }
        }
       return result;
    }

    public static void main(String[] args) {
        int [] arr = {20,11,8,7,9,5,14,21,54,26,19,33,28,30};
        printArray(arr);
        int [] result = removeOdd(arr);
        printArray(result);
    }
}
