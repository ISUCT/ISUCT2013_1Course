public class PhraseOMatic {
public static void main (String[] args) {
String[] wordListOne = ("�����", "���������", "����������");
String[] wordListTwo = ("����������", "���������", "���������");
String[] wordListThree = ("���", "����", "�������");
int oneLength = wordListOne.length;
int oneLength = wordListTwo.length;
int oneLength = wordListThree.length;
int rand1 = (int) (Math.random() * oneLenght);
int rand2 = (int) (Math.random() * twoLenght);
int rand3 = (int) (Math.random() * threeLenght);
String phrase = wordListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListTwo[rand3];
System.out.println("���, ��� ��� �����, - ��� " + phrase);
}
}