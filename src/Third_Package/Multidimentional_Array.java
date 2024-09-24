package Third_Package;

public class Multidimentional_Array {
    public static void main (String [] args){
        char[][] kite = {
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {' ', ' ', '*', ' ', '*', ' ', ' '},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {'*', '*', '*', '*', '*', '*', '*'},
            {' ', '*', ' ', ' ', ' ', '*', ' '},
            {' ', ' ', '*', ' ', '*', ' ', ' '},
            {' ', ' ', ' ', '*', ' ', ' ', ' '}
        };

        for (int i = 0; i < kite.length; i++) {
            for (int j = 0; j < kite[i].length; j++) {
                System.out.print(kite[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}
