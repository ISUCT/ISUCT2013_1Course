public class PhraseOMatic {
	public static void main (String[] args) {
		String[] wordListOne = {"пластичный", "амбициозный", "агрессивный", "нестабильный"};
		String[] wordListTwo = {"умный", "выносливый", "развитый", "неугомонный"};
		String[] wordListThree = {"человек", "животное", "насекомое", "общество"};
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
	System.out.printlh("Все, что нам нужно, - это " + phrase);
	}
}
	