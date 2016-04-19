

public class ScrabbleGame {
  public static void main(String[] args) {}

    public Integer returnIntegerValue(String word){
      int valueOfWord = 0;
      String[] letterArray = word.split("");

      for ( String letter : letterArray ) {

        if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") || letter.equals("l") || letter.equals("n") || letter.equals("r") || letter.equals("s") || letter.equals("t")) {
          valueOfWord += 1;
        } else if (letter.equals("g") || letter.equals("d")){
          valueOfWord += 2;
        } else if (letter.equals("b") || letter.equals("c") || letter.equals("m") || letter.equals("p")){
          valueOfWord += 3;
        } else if (letter.equals("f") || letter.equals("h") || letter.equals("v") || letter.equals("w") || letter.equals("y")){
          valueOfWord += 4;
        } else if (letter.equals("k")){
          valueOfWord += 5;
        } else if (letter.equals("j") || letter.equals("x")){
          valueOfWord += 8;
        } else {
          valueOfWord += 10;
        }
      }

      return valueOfWord;
    }
}
