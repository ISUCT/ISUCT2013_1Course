public class PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = {"Kamen", "Kniga", "Bumaga"};
		String[] wordListTwo = {"Kamen", "Kniga", "Bumaga"};
		String[] wordListThree = {"Kamen", "Kniga", "Bumaga"};
		String[] wordListFour = {"Kamen", "Kniga", "Bumaga"};
		String[] wordListFive = {"kamen", "kniga", "bumaga"};
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
					String phrase1 = wordListOne[rand1] +", "+ wordListTwo[rand2] +", "+ wordListThree[rand3] +", "+ wordListFour[rand4] + ".";
					String phrase2 = wordListFive[rand5];
						System.out.println("Ugadaj, skol'ko raz vypadet " + phrase2 + "? ");
						System.out.println("Primery: " + phrase1);
	}

}