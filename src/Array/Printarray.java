package Array;

public class Printarray {
    public static int[] arrayPrinter() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] mergedArray = arrayPrinter();
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
