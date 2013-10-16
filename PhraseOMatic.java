public class PhraseOMatic {
public static void main (String[] args) {
String[] wordListOne = ("умный", "известный", "интересный");
String[] wordListTwo = ("личностный", "фирменный", "правдивый");
String[] wordListThree = ("код", "знак", "образец");
int oneLength = wordListOne.length;
int oneLength = wordListTwo.length;
int oneLength = wordListThree.length;
int rand1 = (int) (Math.random() * oneLenght);
int rand2 = (int) (Math.random() * twoLenght);
int rand3 = (int) (Math.random() * threeLenght);
String phrase = wordListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListTwo[rand3];
System.out.println("Все, что нам нужно, - это " + phrase);
}
}