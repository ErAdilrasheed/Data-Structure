public class FindMissingNumber {

    public static void printArray(int[]arr){
        int n = arr.length;
        for (int i = 0 ; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int missingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = n * (n + 1)/2;
        for (int num:arr){
            sum = sum - num;
        }
        return sum;
    }

    public void arrayDemo(){
        int[] arr = {2,5,7,8,6,1,4};
        printArray(arr);
        System.out.println(missingNumber(arr));
    }



    public static void main(String[] args) {
        FindMissingNumber fm = new FindMissingNumber();
        fm.arrayDemo();
    }
}
