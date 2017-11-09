package fibonacci;
/*
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Wir erinnern uns:
 * NIEMALS verschiedene Spachen in einem Programm mixen. Oder konkreter: Entweder Identifier und
 * Kommentar in deutsch oder in englisch. Es gelten die in der Vorlesung besprochenen Regeln. Es
 * lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar. Wir nutzen den Kommentar "hier" fuer
 * Erklaerungen und Ausfuehrungen zur Aufgabenstellung. Es gilt "hier" die Regel: o) "Kommentar" der
 * Kommentar ist in englisch. o) "Kommentar" der die Aufgabenstellung vertieft in deutsch. Loeschen
 * Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung muessen Sie GUTEN Kommentar schreiben.
 * 
 * 
 * Zur Fibonacci-Zahlen-Folge siehe auch http://de.wikipedia.org/wiki/Fibonacci-Folge. Es soll die
 * "urspruengliche" Fibonacci-Reihe zu verwenden. f(1) = f(2) = 1 f(n) = f(n-1) + f(n-2)
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

/**
 * Fibonacci Number Printer - see task
 * 
 * @author Rudolf, Philipp
 * @version 17.10.2017
 */
public class FibonacciNumberPrinter {
  // The first two values are given, since they are needed to calculate the other ones.
    //KAS sprechende Bezeichner
  
  /**
   * printing first Fibonacci numbers (the classical way) from 1 to max index
   * 
   * @param maxIndex number of Fibonacci numbers to be printed respectively index of last Fibonacci
   *        number in sequence
   */
  /*
   * Since a and b are put out at the beginning and we take care of proper punctuation we need to
   * advance differently, depending on if we have to put out only 1, 2 or more numbers, but in
   * general we calculate the current number and move our results sequentially through the
   * variables.
   */
  public void printFirstFibonacciNumbers(final int maxIndex) {
      assert 0 <maxIndex && maxIndex < 47 : "Ungültiger Wert";
      
      
      int firstVal = 0;
      int secondVal = 1;
      int actualFibu;
      int index;
      //maximalen Wert im if aufnehmen 
      
      
    if (maxIndex > 2 && maxIndex < 46) {
      System.out.print(firstVal + ", " + secondVal + ", ");
      for (index = 2; index < maxIndex - 1; index++) {
        actualFibu = firstVal + secondVal;
        System.out.print(index + " " + actualFibu + "\n ");
        
        firstVal = secondVal;
        secondVal = actualFibu;
      }
      actualFibu = firstVal + secondVal;
      System.out.print(index + " " + actualFibu);
    }else if (maxIndex == 2) {
      System.out.print(firstVal + ", " + secondVal);
    }else {
      System.out.print(firstVal);
    }
    
    
  }
}
