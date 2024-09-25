package lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class ForkJoin {

    public static void main(String[] args) {


        int[] numbers = generateRandomArray(1_000_000);
        ForkJoinPool pool = new ForkJoinPool();
        SumTask sumTask = new SumTask(numbers, 0, numbers.length);
        int sum = pool.invoke(sumTask);
        System.out.println("1 millionta random integer yig'indisi: " + sum);


        List<Integer> primes = pool.invoke(new PrimeTask(1, 1_000_000));
        System.out.println("1 dan 1 million gacha bo'lgan tub sonlar: " + primes);


        pool.invoke(new PerfectNumbersTask(1, 10_000_000));


        int n = 10;
        int fib = pool.invoke(new FibonacciTask(n));
        System.out.println("Fibonachchi (" + n + "): " + fib);
    }


    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(200) + 1;
        }
        return numbers;
    }


    static class SumTask extends RecursiveTask<Integer> {
        private final int[] numbers;
        private final int start;
        private final int end;

        SumTask(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= 10000) {
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += numbers[i];
                }
                return sum;
            } else {
                int middle = (start + end) / 2;
                SumTask left = new SumTask(numbers, start, middle);
                SumTask right = new SumTask(numbers, middle, end);
                invokeAll(left, right);
                return left.join() + right.join();
            }
        }
    }


    static class PrimeTask extends RecursiveTask<List<Integer>> {
        private final int start;
        private final int end;

        PrimeTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected List<Integer> compute() {
            if (end - start <= 1000) {
                List<Integer> primes = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    if (isPrime(i)) {
                        primes.add(i);
                    }
                }
                return primes;
            } else {
                int middle = (start + end) / 2;
                PrimeTask left = new PrimeTask(start, middle);
                PrimeTask right = new PrimeTask(middle + 1, end);
                invokeAll(left, right);
                List<Integer> result = new ArrayList<>();
                result.addAll(left.join());
                result.addAll(right.join());
                return result;
            }
        }


        private boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    static class PerfectNumbersTask extends RecursiveAction {
        private final int start;
        private final int end;

        PerfectNumbersTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start <= 1000) {
                for (int i = start; i <= end; i++) {
                    if (isPerfect(i)) {
                        System.out.println("Mukammal son: " + i);
                    }
                }
            } else {
                int middle = (start + end) / 2;
                PerfectNumbersTask left = new PerfectNumbersTask(start, middle);
                PerfectNumbersTask right = new PerfectNumbersTask(middle + 1, end);
                invokeAll(left, right);
            }
        }


        private boolean isPerfect(int number) {
            int sum = 1;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    sum += i;
                    if (i * i != number) {
                        sum += number / i;
                    }
                }
            }
            return sum == number;
        }
    }


    static class FibonacciTask extends RecursiveTask<Integer> {
        private final int n;

        FibonacciTask(int n) {
            this.n = n;
        }

        @Override
        protected Integer compute() {
            if (n <= 1) {
                return n;
            } else {
                FibonacciTask f1 = new FibonacciTask(n - 1);
                FibonacciTask f2 = new FibonacciTask(n - 2);
                invokeAll(f1, f2);
                return f1.join() + f2.join();
            }
        }


    }


}
