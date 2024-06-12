public class RotateMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int steps = 3;

        System.out.println("Original array:");
        printArray(arr);

        rotateArray(arr, steps);

        System.out.println("\nArray after rotating by " + steps + " steps to the right:");
        printArray(arr);
    }

}
