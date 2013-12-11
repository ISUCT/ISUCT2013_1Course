
package src;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    private void setUpGame() {
        
        DotCom one = new DotCom();
        one.setName("Site1.com");
        
        DotCom two = new DotCom();
        two.setName("Site2.com");
        
        DotCom three = new DotCom();
        three.setName("Site3.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("Ваша цель - потопить три" сайта ".");
        System.out.println("Site1.com, Site2.com, Site3.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");
        
        for (DotCom dotComSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
         
        private void startPlaying(){
                while (!dotComList.isEmpty()){
                    String userGuess = helper.getUserInput("Сделай ход");
                    checkUserGuess(userGuess);
                }
        }
        private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result="Мимо";
        for(DotCom dotComToTest : dotComList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")){
                break;
            }
            if (result.equals("Потопил")){
                dotComList.remove(dotComToTest);
                break;
            }
         }
        System.out.println(result);
        }
        private void finishGame(){
        System.out.println("Все "сайты"ушли ко дну! Ваши акции теперь ничего не стоят.");
        if(numOfGuesses <= 18){
            System.out.println("Это заняло у вас всего"+numOfGuesses+"попыток.");
            System.out.println("Вы успеи выбраться до того, как ваши вложения утонули.");
           }else{
            System.out.println("Это заняло у вас довольно много времени."+numOfGuesses+"попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
            }        
        }
        public static void main (String[]args){
            DotComBust game = new DotComBust();
            game.setUpGame();
            game.startPlaying();
        }
            
        
}
