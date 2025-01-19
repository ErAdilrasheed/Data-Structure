public class FindMinimum {

    public static int findMin(int[] arr){
//        edge case check
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("invalid input");
        }
      int min = arr[0];
      for (int i =1; i<arr.length; i++){
          if(arr[i]<min){
              min = arr[i];
          }
      }
      return min;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {11, 18, 10, 8, 2, 44, 23, 19, 4, 21};
        FindMinimum mi = new FindMinimum();
        printArray(arr);
        System.out.println(mi.findMin(arr));
    }
}
