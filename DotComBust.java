package javaapplication8;
import java.util.*;

public class DotComBust {
 private GameHelper helper = new GameHelper();
private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
private int numOfGuesses = 0;
    
private void setUpGame(){
DotCom one = new DotCom();
one.setName("Jabiraz.com");
DotCom two = new DotCom();
two.setName("Farasam.com");
DotCom three = new DotCom();
three.setName("Oproc.com");
DotCom four = new DotCom();
four.setName("Razvoz.com");
DotCom five = new DotCom();
five.setName("Siamba.ru);

dotComsList.add(one);
dotComsList.add(two);
dotComsList.add(three);
dotComsList.add(four);
dotComsLost.add(five);
    
System.out.println("Задача: потопить четыре сайта.");
System.out.println("Jabiraz.com,Farasam.com ,Oproc.com,Siamba.ru");
System.out.println("Попытайтесь потопить их за минимальное количество ходов.");
    
for (DotCom dotComToSet : dotComsList){
ArrayList<String> newLocation = helper.placeDotCom(3,7);
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
String result = "Промах";
for (DotCom dotComToTest : dotComsList) {
result = dotComToTest.checkYourself(userGuess);
if (result.equals("Попадение")) {
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
System.out.println("Все сайты потоплены");
if (numOfGuesses <= 18) {
System.out.println("Это заняло у вас " + numOfGuesses + "попыток.");
System.out.println("Вы успели выбраться до того, как ваши данные утонули.");
} else {
System.out.println("Это заняло у вас довольно мало времени." + numOfGuesses + "попыток.");
System.out.println("Данные на дне.");
        }
    }

public static void main(String[] args) {
DotComBust game = new DotComBust();
game.setUpGame();
game.startPlaying();
    }
}
