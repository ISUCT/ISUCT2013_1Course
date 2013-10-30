public clacc PraceOMatic {
public static void mail (String[] args) {
String[] worldListOne = {"добрый", "честный", "злой", "вежливый"};
String[] worldListTwo = {"приятный", "заботливый", "внимательный", "прекрасный"};
String[] worldListTwo = {"человек", "пес", "кот", "папа"};
int oneLenght = worldListOne.length;
int twoLenght = worldListTwo.length;
int treeLenght = worldListTree.length;
int rand1 = (int) (Math.random() * oneLenght);
int rand2 = (int) (Math.random() * twoLenght);
int rand3 = (int) (Math.random() * threeLenght);
String phrase = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];
System.out.println("все, что нам нужно, - это " + phrase):
   }
}