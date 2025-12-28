public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
