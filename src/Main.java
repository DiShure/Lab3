import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество строчек и столбцов массива: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Введите массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location largestLocation = Location.locateLargest(array);

        System.out.println("Наибольший элемент массива, равный " + largestLocation.maxValue + ", находится в позиции (" + largestLocation.row + ", " + largestLocation.column + ")");

        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000);
        MyTime time3 = new MyTime(5, 23, 55);

        System.out.println("Текущее время: " + time1);
        System.out.println("Время после 555550000 миллисекунд: " + time2);
        System.out.println("Время с указанными часами, минутами и секундами: " + time3);
    }
}