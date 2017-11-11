package medal;
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
 * Sport Medal Computer - see task
 * 
 * @author (your name(s))
 * @version (a version number or a date)
 */
public class SportMedalComputer {

  /**
   * compute proper medal for participant
   * 
   * @param points number of points earned by participant
   * @param age age of participant
   * @return resulting medal
   */
  public String evaluate(int points, // Punkte die Teilnehmer im Wettkampf erworben hat
      int age // Alter des jeweiligen Teilnehmers
  ) {


    // Deklaration
    String medal; // Medaille, die jeweiligem Teilnehmer ausgehändigt wird

    // Initialisierung
    medal = "currently none";



    if (age < 14) {
      if (points > 3999) {
        medal = "Gold";
      } else if (points < 4000 && points > 2999) {
        medal = "Silber";
      } else {
        medal = "Bronze";
      }
    } else {
      if (points > 4999) {
        medal = "Gold";
      } else if (points < 5000 && points > 3999) {
        medal = "Silber";
      } else {
        medal = "Bronze";
      }
    }
    return medal;
  }
}
