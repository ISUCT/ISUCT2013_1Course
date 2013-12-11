package pkgnew;
 
import java.util.ArrayList;

public class DotCom {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuess = 0;
    
    private void setUpGame(){
        
        DotCom one = new DotCom();
        one.setName("Site1.com");
        
        DotCom two = new DotCom();
        two.setName("Site2.com");
        
        DotCom three = new DotCom();
        three.setName("Site3.com");
        
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("Ваша цель - потопить три сайта");
        System.out.println("Site1.com, Site2.com, Site3.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");
        
        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying() {
        while (!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Сделать ход");
            checkUserGuess(userGuess);
        }
            finishGame();
       }
    

    private void checkUserGuess(String userGuess) {

        numOfGuess++;

        String result = "мимо";
        
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
            if (numOfGuess <= 18){ 
            System.out.println("Это заняло у вас всего" + numOfGuesses + "попыток.");
            System.out.println("Вы успели выбраться до того, как все ваши сайты потонули.");
    } else {
        System.out.println("Это заняло у вас довольно много времени." + numOfGuesses + "попыток.");
        System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
            }
     }
    public static void main (String[] args){
    DotComBust game = new DotComBust();
    game.seUpGame();
    game.startPlaying();
    }
}
