package lt.techin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//  Užduotis Nr. 1

        byte myByte = 127;
        short myShort = 256;
        int myInt = 33333;
        long myLong = 66666;
        float myFloat = 1.7897f;
        double myDouble = 1.89764654;
        boolean myBoolean = true;
        char myChar = 'N';

        System.out.println(("myByte: " + myByte)+'\n'+("myShort: " + myShort)+'\n'+("myInt: " + myInt)+'\n'+("myLong: " + myLong)+'\n'+ ("myFloat: " + myFloat) + '\n' + ("myDouble: " + myDouble)+ '\n' + ("myBoolean: " + myBoolean) + '\n' + ("myChar: " + myChar));

//  Užduotis Nr. 2

//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Įveskite pirmą sveiką skaičių nuo -128 iki 127: ");
//        byte myByte1 = scan1.nextByte();
//        System.out.println("Įveskite antrą sveiką skaičių nuo -128 iki 127: ");
//        byte myByte2 =scan1.nextByte();
//        System.out.println("Suma: " + (myByte1 + myByte2) + '\n' + "Atimtis: " + (myByte1 - myByte2) + '\n' + "Sandauga: " + myByte1 * myByte2 + '\n' + "Dalyba: " + myByte1 / myByte2);
//
//        System.out.println("Įveskite pirmą sveiką skaičių nuo -32768 iki 32767: ");
//        short myShort1 = scan1.nextShort();
//        System.out.println("Įveskite antrą sveiką skaičių nuo -32768 iki 32767: ");
//        short myShort2 =scan1.nextShort();
//        System.out.println("Suma: " + (myShort1 + myShort2) + '\n' + "Skirtumas: " + (myShort1 - myShort2) + '\n' + "Sandauga: " + myShort1 * myShort2 + '\n' + "Dalmuo: " + myShort1 / myShort2);

//  Užduotis Nr. 3

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Įveskite pirmą realųjį skaičių (pvz.: -1.8972f, 2.98798f): ");
        float myFloat1 = scan2.nextFloat();
        System.out.println("Įveskite sveiką realųjį skaičių (pvz.: -1.8972f, 2.98798f): ");
        float myFloat2 =scan2.nextFloat();
        System.out.println("Suma: " + (myFloat1 + myFloat2) +'\n' + "Skirtumas: " + (myFloat1 - myFloat2) + '\n' + "Sandauga: " + myFloat1 * myFloat2 + '\n' + "Dalmuo: " + myFloat1 / myFloat2);

    }
}

