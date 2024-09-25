package collictionn.misol1.Misol1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listmanipulation {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(30);


        Random random = new Random();


        for (int i = 0; i < 30; i++) {
            numbers.add(random.nextInt(100) + 1);
        }


        System.out.println("Dastlabki list:");
        printNumbers(numbers);


        for (int i = 0; i < numbers.size(); i++) {
            int randomIndex = random.nextInt(numbers.size());
            System.out.println("\n" + (i + 1) + "-chi iteratsiya:");
            System.out.println("Olib tashlanayotgan index: " + randomIndex);
            numbers.remove(randomIndex);
            printNumbers(numbers);
        }
    }


    public static void printNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
