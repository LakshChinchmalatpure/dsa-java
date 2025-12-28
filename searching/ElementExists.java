public class ElementExists {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int key = 15;
        boolean exists = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                exists = true;
                break;
            }
        }

        if (exists)
            System.out.println("Element exists");
        else
            System.out.println("Element does not exist");
    }
}
