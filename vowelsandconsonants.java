import java.util.Scanner;
class VowelsAndConsonants
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter Character: ");
	char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'A') {
                System.out.println(ch + " is a vowel.");
            } else if (ch == 'e' || ch == 'E') {
                System.out.println(ch + " is a vowel.");
            } else if (ch == 'i' || ch == 'I') {
                System.out.println(ch + " is a vowel.");
            } else if (ch == 'o' || ch == 'O') {
                System.out.println(ch + " is a vowel.");
            } else if (ch == 'u' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid character.");
        }
 }
}