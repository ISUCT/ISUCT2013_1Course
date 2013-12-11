/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.*;

/**
 *
 * @author метро
 */
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {

        DotCom one = new DotCom();
        one.setName("Animals.com");
        DotCom two = new DotCom();
        two.setName("Flowers.com");
        DotCom three = new DotCom();
        three.setName("Cinema.com");
        DotCom four = new DotCom();
        four.setName("Irina.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        dotComsList.add(four);
        System.out.println("Ваша цель - потопить четыре сайта");
        System.out.println("Animals.com, Flowers.com, Cinema.com, Irina.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComsList) {

            ArrayList<String> newLocation = helper.placeDotCom(3);
            System.out.println(newLocation);
            dotComToSet.setLocatoinCells(newLocation);



        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделай ход");
            checkUserGuess(userGuess);

        }
        finishgame();

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

    private void finishgame() {
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего" +   numOfGuesses   + "попыток");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули");

        } else {
            System.out.println("Это заняло у вас довольно много времени" + numOfGuesses + "попыток");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");

        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();

    }

    public class DotCom {

        private ArrayList<String> locationCells;
        private String name;

        public void setLocatoinCells(ArrayList<String> loc) {
            locationCells = loc;

        }

        public void setName(String n) {
            name = n;
        }

        public String checkYourself(String userInput) {
            String result = "Мимо";
            int index = locationCells.indexOf(userInput);
            if (index >= 0) {
                locationCells.remove(index);

                if (locationCells.isEmpty()) {
                    result = "Потопил";
                    System.out.println("Ой! Вы потопили" + name + " : ( ");

                } else {
                    result = "Попал";
                }
            }
            return result;

        }
    }
}
