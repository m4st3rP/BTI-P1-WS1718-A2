package fibonacci;


import java.util.Scanner;


/**
 * TestFrame for Fibonacci Number Printer
 * 
 * @author Michael Schaefers ; P1@Hamburg-UAS.eu
 * @version 2017/10/02
 */
public class TestFrame {

  public static void main(final String... unused) {
    try (final Scanner workAroundForSeriousUserInterface = new Scanner(System.in);) {
      System.out.printf("Gebe ein, wie viele Fibonacci-Zahlen ausgegeben werden sollen\n");
      System.out.printf("und tippe danach Return um die Eingabe abzuschliessen.\n");
      System.out.printf("=> ");
      //
      final int number = workAroundForSeriousUserInterface.nextInt();
      final FibonacciNumberPrinter fnp = new FibonacciNumberPrinter();
      //
      fnp.printFirstFibonacciNumbers(number);

      System.out.printf("\n\n");
      System.out.printf("THIS IS THE END");

    } catch (final Throwable ex) {
      if (!((ex instanceof AssertionError) || (ex instanceof IllegalArgumentException))) {
        System.out.flush();
        System.err.printf("###\n");
        System.err.printf("### Uuuupppss, was ist denn da passiert ????\n");
        System.err.printf("###\n");
        System.err.printf("\n");
      } // if
      throw (ex);
    } // try
  }// method()

}// class
