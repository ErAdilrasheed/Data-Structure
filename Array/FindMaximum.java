public class FindMaximum {

    public static int findMax(int[] arr){
//        edge case
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("invalid input");
        }
        int max = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {21,12,54,10,51,81,78,56,98,1,7,89,24,44,};
        printArray(arr);
//        FindMaximum mx = new FindMaximum();
        System.out.println(findMax(arr));
    }
}
