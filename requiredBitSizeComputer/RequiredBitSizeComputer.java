package requiredBitSizeComputer;
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
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * Required Bit Size Computer - see task
 * 
 * @author Michael Schaefers ; P1@Hamburg-UAS.eu
 * @version 2017/10/07
 */
public class RequiredBitSizeComputer {

  /**
   * compute required bit size to code positive number
   * 
   * @param number the number for that the required bit size shall be computed
   * @return required bit size to compute number
   */
  public int computeBitSize(final long number) {
    assert number >= 0 : "No negative numbers!";


    int resu;
    resu = 0;
    String numberBinaryLength;

    numberBinaryLength = Long.toBinaryString(number);
    System.out.println(numberBinaryLength);
    resu = String.valueOf(numberBinaryLength).length();

    return resu;

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  }// method()

}// class
