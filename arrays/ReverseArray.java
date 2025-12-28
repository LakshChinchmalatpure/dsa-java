public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};

        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
