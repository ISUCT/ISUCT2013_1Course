public class PhraseOMatic {
public static void main (String[] args) {
String[] wordListOne = {"Russia", "Germany", "French", "Brazil", "USA", "Serbia"};
String[] wordListTwo = {"Polland", "Portugal", "Cuba", "Austria", "Hungary", "Monako", "Horvatia"};
String[] wordListThree = { "England", "Eesti", "Schweiz", "Chehia", "Makedonia", "Mongolia", "Turcia", "Andorra", "Italia"};
String[] wordListFour = { "Litva", "Latvia", "Ukraina", "Kipr", "Irlandia"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength = wordListFour.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random() * fourLength);
 String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + " " + wordListFour[rand4];
System.out.println("Âñå, ÷òî íàì íóæíî, - ýòî " + phrase);
        }
}
