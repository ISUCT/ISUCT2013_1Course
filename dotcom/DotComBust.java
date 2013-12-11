package dotcom;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    private void setUpGame() {
        
        DotCom one = new DotCom();
        one.setName("java.com");
        
        DotCom two = new DotCom();
        two.setName("phones.com");
        
        DotCom three = new DotCom();
        three.setName("myspace.com");
        
        DotCom four = new DotCom();
        four.setName("war.com");
        
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        dotComsList.add(four);
        
        System.out.println("Ваша цель - потопить четыре сайта");
        System.out.println(".com, phones.com, myspace.com, war.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");
        
        for (DotCom dotComSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3, 7);
            dotComToSet.setLocationCells(newLocation);
        }
    }
         
            private void startPlaying(){
                while (!dotComsList.isEmpty()){
                String userGuess = helper.getUserInput("Сделайте ход");
                checkUserGuess(userGuess);
                }
                finishGame();
            }
       private void checkUserGuess(String userGuess) {

        numOfGuesses++;

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
            if (numOfGuesses <= 18){
            System.out.println("Это заняло у вас всего" + numOfGuesses + "попыток.");
            System.out.println("Вы успели выбраться до того, как все ваши сайты потонули.");
    } else {
        System.out.println("Это заняло у вас довольно много времени." + numOfGuesses + "попыток.");
        System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
            }
     }
    public static void main (String[] args){
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
    }
}
            
     