public clacc PraceOMatic {
public static void mail (String[] args) {
String[] worldListOne = {"������", "�������", "����", "��������"};
String[] worldListTwo = {"��������", "����������", "������������", "����������"};
String[] worldListTwo = {"�������", "���", "���", "����"};
int oneLenght = worldListOne.length;
int twoLenght = worldListTwo.length;
int treeLenght = worldListTree.length;
int rand1 = (int) (Math.random() * oneLenght);
int rand2 = (int) (Math.random() * twoLenght);
int rand3 = (int) (Math.random() * threeLenght);
String phrase = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];
System.out.println("���, ��� ��� �����, - ��� " + phrase):
   }
}