package converter;

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
 * Grade Converter - see task
 * 
 * @author Rudolf, Philipp
 * @version 12.10.2017
 */
public class GradeConverter {
  /**
   * Converts "Notenpunkte" into old german "Schulnote"
   * 
   * @param notenpunkt Notenpunkte number of points earned by participant
   * @return old german "Schulnote"
   */
  public String convertGrade(final int notenpunkt) {
      assert 0<=notenpunkt && notenpunkt<=15 : "Ungültiger Notenpunktwert";
          
          
      //KAS assertion einfügen
    /*
     * First write the appropiate mark, which we decide via the switch control structure, as a
     * string and then the string gets put out.
     */

    String result = "";
    
    

    switch (notenpunkt) {
      case 15:
        result = "1+";
        break;
      case 14:
        result = "1";
        break;
      case 13:
        result = "1-";
        break;
      case 12:
        result = "2+";
        break;
      case 11:
        result = "2";
        break;
      case 10:
        result = "2-";
        break;
      case 9:
        result = "3+";
        break;
      case 8:
        result = "3";
        break;
      case 7:
        result = "3-";
        break;
      case 6:
        result = "4+";
        break;
      case 5:
        result = "4";
        break;
      case 4:
        result = "4-";
        break;
      case 3:
        result = "5+";
        break;
      case 2:
        result = "5";
        break;
      case 1:
        result = "5-";
        break;
      case 0:
        result = "6";
        break;
      default:
          /* "Metapher". Viele komplizierte Berechnung sind passiert */
        assert false : "Internal programming error - this line schall NEVER be executed";
    }
    return result;
  }
}
