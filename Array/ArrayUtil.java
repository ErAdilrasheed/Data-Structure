public class ArrayUtil {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void ArrayDemo(){
        int[] myArr = new int[6];
        myArr[0] = 17;
        myArr[1] = 27;
        myArr[2] = 37;
        myArr[3] = 47;
        myArr[4] = 57;
        myArr[5] = 67;
        printArray(myArr);
        System.out.println(myArr.length);
        System.out.println(myArr[myArr.length -1]);
        // printArray(myArr);
    }


    public static void main(String[] args) {
        ArrayUtil utill = new ArrayUtil();
        utill.ArrayDemo();
    }
}
