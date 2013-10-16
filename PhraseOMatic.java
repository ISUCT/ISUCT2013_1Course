public class PhraseOMatic {
public static void main(Strin[] args) {
String[] wordListOne = {"выносливый", "эмоциональный", "экстремальный", "внимательный"};
String[] wordListTwo = {"мудрый", "чуткий", "бесценный", "лучистый"};
String[] wordListThree = {"друг", "человек", "подарок", "день"};
int oneLenght = wordListOne.length;
int twoLenght = wordListTwo.length;
int threeLenght = wordListThree.length;
int rand1 = (int) (Math.rendom() * oneLenght);
int rand2 = (int) (Math.rendom() * twoLenght);
int rand3 = (int) (Math.rendom() * threeLenght);
String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
System.out.println("Все, что нам нужно, - это " + phrase);
  }
}