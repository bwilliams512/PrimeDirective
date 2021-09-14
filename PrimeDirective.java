/*
This program creates an ArrayList of all prime numbers in an array.

Some ideas to expand the project:
Build a method that filters an array for odd or even numbers.
Build a method that returns an ArrayList of the first n primes in an array.
Build a method that returns an ArrayList of the first n Fibonacci numbers.
*/


// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  // Determine whether a number is prime or not
  public boolean isPrime(int number) {

    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }
    
    for (int i = 2; i < number; i++) {

      if (number % i == 0) {
        return false;
      } else {
        return true;
        }
      }
    return false;
    }

  // Build an ArrayList of the prime numbers
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new
    ArrayList<Integer>();

    // how do you find all the primes in an array
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }

    return primes;

  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.onlyPrimes(numbers));
    // should print [29, 11, 101, 43, 89]
    
  }  

}
