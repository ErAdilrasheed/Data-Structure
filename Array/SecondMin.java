public class SecondMin {

    public static int secondMinElement(int[] arr){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i =0; i< arr.length; i++){
            if (arr[i]<min){
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {55,14,52,17,45,10,25,45,13,65,71,46,25,45,25,78,96,31,10};
        printArray(arr);
        System.out.println(secondMinElement(arr));
    }
}
