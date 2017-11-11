package temperatureConverter;
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
 * Temperature Converter - see task
 * 
 * @author (your name(s))
 * @version (a version number or a date)
 */
public class TemperatureConverter {

  /**
   * printing table
   */
  public void printTable() {
    System.out.println("C       F");
    System.out.println("---------");
    for (int i = 0; i <= 100; i += 1) {
      double fahrenheitDouble = (double) (i * 1.8 + 32);
      int fahrenheit = (int) (fahrenheitDouble + 0.5);
      int length = 9 - String.valueOf(i).length() - String.valueOf(fahrenheit).length();
      System.out.print(i);
      for (int j = 1; j <= length; j++) {
        System.out.print(" ");
      }
      System.out.println(fahrenheit + " " + fahrenheitDouble);
    }
  }
}
