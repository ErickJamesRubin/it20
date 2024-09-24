package Second_Package;

public class Display_via_For_Loop {
    public static void main (String [] args){
        String[] MyGames = {"Mobile Legends","Clash of Clans","Honor of Kings","8 Ball Pool","NBA 2k14","Candy Crush"};

        System.out.println("My Games installed: ");
        for (int i = 0; i < MyGames.length; i++) {
            System.out.println("- " + MyGames[i]);
            
        }
    }
}
