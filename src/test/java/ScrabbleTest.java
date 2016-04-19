
import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void returnIntegerValue_forOneLetter_1() {
    ScrabbleGame testScrabbleGame = new ScrabbleGame();
    Integer expected = 1;
    assertEquals(expected, testScrabbleGame.returnIntegerValue("l"));
  }

  @Test
  public void returnIntegerValue_forOneLetterB_3() {
    ScrabbleGame testScrabbleGame = new ScrabbleGame();
    Integer expected = 8;
    assertEquals(expected, testScrabbleGame.returnIntegerValue("j"));
  }

  @Test
  public void returnIntegerValue_forOneWord_5() {
    ScrabbleGame testScrabbleGame = new ScrabbleGame();
    Integer expected = 10;
    assertEquals(expected, testScrabbleGame.returnIntegerValue("places"));
  }
}
