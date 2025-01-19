public class ResizeArray {


    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] resize(int[]arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i< arr.length; i++){
            arr[i] = temp[i];
        }
        return temp;
    }

    public static void main(String[] args) {
      ResizeArray ra = new ResizeArray();
      int[] arr = new int[]{10,20,30,40,50};
      printArray(arr);
      int[] original = new int[]{10,20,30,40,50};
        System.out.println("the original lenth:" + original.length);
        original = ra.resize(original,10);
        System.out.println("the resized lenth:" + original.length);
    }
}
