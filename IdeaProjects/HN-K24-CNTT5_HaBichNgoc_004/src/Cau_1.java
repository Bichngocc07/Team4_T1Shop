import java.util.Scanner;

public class Cau_1 {
    static Scanner sc = new Scanner(System.in);
    static boolean isLetterAZ(char c) {
        return (c >= 'a' && c <= 'z');
    }
    static boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    static void separateVowelConsonant() {
        System.out.println("Nhap chuoi:");
        String s = sc.nextLine();

        String vowel = "";
        String consonant = "";
        for(int i=0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));

            if(isLetterAZ(c)){
                if(isVowel(c))
                    vowel += c;
                else
                    consonant += c;
            }
        }

        System.out.println("Nguyen am: " + vowel);
        System.out.println("Phu am: " + consonant);
    }
    static void mostFrequentChar() {
        System.out.println("Nhap chuoi:");
        String s = sc.nextLine().toLowerCase();

        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isLetterAZ(c)){
                count[c-'a']++;
            }
        }

        int max = 0;
        char result = ' ';

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isLetterAZ(c)){
                if(count[c-'a'] > max){
                    max = count[c-'a'];
                    result = c;
                }
            }
        }

        System.out.println(result + " (xuat hien " + max + " lan)");
    }

}