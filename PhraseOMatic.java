public class PhraseOMatic {
public static void main (String[] args) {
String[] wordListOne = {"ïðåêîáùåñòâî", "ïëîæüíûé", "ãîòîïåñ", "÷èñëîâîé", "ñóùåñòâóþùèé", "ïðàïðåêâèüíûé"};
String[] wordListTwo = {"êðàéíèé", "ðàáîòþùèéïåñ", "èñïîëü", "íàïðïåñàâëííûé", "äèíàè÷çëîé", "ãîçëîéîé", "çëîéíåâíîé"};
String[] wordListThree = { "ïðîöåññ", "òèï", "÷åëîâåê", "óðîâåíü", "ìåòî", "ïåñâèä", "ïåðèîä", "âûâîä", "çëîé"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
 
String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
System.out.println("Âñå, ÷òî íàì íóæíî, - ýòî " + phrase);
        }
}
