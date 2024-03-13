/*
import java.util.Scanner;

class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        boolean isAlphabet = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
        System.out.println("The entered character is " + (isAlphabet ? "an alphabet." : "not an alphabet."));

        scanner.close();
    }
}

*/

import java.util.Scanner;
class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        System.out.println(((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))?((ch>='A'&&ch='Z')?"UpperCase ": "Lowercase"):"Alphabet":"Not an Alphabet");
               
    }
}

