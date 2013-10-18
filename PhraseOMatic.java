public class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordListOne = {"круглосуточный", "положительный", "готовый", "числовой", "общий", "существующий", "правильный"};
        String[] wordListTwo = {"крайний", "работающий", "использованный", "направленный", "динамичный", "годовой", "дневной"};
        String[] wordListThree = {"отчет", "процесс", "тип", "подход", "уровень", "метод", "вид", "период", "вывод", "кот"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
 
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Все, что нам нужно, - это " + phrase);
        }
}