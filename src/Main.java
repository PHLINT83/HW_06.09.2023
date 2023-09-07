import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
        }
        System.out.println("Генерируем случайные (не уникальные) числа: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j =1; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
                }
            if (count > 1){
                int c = 0;
                for (int k = 0; k < i; k++){
                    if (arr[k] == arr[i]) c++;
                }
                if (c ==0){
                    System.out.println("Цифра " + arr[i] + ". Количество повторов: " + count);
                }
            }
        }

        System.out.println();
        int remains;
        String hexad_num = "";
        String[] hexad = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое десятичное число: ");
        int decit = scan.nextInt();
        while(decit > 0){
            remains = decit % 16;
            hexad_num = hexad[remains] + hexad_num;
            decit = decit / 16;
        }
        System.out.print("Число в шестнадцатеричной системе счисления: " + hexad_num);
    }
}