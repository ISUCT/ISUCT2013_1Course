public class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordListOne = {"e?oaeinooi?iue", "iiei?eoaeuiue", "aioiaue", "?eneiaie", "iauee", "nouanoao?uee", "i?aaeeuiue"};
        String[] wordListTwo = {"e?aeiee", "?aaioa?uee", "eniieuciaaiiue", "iai?aaeaiiue", "aeiaie?iue", "aiaiaie", "aiaaiie"};
        String[] wordListThree = {"io?ao", "i?ioann", "oei", "iiaoia", "o?iaaiu", "iaoia", "aea", "ia?eia", "auaia", "eio"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
 
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Ana, ?oi iai io?ii, - yoi " + phrase);
        }
}
