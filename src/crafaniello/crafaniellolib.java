//Christopher Rafaniello --- 9/20/18
package crafaniello;

public class crafaniellolib {

    public static void println(String str) {
       System.out.println(str);
    }

    public static Boolean isPalindrome(String str1) {
        String newStr = "";
        for (int i = str1.length(); i >= 0; i-- ) {
            String addedString = str1.substring(i);
            newStr = newStr + addedString;
        }
        if (str1 == newStr){
            return true;
        }
        else {
            return false;
        }
    }

    public static int sumUpTo( int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        return sum;


    }

    public static void fooBarBaz( int num1) {
        String storage = "";
        for ( int i = 1; i <= num1; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                storage = storage + "baz ";
            }
            else if ((i % 3) == 0) {
                storage = storage + "foo ";
            }
            else if ((i % 5) == 0) {
                storage = storage + "bar ";
            }
            else {
                storage = storage + " " + i + " ";
            }
        }
        System.out.print(storage);
    }

    public static void multiplicationTable (int base, int range) {
        String table = "";
        for (int x = 0; x <= range; x++) {
            int next = base * x;
            table = table + next + " ";
        }
        System.out.println(table);
    }


    public static String dateString(String date) {
        String first = date.substring(0,2);
        String second = date.substring(3,5);
        String third = date.substring(6,10);
        String newString = second + "-" + first + "-" + third;
        return newString;




    }


}