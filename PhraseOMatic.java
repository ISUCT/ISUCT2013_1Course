public class PhraseOMatic {
public static void main (String[] args) {
String[] wordListOne = {"умный", "известный", "интересный"};
String[] wordListTwo = {"личностный", "фирменный", "правдивый"};
String[] wordListThree = {"код", "знак", "образец"};
int oneLength = wordListOne.length;
int twoLength = wordListTwo.length;
int threeLength = wordListThree.length;
int rand1 = (int) (Math.random() * oneLength);
int rand2 = (int) (Math.random() * twoLength);
int rand3 = (int) (Math.random() * threeLength);
String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListTwo[rand3];
System.out.println("Все, что нам нужно, - это " + phrase);
}
}