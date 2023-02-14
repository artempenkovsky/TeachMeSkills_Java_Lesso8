package by.teachmeskills.penkovsky.homework8;

public class ArrayUtils {
    public static double getAverage(int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Ошибка! Введено неверное значение!");
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void printArrayReverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int newArray = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = newArray;
        }
    }

    public static int findFirstIndex(int[] array, int firstElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == firstElement) {
                return i;
            }
        }
        return -1;
    }

    public static int[] getSubArray(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < 0 || rightIndex > array.length || leftIndex > rightIndex) {
            throw new IllegalArgumentException("Проверка не пройдена");
        }
        int[] midArray = new int[rightIndex - leftIndex];
        int j = 0;

        for (int i = leftIndex; i < rightIndex; i++) {
            midArray[j] = array[i];
            j++;
        }
        return midArray;
    }

    public static int[] getSubArrayOfPage(int[] array, int page, int pagelength) {
        if ((array.length < 1) || (array.length < ((page - 1) * pagelength))) {
            throw new IllegalArgumentException("Проверка не пройдена");
        }
        int leftIndex = (page - 1) * pagelength;
        int rightIndex = leftIndex + pagelength;

        if (rightIndex > array.length) {
            rightIndex = array.length;
        }
        return getSubArray(array, leftIndex, rightIndex);
    }
}
