/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Alena_Khruleva
 */
import java.util.*;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        DotCom four = new DotCom();
        four.setName("KinoPoisk.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        dotComsList.add(four);
        System.out.println("Ваша цель - потопить четыре сайта");
        System.out.println("Pets.com, eToys.com, Go2.com, KinoPoisk.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");
        for (DotCom dotComToSet : dotComsList) {
             
            ArrayList<String> newLocation = helper.placeDotCom(3);
            System.out.println (newLocation);
            dotComToSet.setLocationCells(newLocation);



        }
    }

    private void startPlaing() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            CheckUserGuess(userGuess);
        }
        finishGame();
    }

    private void CheckUserGuess(String userGuess) {
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
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + "Попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули");
        } else {
            System.out.println("Это заняло у вас довольно много времени." + numOfGuesses + "Попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }

    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaing();
    }
}
