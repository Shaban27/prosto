public class Main {
    public static void main(String[] args) {


        // Задание №1
        int[] numbers = new int[]{1, 2, 3};
        double[] bananas = {1.57, 7.654, 9.986};
        int[] chairs = new int[10];

        //Задание №2
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int n = 0; n < bananas.length; n++) {
            System.out.println(bananas[n]);
        }

        for (int d = 0; d < chairs.length; d++) {
            chairs[d] = d * 20;
        }
        for (int d = 0; d < chairs.length; d++) {
            System.out.println(chairs[d]);

        }

        //Задание №3
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        for (int n = bananas.length - 1; n >= 0; n--) {
            System.out.println(bananas[n]);
        }
        for (int d = chairs.length - 1; d >= 0; d--) {
            System.out.println(chairs[d]);

        }

        // Задание №4
        for (int i = 0; i <=2; i++) {
            if (i % 2 != 0) {
                System.out.println(numbers[i]);
            } else {
                System.out.println(numbers[i]+3);

            }
        }
    }
}