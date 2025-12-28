public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int key = 8;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
