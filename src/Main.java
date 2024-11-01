
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задание 1");
        System.out.println(Arrays.toString(arr));
        int consumption = 0;
        for (int total : arr) {
            consumption += total;
        }
        System.out.println("Сумма трат за месяц составила " + consumption + " рублей.");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("Задание 2");
        int minNum = arr[0];
        int maxNum = arr[0];
        int consumption = 0;
        for (int total : arr) {
            if (total < minNum) {
                minNum = total;
            }
            if (total > maxNum) {
                maxNum = total;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minNum + " рублей. Максимальная сумма трат за неделю составила " + maxNum + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("Задание 3");
        int consumption = 0;
        for (int total : arr) {
            consumption += total;
        }
        System.out.println("Средняя сумма трат за месяц составила  " + (double)consumption/arr.length + " рублей");
    }
    public static void task4() {
        int[] arr = generateRandomArray();
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if(i == 0){
                System.out.print(".");
            }
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 100;
        }
        return arr;
    }
}


