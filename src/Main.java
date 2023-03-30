import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" введите номер билета");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt(); // ввод данных пользователем

        long startTime = System.nanoTime();


        while (!islusckyTicket(input)) {

            System.out.println(" данный билет " + input + " не счастливый ");
            input++;
        }
        System.out.println(" данный билет " + input + " счастливый");

        long endTime = System.nanoTime();

        System.out.println(" было потрачено времени " + (endTime - startTime));
    }

    private static boolean islusckyTicket ( int num) {

        int[] mass = new int[6];
        for (int i = 5; i >= 0; i--) { // i— это i = i - 1
            mass[i] = num % 10;
            num = num / 10;
        }
        return mass[0] + mass[1] + mass[2] == mass[3] + mass[4] + mass[5];


    }
}






