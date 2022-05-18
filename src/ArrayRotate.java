public class ArrayRotate {

    public static int[] rotate(int[] arr, int d) {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int newIndex = (i + d) % arr.length;
            newArr[newIndex] = arr[i];
        }
        return newArr;
    }
}
