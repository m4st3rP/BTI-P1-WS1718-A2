package firPrinter;
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
 * Fir Printer - see task
 * 
 * @author Rudolf, Philipp
 * @version 12.10.2017
 */
public class FirPrinter {
    /**
     * print fir
     * 
     * @param height
     *            height of fir
     */
    public void printFir(int height) {
        assert height > 0 : "Height to low!";
        
        
        // KAS assert negative Zahl
        // Here we define the number of characters of each type for each type in the
        // first line
        int points = height - 1;
        int stars = 1;

        /*
         * The drawing process is seperated into 3 parts: First the left part of the
         * points, then the stars and then the right part of the points. After that we
         * calculate the numbers for the next line.
         */
        // KAS Bezeichner z.B. Stufe / Ebene
        
        if (height < 7) {
            for (int level = 0; level < height; level++) {
                // pointsLeft
                for (int pointsLeft = 0; pointsLeft < points; pointsLeft++) {
                    System.out.print(".");
                }

                // Stamm
                for (int starsMiddle = 0; starsMiddle < stars; starsMiddle++) {
                    System.out.print("*");
                }

                // pointsRight
                for (int pointsRight = 0; pointsRight < points; pointsRight++) {
                    System.out.print(".");
                }
                System.out.println();
                points--;
                stars += 2;
            }

        } else {
            System.out.println("Enter a height that is lower than 7!");
        }
    }
}
