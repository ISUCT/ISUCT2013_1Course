package Boer;

public abstract class phone {
    int contactList = 0;
    String songPlaying;
    String phoneName;
    
   
    public abstract void ring();
    
    public int setContacts(int contactList){
        contactList=contactList+1;
        return contactList;
    }
    
    public void playSong(int playing){
        while (playing > 0){
            System.out.println("Playing nice songs");
            playing = playing-1;
        }
        if (playing < 0){
            System.out.println("All songs were played");
        }
    }
    void callMusic(String phoneName){
        if ("Nokia".equals(phoneName)){
            System.out.println("playing nice Nokia  music");
        } else {
            if (phoneName.equals(phoneName)){
                System.out.println("playng" + phoneName + "music");
            }
        }
    }
}