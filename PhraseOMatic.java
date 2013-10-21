
public class PhraseOMatic {
	public static void main (String[] args) {
		String[] wordListOne = {"неделю","мес€ц","год"};
		String[] wordListTwo = {"рух","циклопов","ифритов","скелетов","медуз","гарпий","василиска"};
		String[] wordListThree = {"попул€ци€","численность"};
		String[] wordListFour = {"всех домов","всех поселков","всех домов","всех хижин","всех городов"};
		String[] wordListFive = {"увеличилась втрое","увеличилась вдвое","увеличилась вчетверо","уменьшилась вдвое","уменьшилась втрое"};
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	int fourLength = wordListFour.length;
	int fiveLength = wordListFive.length;
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		int rand4 = (int) (Math.random() * fourLength);
		int rand5 = (int) (Math.random() * fiveLength);
	String phrase = wordListOne[rand1] +" "+ wordListTwo[rand2] +" "+ wordListThree[rand3] +" "+ wordListFour[rand4] +" "+ wordListFive[rand5];
	System.out.println("јстрологи объ€вили " + phrase);
	}

}
