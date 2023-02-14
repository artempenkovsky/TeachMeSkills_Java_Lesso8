package by.teachmeskills.penkovsky.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Уважаемый пользователь, введите номер задачи согласно списку: ");
        System.out.println("Задача 1");
        System.out.println("Задача 2");
        System.out.println("Задача 3");
        System.out.println("Задача 4");
        System.out.println("Задача 5");
        System.out.println("Задача 6");

        int task = scanner.nextInt();
        switch (task) {
            case 1 -> {
                System.out.println("Введите год: ");
                int year = scanner.nextInt();
                System.out.println("Является ли введенный год вискосным? Ответ -  " + DateTimeUtils.isLeapYear(year));
            }
            case 2 -> {
                int[] array = UserInputUtils.createNewArray();
                double average = ArrayUtils.getAverage(array);
                System.out.println("Среднее арифметическое чисел равняется: " + ArrayUtils.getAverage(array));
            }
            case 3 -> {
                int[] array = UserInputUtils.createNewArray();
                ArrayUtils.printArrayReverse(array);
                System.out.println(Arrays.toString(array));
            }
            case 4 -> {
                int[] array = UserInputUtils.createNewArray();
                System.out.print("Введите поисковое значение (индекс): ");
                int firstElement = scanner.nextInt();
                int index = ArrayUtils.findFirstIndex(array, firstElement);
                System.out.println("Поисковое значение (индекс): " + index);
            }
            case 5 -> {
                int[] array = UserInputUtils.createNewArray();
                System.out.print("Укажите левую границу (индекс) массива включительно: ");
                int leftIndex = scanner.nextInt();
                System.out.print("Укажите правую границу (индекс) не включительно: ");
                int rightIndex = scanner.nextInt();
                int[] newArray = ArrayUtils.getSubArray(array, leftIndex, rightIndex);
                System.out.println("Искомое значение " + Arrays.toString(newArray));
            }
            case 6 -> {
                int[] array = UserInputUtils.createNewArray();
                System.out.print("Укажите номер страницы: ");
                int page = scanner.nextInt();
                System.out.print("Укажите количество элементов на странице: ");
                int pagelength = scanner.nextInt();
                int[] newArray = ArrayUtils.getSubArrayOfPage(array, page, pagelength);
                System.out.println("Искомое значение " + Arrays.toString(newArray));
            }
            default -> throw new IllegalArgumentException("Ошибка! Проверьте введенные данные!");
        }
    }
}
