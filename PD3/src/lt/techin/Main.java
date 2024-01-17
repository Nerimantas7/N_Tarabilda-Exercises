package lt.techin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//  Užduotis Nr. 1

//        byte myByte = 127;
//        short myShort = 256;
//        int myInt = 33333;
//        long myLong = 66666;
//        float myFloat = 1.7897f;
//        double myDouble = 1.89764654;
//        boolean myBoolean = true;
//        char myChar = 'N';
//
//        System.out.println(("myByte: " + myByte)+'\n'+("myShort: " + myShort)+'\n'+("myInt: " + myInt)+'\n'+("myLong: " + myLong)+'\n'+ ("myFloat: " + myFloat) + '\n' + ("myDouble: " + myDouble)+ '\n' + ("myBoolean: " + myBoolean) + '\n' + ("myChar: " + myChar));

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

//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Įveskite pirmą realųjį skaičių (pvz.: -1.8972f, 2.98798f): ");
//        float myFloat1 = scan2.nextFloat();
//        System.out.println("Įveskite sveiką realųjį skaičių (pvz.: -1.8972f, 2.98798f): ");
//        float myFloat2 =scan2.nextFloat();
//        System.out.println("Suma: " + (myFloat1 + myFloat2) +'\n' + "Skirtumas: " + (myFloat1 - myFloat2) + '\n' + "Sandauga: " + myFloat1 * myFloat2 + '\n' + "Dalmuo: " + myFloat1 / myFloat2);

//  Užduotis Nr. 4
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Įveskite pirmąjį loginį kintamąjį (true arba false): ");
//        boolean myBoolean1 = scan.nextBoolean();
//        System.out.println("Įveskite antrąjį loginį kintamąjį (true arba false): ");
//        boolean myBoolean2 =scan.nextBoolean();
//        System.out.println("Konjunkcija (ir): " + (myBoolean1 && myBoolean2)+ '\n' + "Disjunkcija (arba): " + (myBoolean1 || myBoolean2) +'\n' + "Inversija (ne): " +'\n' + "Pirmas loginamasis kintamasis: " +(!myBoolean1) +'\n' + "Antras loginamasis kintamasis: " +(!myBoolean2));


//  Užduotis Nr. 5
//        byte aByte = 55;
//        short aShort = 256;
//        int aInt = 10258;
//        long aLong = 65000;
//        float aFloat = 2.5894f;
//        double aDouble = 2.87941657987;
//        System.out.println("aByte: " + aByte +'\n' + "aShort: " + aShort +'\n' + "aInt: " + aInt +'\n' + "aLong: " + aLong +'\n' + "aFloat: " + aFloat +'\n' + "aDouble: " + aDouble);
//        long bLong = (long)aShort;
//        float bFloat = (float)aLong;
//        double bDouble = (double)aInt;
//        System.out.println("aLong = (long)aShort: " + bLong +'\n' + "bFloat = (float)aLong: " + bFloat +'\n' + "bDouble = (double)aInt: " + bDouble);
//        byte cByte = (byte)aInt;
//        int cInt = (int)aLong;
//        long cLong = (long) aFloat;
//        System.out.println("cByte = (byte)aInt: " + cByte +'\n' + "cInt = (int)aLong: " + cInt +'\n' + "cLong = (long) aFloat: " + cLong);

//  Užduotis Nr. 6
//        Integer wInt = 1256;
//        Long wLong = 46135424125413145L;
//        Float wFloat = 2.65487f;
//        Double wDouble = -4687.8974646;
//        System.out.println("wInt.toString: " +wInt.toString());
//        System.out.println("wLong.doubleValue: " +wLong.doubleValue());
//        System.out.println("wFloat.byteValue: " +wFloat.byteValue());
//        System.out.println("wDouble.hashCode: " +wDouble.hashCode());

//  Užduotis Nr. 7
//        String myText1 = new String("Žalgirio mūšis įvyko 1410 m. liepos 15 d. ");
//        System.out.println(myText1);
//        String myText2 = new String("Oršos mūšis įvyko 1514 m. rugsėjo 8 d. ");
//        System.out.println(myText2);
//        String myText3 = new String("Salaspilio (Kircholmo)  mūšis įvyko 1605 m. rugsėjo 27 d. ");
//        System.out.println(myText3);
//        System.out.println("myText1.length() + myText2.length() + myText3.length(): " + (myText1.length() + myText2.length() + myText3.length()));
//        System.out.println("myText1.concat(myText2): " + myText1.concat(myText2));
//        System.out.println("myText2.compareTo(myText3): " + myText2.compareTo(myText3));
//        System.out.println("myText3.substring(1, 15): " + myText3.substring(1, 15));

//  Užduotis Nr. 8
//        double a1 = 7.5, a2 = 6.5, a3 = 4.5, a4 = 3, a5 = 47.5, a6 = 5.5, b1 = 12.78, b2 = 15.4, b3 = 2.75;
//        double c = ((a1 * a2)-(a3 * a4))/(a5 - a6);
//        double d = b1/(b2 - b3);
//        System.out.println("Ar teisinga lygybė: (7.5x6.5-4.x3)/(47.5-5.5)=12.78/(15.4-2.75)?");
//        if (c == d){
//            System.out.println("Lygybė teisinga: true");
//        }else {
//            System.out.println("Lygybė neteisinga: false");
//        }
//  Užduotis Nr. 9
//        int myInt = 10;
//        System.out.println("Primitivusis kintamasis int: " + myInt);
//        double myDou = 20.56;
//        System.out.println("Primitivusis kintamasis double: " + myDou);
//        Integer myInteger = Integer.valueOf(myInt);
//        System.out.println("Primitiviojo kintamojo int vertimas į objektą Integer (autoboxing): " + myInteger);
//        System.out.println("Objekto myInteger hach kodas: " + myInteger.hashCode());
//        Double myDouble = Double.valueOf(myDou);
//        System.out.println("Primitiviojo kintamojo double vertimas į objektą Double (autoboxing): " + myDouble);
//        System.out.println("Objekto myDouble hach kodas: " + myDouble.hashCode());
//        int myInt1 = myInteger;
//        System.out.println("Primitivusis kintamasis int: " + myInt1);  //unboxing
//        double myDou1 = myDouble;
//        System.out.println("Primitivusis kintamasis double: " + myDou1);    //unboxing

//  Užduotis Nr. 10
        String myText = "1 5 8 145 35 68 94 12 77";
        System.out.println(myText);
        String[] textNumbers = myText.split(" ");
        System.out.println(textNumbers.length);
        int[] numbers = new int[textNumbers.length];
        System.out.println(numbers.length);
        for (int i = 0; i < textNumbers.length; i++){
            numbers[i] = Integer.parseInt(textNumbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
        int sum =0;
        for (int i = 0; i < textNumbers.length; i++
             ) {
            sum += numbers[i];
        }
        System.out.println("Suma: " + sum);

    }
}

