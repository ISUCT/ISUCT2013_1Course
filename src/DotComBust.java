
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
        
        System.out.println("Ваша цель - потопить все сайты");
        System.out.println("Site1.com, Site2.com, Site3.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");
        
        for (DotCom dotComSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
         
            private void startPlaying(){
                while (!dotComList.isEmpty()){
                ArrayList<String> newLocation = helper.placeDotCom(3);
                }
            }
        
}
