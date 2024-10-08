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

        MyInteger myInt1 = new MyInteger(23);
        MyInteger myInt2 = new MyInteger(4);

        System.out.println("myInt1 value: " + myInt1.getValue());
        System.out.println("myInt1 isEven: " + myInt1.isEven());
        System.out.println("myInt1 isOdd: " + myInt1.isOdd());
        System.out.println("myInt1 isPrime: " + myInt1.isPrime());

        System.out.println("myInt2 value: " + myInt2.getValue());
        System.out.println("myInt2 isEven: " + myInt2.isEven());
        System.out.println("myInt2 isOdd: " + myInt2.isOdd());
        System.out.println("myInt2 isPrime: " + myInt2.isPrime());

        System.out.println("Static isEven(23): " + MyInteger.isEven(23));
        System.out.println("Static isOdd(23): " + MyInteger.isOdd(23));
        System.out.println("Static isPrime(23): " + MyInteger.isPrime(23));

        System.out.println("Static isEven(myInt1): " + MyInteger.isEven(myInt1));
        System.out.println("Static isOdd(myInt1): " + MyInteger.isOdd(myInt1));
        System.out.println("Static isPrime(myInt1): " + MyInteger.isPrime(myInt1));

        System.out.println("myInt1 equals 23: " + myInt1.equals(23));
        System.out.println("myInt1 equals myInt2: " + myInt1.equals(myInt2));

        char[] chars = {'1', '2', '3'};
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(chars));

        String str = "456";
        System.out.println("parseInt(String): " + MyInteger.parseInt(str));
    }
}