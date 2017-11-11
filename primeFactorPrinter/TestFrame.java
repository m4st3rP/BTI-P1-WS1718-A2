package primeFactorPrinter;


import java.util.Scanner;


/**
 * TestFrame for Prime Factor Printer
 * 
 * @author Michael Schaefers ; P1@Hamburg-UAS.eu
 * @version 2017/10/02
 */
public class TestFrame {

  public static void main(final String... unused) {
    try (final Scanner workAroundForSeriousUserInterface = new Scanner(System.in);) {
      System.out.printf("Gebe ein, welche Zahl in ihre Primfaktoren zerlegt werden soll\n");
      System.out.printf("und tippe danach Return um die Eingabe abzuschliessen.\n");
      System.out.printf("=> ");
      //
      final long theNumber = workAroundForSeriousUserInterface.nextLong();
      final PrimeFactorPrinter pfp = new PrimeFactorPrinter();
      System.out.printf("\n");
      System.out.printf( // print computation start time
          "Computation starts at :      %s\n", Beautician.getPimpedTime());
      System.out.printf("\n");
      final long startTime = System.nanoTime(); // start time of actual computation
      //
      pfp.printFactorization(theNumber);
      //
      final long stopTime = System.nanoTime(); // computation stopped
      final long deltaTime = stopTime - startTime; // computation time
      System.out.printf("\n\n"); // you never know ;-)
      System.out.printf( // print computation time
          "Consumed computation time :  %s\n", Beautician.pimpNS(deltaTime));
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
