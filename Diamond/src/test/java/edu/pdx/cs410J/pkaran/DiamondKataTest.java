package edu.pdx.cs410J.pkaran;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondKataTest extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... args) {
    return invokeMain( DiamondKata.class, args );
  }

  @Test
  public void diamondOfOneLetter() {

    MainMethodResult result = invokeMain("a");

    String expectedOutput = "a" + System.lineSeparator();
  
    assertEquals(expectedOutput, result.getTextWrittenToStandardOut());
  }

  @Test
  public void diamondForLetterD() {

    MainMethodResult result = invokeMain("d");

    String expectedOutput = String.format("   a   %1$s  b b  %1$s c   c %1$sd     d%1$s c   c %1$s  b b  %1$s   a   %1$s", System.lineSeparator());

    assertEquals(expectedOutput, result.getTextWrittenToStandardOut());
  }

  @Test
  public void diamondForLetterT() {

    MainMethodResult result = invokeMain("t");

    String expectedOutput = "                   a                   \n" +
                            "                  b b                  \n" +
                            "                 c   c                 \n" +
                            "                d     d                \n" +
                            "               e       e               \n" +
                            "              f         f              \n" +
                            "             g           g             \n" +
                            "            h             h            \n" +
                            "           i               i           \n" +
                            "          j                 j          \n" +
                            "         k                   k         \n" +
                            "        l                     l        \n" +
                            "       m                       m       \n" +
                            "      n                         n      \n" +
                            "     o                           o     \n" +
                            "    p                             p    \n" +
                            "   q                               q   \n" +
                            "  r                                 r  \n" +
                            " s                                   s \n" +
                            "t                                     t\n" +
                            " s                                   s \n" +
                            "  r                                 r  \n" +
                            "   q                               q   \n" +
                            "    p                             p    \n" +
                            "     o                           o     \n" +
                            "      n                         n      \n" +
                            "       m                       m       \n" +
                            "        l                     l        \n" +
                            "         k                   k         \n" +
                            "          j                 j          \n" +
                            "           i               i           \n" +
                            "            h             h            \n" +
                            "             g           g             \n" +
                            "              f         f              \n" +
                            "               e       e               \n" +
                            "                d     d                \n" +
                            "                 c   c                 \n" +
                            "                  b b                  \n" +
                            "                   a                   \n";

    expectedOutput = expectedOutput.replaceAll("\n", System.lineSeparator());

    assertEquals(expectedOutput, result.getTextWrittenToStandardOut());
  }
}
