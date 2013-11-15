public class PhraseOMatic {
        public static void main (String[] args) {
                String[] wordListOne = {"Io?ai","Euo","N?i","абырвалг","Ieec","Niae?a? iaoe:","Iaoe a aaia?"};
                String[] wordListTwo = {"oaie","i?eno","eoe","aa?","i?eno e iaa","aa? e eoe","aea","aea"};
                String[] wordListThree = {"a aaia?","a aoe","iaoe ia ainna"," eae","ooe eio + aa","ia ?ae 109"};
                String[] wordListFour = {"a ii","a ee?eo n?i?ii"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength = wordListFour.length;
                int rand1 = (int) (Math.random() * oneLength);
                int rand2 = (int) (Math.random() * twoLength);
                int rand3 = (int) (Math.random() * threeLength);
                int rand4 = (int) (Math.random() * fourLength);
        String phrase = wordListOne[rand1] +" "+ wordListTwo[rand2] +" "+ wordListThree[rand3] +" "+ wordListFour[rand4];
        System.out.println("Niiaф:" + phrase);
        }
        }