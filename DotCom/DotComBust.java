package dotComApp;

import java.util.*;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("NBA.com");
        DotCom two = new DotCom();
        two.setName("lenta.com");
        DotCom three = new DotCom();
        three.setName("sports.com");
        DotCom four = new DotCom();
        four.setName("twitter.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        dotComsList.add(four);
        System.out.println("Ваша цель - потопить четыре 'сайта'.");
        System.out.println("NBA.com, lenta.com, sports.com, twitter.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComsList) {
            
            ArrayList<String> newLocation = helper.placeDotCom(3, 7);
            System.out.println(newLocation);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {

        while (!dotComsList.isEmpty()) {
            
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();

    }

    private void checkUserGuess(String userGuess) {
        
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");
        
        if (numOfGuesses <= 18) {
            
            System.out.println("Это заняло у нас всего" + numOfGuesses + "попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули.");
        } else {
            
            System.out.println("Это заняло у вас довольно мало времени." + numOfGuesses + "попыток.");
            System.out.println("Рыбы водяд хороводы вокруг ваших вложений.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
