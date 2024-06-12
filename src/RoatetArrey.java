public class RoatetArrey {
    public static void rotateArray(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length;
        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, steps - 1);
        reverseArray(arr, steps, length - 1);
    }

}
