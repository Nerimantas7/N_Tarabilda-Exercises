package lt.techin;
//        Java kalbos sintakse PD2
import com.sun.jdi.connect.Transport;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      Uzduotis Nr. 1
//        System.out.println("Welcome to Java");
//        System.out.println("Learning Java Now");
//        System.out.println("Programming is fun");

//      Uzduotis Nr.2
//        System.out.println(" J     A     V     V     A");
//        System.out.println(" J    A A     V   V     A A");
//        System.out.println(" J   A A A     V V     A A A");
//        System.out.println("JJ  A     A     V     A     A");

//      Uzduotis Nr. 3
//        System.out.println("a       a^2     a^3     a^4");
//        System.out.println("---------------------------");
//
//        for (int i = 1; i <= 4; i++) {
//            System.out.println(i + "        " + (i * i) + "       " + (i * i * i) + "      " + (i * i * i * i));
//        }

//      Uzduotis Nr. 4
        Scanner scan = new Scanner(System.in);
        System.out.println("Įveskite savo vardą:");
        String userName = scan.nextLine();
        System.out.println("Sveiki, " + userName);
        /* Uzduotis Nr. 5
*       čia gali būti patalpinami įvairūs komentarai
*       paaiškinimai
*       instrukcijos ir kt.
* */

        //      Uzduotis Nr. 6

        Automobilis Audi = new Automobilis("Audi","Quattro", 2020);

    }
}
