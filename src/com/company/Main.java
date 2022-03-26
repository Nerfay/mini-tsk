package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
         minitask();
    }
    private static void minitask() {
        System.out.print("Введите количество чисел массива(>100) m=");
        int m = scanner.nextInt();
        System.out.print("Введите числа блоков K=");
        int k = scanner.nextInt();
        System.out.print("Число перемешиваний N=");
        int n = scanner.nextInt();
        if (m > 100) {
            int[] arr = new int[m];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
            System.out.println("Начальный массив:");
            System.out.println(Arrays.toString(arr));
            System.out.println("Перемешанные блоки:");
            Random rnd = new Random();
            int id = m / k;
            for (int l = 0; l <n; l++) {
                for (int i = 0; i < id * k; i += k) {
                    int index = rnd.nextInt(id);
                    for (int j = 0; j < k; j++) {
                        int a = arr[i + j];
                        arr[i + j] = arr[j + (index * k)];
                        arr[j + (index * k)] = a;
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        else{
                System.out.println("\nВы ввели число меньше 100");
            }
    }
}
