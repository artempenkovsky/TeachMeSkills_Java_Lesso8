package by.teachmeskills.penkovsky.homework8;

import java.util.Scanner;

public class UserInputUtils {
    public static int[] createNewArray() {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();

        if (sizeArray < 0) {
            throw new IllegalArgumentException("Ошибка! Проверьте введеные данные!");
        }
        int[] newArray = new int[sizeArray];

        if (sizeArray != 0) {
            for (int i = 0; i < sizeArray; i++) {
                System.out.println("Введите " + (i + 1) + " элемент массива");
                newArray[i] = scanner.nextInt();
            }
        }
        return newArray;
    }
}
