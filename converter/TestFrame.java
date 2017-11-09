package converter;

import java.util.Scanner;

/**
 * TestFrame for grade converter (Notenpunkte -> "alte Schulnote")
 * 
 * @author Michael Schaefers ; P1@Hamburg-UAS.eu
 * @version 2017/10/05
 */
public class TestFrame {

  public static void main(final String... unused) {
    try (final Scanner workAroundForSeriousUserInterface = new Scanner(System.in);) {
      System.out.printf(
          "Gebe die Anzahl Notenpunkte ein, die in eine Schulnote umgerechnet werden soll.\n");
      System.out.printf("=> ");

      final int notenPunkte = workAroundForSeriousUserInterface.nextInt();
      final GradeConverter gc = new GradeConverter();
      final String schulNote = gc.convertGrade(notenPunkte);
      

      System.out.printf("\n\n");
      System.out.printf("%d   ->   %s\n", notenPunkte, schulNote);

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
