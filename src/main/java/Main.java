import java.util.Scanner;

public class Main { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);

  // Create an array with 10 double elements
    double[] numbers = new double[10];
    System.out.println("This program will have you input 10 numbers, they can be integers or numbers with decimals. The program will then find the average of the numbers you input and print it out as both an int and a double.");


// User input and counts the number of enties made
    
    for (int i = 0; i < numbers.length; i++) { 
      System.out.println("Please enter a number: "); 
      numbers[i] = input.nextDouble(); 
      System.out.println("You have entered " + (i + 1) + " so far."); 
            } 

    //  calls and passes the array numbers to two methods that calculates the doutle average and the int average
    
    double averageDoubleValue = average(numbers); 
    int averageIntValue = (int) average(numbers);

// Prints out the averages for double and int
    
    System.out.println("\nThe average of the numbers you have entered as a double is " + averageDoubleValue); 
    System.out.println("The average of the numbers you have entered as an int is " + averageIntValue);
        } 

// Two methods that calculate the average of the numbers in the array. One that calculates the average as a double and one that calculates the average as int
  
    public static double average(double[] array) { 
      double sum = 0; 
      for (double value : array) { 
        sum += value; 
    } 
      return sum / array.length; 
  }

  public static int average(int[] array) { 
    int sum = 0; 
    for (int value : array) { 
      sum += value; 
  } 
    return sum / array.length; 
  }
}

