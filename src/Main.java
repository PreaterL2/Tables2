public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 4, -6, 90};
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};

        System.out.println("Wypisanie elementów tablicy: ");
        printArray(arr);
        System.out.println("Wypisanie elementow tablicy od do: ");
        printArrayFromIndex(arr, 3);
        System.out.println("Wypisuje elementy tablicy w odwrotnej kolejnosci od do: ");
        printReverseFromIndex(arr, 1);
        System.out.println("Wypisuje elementy tablicy w odwrotnej kolejnosci");
        printReverse(arr);
        System.out.println();


        System.out.println("Wypisanie liter alfabetu: ");
        for (char el : letters) {
            System.out.println(el);
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void printArrayFromIndex(int[] arr, int from) {
        if (from < 0 || from >= arr.length) {
            System.out.println("from value is out of array index bound");
        } else {
            for (int i = from; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    static void printReverseFromIndex(int[] arr, int from) {
        if (from < 0 || from >= arr.length) {
            System.out.println("from value is out of array index bound");
        } else {
            for (int i = from; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }


}



