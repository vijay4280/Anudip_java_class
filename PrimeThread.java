/*Assignment 1 – Prime Number Calculation Using Thread


Create a Java program to find all the prime numbers between 1 and 100 using two threads.


For this assignment, you must create the threads by extending the Thread class.


* The first thread should check numbers from 1 to 50.

* The second thread should check numbers from 51 to 100.

* Each thread should print the prime numbers it finds.

* At the end, each thread should display how many prime numbers it found.


After both threads are completed, display the total number of prime numbers between 1 and 100. */

  public class PrimeThread extends Thread {
    private int start;
    private int end;
    private int primeCount;

    public PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.primeCount = 0;
    }

    @Override
    public void run() {
        System.out.println("Thread checking numbers from " + start + " to " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
                primeCount++;
            }
        }
        System.out.println("Thread found " + primeCount + " prime numbers between " + start + " and " + end);
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public int getPrimeCount() {
        return primeCount;
    }

    public static void main(String[] args) throws InterruptedException {
        PrimeThread thread1 = new PrimeThread(1, 50);
        PrimeThread thread2 = new PrimeThread(51, 100);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int totalPrimes = thread1.getPrimeCount() + thread2.getPrimeCount();
        System.out.println("Total prime numbers between 1 and 100: " + totalPrimes);
    }

  }