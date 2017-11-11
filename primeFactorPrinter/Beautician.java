package primeFactorPrinter;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Beautician
 * 
 * @author Michael Schaefers ; P1@Hamburg-UAS.eu
 * @version 2017/10/02
 */
public class Beautician {

  static public String getPimpedTime() {
    final String timeFormatPattern = "yyyy-MM-dd HH:mm:ss.SSS";
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern(timeFormatPattern);
    final LocalDateTime dateTime = LocalDateTime.now();
    final String theTime = dateTime.format(dtf);
    return theTime;
  }// method()


  static public String pimpNS(final long nanoSeconds) {
    if (nanoSeconds >= 1_000_000_000_000_000_000L) {
      return String.format("%d.%03d.%03d.%03d,%03d.%03d.%03d[s]",
          nanoSeconds / 1_000_000_000_000_000_000L, (nanoSeconds / 1_000_000_000_000_000L) % 1_000L,
          (nanoSeconds / 1_000_000_000_000L) % 1_000L, (nanoSeconds / 1_000_000_000L) % 1_000L,
          (nanoSeconds / 1_000_000L) % 1_000L, (nanoSeconds / 1_000L) % 1_000L,
          nanoSeconds % 1_000L);
    } else if (nanoSeconds >= 1_000_000_000_000_000L) {
      return String.format("%d.%03d.%03d,%03d.%03d.%03d[s]", nanoSeconds / 1_000_000_000_000_000L,
          (nanoSeconds / 1_000_000_000_000L) % 1_000L, (nanoSeconds / 1_000_000_000L) % 1_000L,
          (nanoSeconds / 1_000_000L) % 1_000L, (nanoSeconds / 1_000L) % 1_000L,
          nanoSeconds % 1_000L);
    } else if (nanoSeconds >= 1_000_000_000_000L) {
      return String.format("%d.%03d,%03d.%03d.%03d[s]", nanoSeconds / 1_000_000_000_000L,
          (nanoSeconds / 1_000_000_000L) % 1_000L, (nanoSeconds / 1_000_000L) % 1_000L,
          (nanoSeconds / 1_000L) % 1_000L, nanoSeconds % 1_000L);
    } else if (nanoSeconds >= 1_000_000_000L) {
      return String.format("%d,%03d.%03d.%03d[s]", nanoSeconds / 1_000_000_000L,
          (nanoSeconds / 1_000_000L) % 1_000L, (nanoSeconds / 1_000L) % 1_000L,
          nanoSeconds % 1_000L);
    } else if (nanoSeconds >= 1_000_000L) {
      return String.format("%d,%03d.%03d[ms]", nanoSeconds / 1_000_000L,
          (nanoSeconds / 1_000L) % 1_000L, nanoSeconds % 1_000L);
    } else if (nanoSeconds >= 1_000L) {
      return String.format("%d,%03d[us]", nanoSeconds / 1_000L, nanoSeconds % 1_000L);
    } else {
      return String.format("%d[ns]", nanoSeconds);
    } // if
  }// method()

}// class
