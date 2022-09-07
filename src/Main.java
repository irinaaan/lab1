import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int length = in.nextInt();
        int[] num = new int[length];
        System.out.print("Заполните массив: ");
        for (int i = 0; i < length; i++) {
            num[i] = in.nextInt();
        }
        System.out.println(SortingArray(num));
    }

    public static boolean SortingArray(int num[]) {
        if (num.length >= 2) {
            boolean flag = false;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i + 1] >= num[i]) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
        return false;
    }
}