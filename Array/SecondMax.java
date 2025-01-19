public class SecondMax {

    public static int secondMaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {13,25,41,35,2,14,17,36,35,20,19};
        printArray(arr);
        System.out.println(secondMaxElement(arr));
    }
}
