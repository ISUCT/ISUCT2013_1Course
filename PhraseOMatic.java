public class PhraseOMatic {
public static void main(String[] args) {
String[] wordListOne = {"cocktail", "guide", "club", "mug"};
String[] wordListTwo = {"candy", "mishka", "pencil", "notebook"};
String[] wordListThree = {"string", "mirror", "icon", "ball"};
int oneLenght = wordListOne.length;
int twoLenght = wordListTwo.length;
int threeLenght = wordListThree.length;
int rand1 = (int) (Math.random() * oneLenght);
int rand2 = (int) (Math.random() * twoLenght);
int rand3 = (int) (Math.random() * threeLenght);
String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
System.out.println("All we need is " + phrase);
  }
}

