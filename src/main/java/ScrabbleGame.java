import java.util.HashMap;

public class ScrabbleGame {
  public static void main(String[] args) {}

    public Integer returnIntegerValue(String word){
      int valueOfWord = 0;
      char[] letterArray = word.toLowerCase().toCharArray();

      HashMap<Character, Integer> gameMap = new HashMap<Character, Integer>();
      gameMap.put('a', 1);
      gameMap.put('e', 1);
      gameMap.put('i', 1);
      gameMap.put('o', 1);
      gameMap.put('u', 1);
      gameMap.put('l', 1);
      gameMap.put('n', 1);
      gameMap.put('r', 1);
      gameMap.put('s', 1);
      gameMap.put('t', 1);

      gameMap.put('d', 2);
      gameMap.put('g', 2);

      gameMap.put('b', 3);
      gameMap.put('c', 3);
      gameMap.put('m', 3);
      gameMap.put('p', 3);

      gameMap.put('f', 4);
      gameMap.put('h', 4);
      gameMap.put('v', 4);
      gameMap.put('w', 4);
      gameMap.put('y', 4);

      gameMap.put('k', 5);

      gameMap.put('j', 8);
      gameMap.put('x', 8);

      gameMap.put('u', 10);
      gameMap.put('z', 10);

      for ( char letter : letterArray ) {

        valueOfWord += gameMap.get(letter);

        // if(letter == ('a') || letter == ('e') || letter == ('i') || letter == ('o') || letter == ('u') || letter == ('l') || letter == ('n') || letter == ('r') || letter == ('s') || letter == ('t')) {
        //   valueOfWord += 1;
        // } else if (letter == ('g') || letter == ('d')){
        //   valueOfWord += 2;
        // } else if (letter == ('b') || letter == ('c') || letter == ('m') || letter == ('p')){
        //   valueOfWord += 3;
        // } else if (letter == ('f') || letter == ('h') || letter == ('v') || letter == ('w') || letter == ('y')){
        //   valueOfWord += 4;
        // } else if (letter == ('k')){
        //   valueOfWord += 5;
        // } else if (letter == ('j') || letter == ('x')){
        //   valueOfWord += 8;
        // } else {
        //   valueOfWord += 10;
        // }
      }

      return valueOfWord;
    }
}
