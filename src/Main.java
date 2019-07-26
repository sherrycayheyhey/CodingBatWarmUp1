public class Main {

    public static void main(String[] args) {

        System.out.println("sleepIn");
        System.out.println(sleepIn(false, false)); //true
        System.out.println(sleepIn(true, false)); //false
        System.out.println(sleepIn(false, true)); //true
        System.out.println("");

        System.out.println("monkeyTrouble");
        System.out.println(monkeyTrouble(true, true)); //true
        System.out.println(monkeyTrouble(false, false)); //true
        System.out.println(monkeyTrouble(true, false)); //false
        System.out.println("");

        System.out.println("sumDouble");
        System.out.println(sumDouble(1, 2)); //3
        System.out.println(sumDouble(3, 2)); //5
        System.out.println(sumDouble(2, 2)); //8
        System.out.println("");


    }


    /////////////////////////////////////////////////sleepIn/////////////////////////////////////////////////
    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    //We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false || vacation == true){
            return true;
        }
        else {
            return false;
        }
    }



    /////////////////////////////////////////////////monkeyTrouble/////////////////////////////////////////////////
    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble
    //if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile){
            return true;
        }
        return false;
    }



    /////////////////////////////////////////////////sumDouble/////////////////////////////////////////////////
    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public static int sumDouble(int a, int b) {
        if(a == b){
            return 2 * (a + b);
        }
        return a + b;
    }






}
