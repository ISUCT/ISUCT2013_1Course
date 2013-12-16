package Boer;

public class phone {
    int contactList = 0;
    String songPlaying;
    String phonename;
    
   
    public void ring(){
        System.out.println("Phone is ringing");
    }
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
    void callMusic(String phonename){
        if ("Nokia".equals(phonename)){
            System.out.println("playing Nokia music");
        } else {
            System.out.println("playing other phone`s music");
        }
    }
}