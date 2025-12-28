public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int key = 7;

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                found = true;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
