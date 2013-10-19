public class PhraseOMatic {
public static void main(String[] args) {
String[] wordListOne = {"auiineeaue", "yiioeiiaeuiue", "yeno?aiaeuiue", "aieiaoaeuiue"};
String[] wordListTwo = {"ioa?ue", "?ooeee", "aanoaiiue", "eo?enoue"};
String[] wordListThree = {"a?oa", "?aeiaae", "iiaa?ie", "aaiu"};
int oneLenght = wordListOne.length;
int twoLenght = wordListTwo.length;
int threeLenght = wordListThree.length;
int rand1 = (int) (Math.random() * oneLenght);
int rand2 = (int) (Math.random() * twoLenght);
int rand3 = (int) (Math.random() * threeLenght);
String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
System.out.println("Ana, ?oi iai io?ii, - yoi " + phrase);
  }
}