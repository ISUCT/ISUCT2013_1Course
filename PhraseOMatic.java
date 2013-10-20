public class PhraseOMatic {
	public static void main (String[] args) {
		String[] wordListOne = {"Нужен","Ищу","Срочно","Быстро","Плиз","Собираю пати:","Пати в дандж"};
		String[] wordListTwo = {"танк","прист","лук","вар","прист и маг","вар и лук","2 чела","3 чела"};
		String[] wordListThree = {"в дандж","в гуй","пати на босса","80+ лвл","фул инт + дд","на рай 109"};
		String[] wordListFour = {"в пм","в личку срочно"};
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	int fourLength = wordListFour.length;
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		int rand4 = (int) (Math.random() * fourLength);
	String phrase = wordListOne[rand1] +" "+ wordListTwo[rand2] +" "+ wordListThree[rand3] +" "+ wordListFour[rand4];
	System.out.println("Сообщение в чате:" + phrase);
	}
	}
