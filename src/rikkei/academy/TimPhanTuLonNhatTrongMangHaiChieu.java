package rikkei.academy;
import java.util.Arrays;
import java.util.Scanner;
public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài 2 mảng: ");
        int size = sc.nextInt();
        float[][] matrix = new float[2][size];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (float) Math.random() * 50;
            }
        }
        System.out.println("Mảng 1: " + Arrays.toString(matrix[0]) + "\nMảng 2: " + Arrays.toString(matrix[1]));
        int result1 = maxValue(matrix[0]);
        int result2 = maxValue(matrix[1]);
        float max = (matrix[0][result1] > matrix[1][result2]) ? matrix[0][result1] : matrix[1][result2];
        System.out.println("Số lớn nhất trong 2 mảng là: " + max);
    }

    public static int maxValue(float[] array) {
        float max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        return index;
    }
}
