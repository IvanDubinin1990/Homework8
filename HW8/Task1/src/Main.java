public class Main {
    public static void main(String[] args) {

        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println("arr [" + i + "] = " + arr[i]);
            } else {
                System.out.print("arr [" + i + "] = " + arr[i] + ", ");
            }
        }
        System.out.println();

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println("arr [" + (arr.length - 1 - i) + "] = " + arr[arr.length - 1 - i]);
            } else {
                System.out.print("arr [" + (arr.length - 1 - i) + "] = " + arr[arr.length - 1 - i] + ", ");
            }
        }
        System.out.println();

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo

        for (int i = 0; i < arr.length / 2; i++) {
            int buffer = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = buffer;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println("arr [" + i + "] = " + arr[i]);
            } else {
                System.out.print("arr [" + i + "] = " + arr[i] + ", ");
            }
        }
    }
}
