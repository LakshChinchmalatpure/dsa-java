public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 4, 8};
        int key = 4;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1)
            System.out.println("First occurrence at index: " + index);
        else
            System.out.println("Element not found");
    }
}
