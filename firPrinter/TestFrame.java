package firPrinter;


import java.util.Scanner;


/**
 * TestFrame for Fir Printer
 * 
 * @author Michael Schaefers ; P1@Hamburg-UAS.eu
 * @version 2017/10/02
 */
public class TestFrame {

  public static void main(final String... unused) {
    try (final Scanner workAroundForSeriousUserInterface = new Scanner(System.in);) {
      System.out.printf("Gebe ein, wie hoch der Tannenbaum sein soll\n");
      System.out.printf("und tippe danach Return um die Eingabe abzuschliessen.\n");
      System.out.printf("=> ");
      //
      final int height = workAroundForSeriousUserInterface.nextInt();
      final FirPrinter fp = new FirPrinter();
      //
      fp.printFir(height);

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
