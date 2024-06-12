public class RotateArrey {
        public static void rotateArray(int[] arr, int steps) {
            {

            }
            int n = arr.length;
            steps = steps % n;
            reverseArray(arr, 0, n - 1);
            reverseArray(arr, 0, steps - 1);
            reverseArray(arr, steps, n - 1);
        }
}
