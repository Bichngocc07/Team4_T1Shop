//import java.util.Scanner;
//
//public class Text_Code {
//
//    static Scanner sc = new Scanner(System.in);
//
//    // ================= CÂU 1 =================
//
//    // Kiểm tra chữ cái a-z
//    static boolean isLetterAZ(char c) {
//        return (c >= 'a' && c <= 'z');
//    }
//
//    // Kiểm tra nguyên âm
//    static boolean isVowel(char c) {
//        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
//    }
//
//    // ----- Câu 1 - Phần 1
//    static void separateVowelConsonant() {
//        System.out.println("Nhap chuoi:");
//        String s = sc.nextLine();
//
//        String vowel = "";
//        String consonant = "";
//
//        for(int i=0;i<s.length();i++){
//            char c = Character.toLowerCase(s.charAt(i));
//
//            if(isLetterAZ(c)){
//                if(isVowel(c))
//                    vowel += c;
//                else
//                    consonant += c;
//            }
//        }
//
//        System.out.println("Nguyen am: " + vowel);
//        System.out.println("Phu am: " + consonant);
//    }
//
//    // ----- Câu 1 - Phần 2
//    static void mostFrequentChar() {
//        System.out.println("Nhap chuoi:");
//        String s = sc.nextLine().toLowerCase();
//
//        int[] count = new int[26];
//
//        // đếm
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if(isLetterAZ(c)){
//                count[c-'a']++;
//            }
//        }
//
//        // tìm max
//        int max = 0;
//        char result = ' ';
//
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if(isLetterAZ(c)){
//                if(count[c-'a'] > max){
//                    max = count[c-'a'];
//                    result = c;
//                }
//            }
//        }
//
//        System.out.println(result + " (xuat hien " + max + " lan)");
//    }
//
//
//    // ================= CÂU 2 =================
//
//    // ----- Phần 1: Delete & Shift Left
//    static void deleteShiftLeft() {
//
//        System.out.print("Nhap n: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++)
//            arr[i] = sc.nextInt();
//
//        System.out.print("Nhap x: ");
//        int x = sc.nextInt();
//
//        int k = 0; // kích thước mới
//
//        for(int i=0;i<n;i++){
//            if(arr[i] != x){
//                arr[k] = arr[i];
//                k++;
//            }
//        }
//
//        System.out.println("Mang sau khi xoa:");
//        for(int i=0;i<k;i++)
//            System.out.print(arr[i]+" ");
//
//        System.out.println("\nKich thuoc moi: " + k);
//    }
//
//    // ----- Phần 2: Partition chẵn lẻ
//    static void evenOddPartition() {
//
//        System.out.print("Nhap n: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++)
//            arr[i] = sc.nextInt();
//
//        int left = 0;
//        int right = n-1;
//
//        while(left < right){
//            while(left < right && arr[left]%2==0) left++;
//            while(left < right && arr[right]%2==1) right--;
//
//            if(left < right){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//        }
//
//        System.out.println("Mang sau khi phan hoach:");
//        for(int i=0;i<n;i++)
//            System.out.print(arr[i]+" ");
//    }
//
//
//    // ================= CÂU 3 =================
//
//    static boolean exists(int[] arr, int size, int value){
//        for(int i=0;i<size;i++)
//            if(arr[i]==value)
//                return true;
//        return false;
//    }
//
//    static void intersectionArray(){
//
//        System.out.print("Nhap n: ");
//        int n = sc.nextInt();
//        int[] A = new int[n];
//        for(int i=0;i<n;i++)
//            A[i]=sc.nextInt();
//
//        System.out.print("Nhap m: ");
//        int m = sc.nextInt();
//        int[] B = new int[m];
//        for(int i=0;i<m;i++)
//            B[i]=sc.nextInt();
//
//        int[] result = new int[Math.min(n,m)];
//        int k=0;
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(A[i]==B[j] && !exists(result,k,A[i])){
//                    result[k++] = A[i];
//                }
//            }
//        }
//
//        System.out.println("Giao hai mang:");
//        for(int i=0;i<k;i++)
//            System.out.print(result[i]+" ");
//    }
//
//
//    // ================= MAIN MENU =================
//
//    public static void main(String[] args) {
//
//        int choice;
//        do{
//            System.out.println("\n===== MENU =====");
//            System.out.println("1. Tach nguyen am / phu am");
//            System.out.println("2. Ky tu xuat hien nhieu nhat");
//            System.out.println("3. Xoa & dich trai");
//            System.out.println("4. Phan hoach chan le");
//            System.out.println("5. Giao hai mang");
//            System.out.println("0. Thoat");
//            System.out.print("Chon: ");
//
//            choice = sc.nextInt();
//            sc.nextLine();
//
//            switch(choice){
//                case 1: separateVowelConsonant(); break;
//                case 2: mostFrequentChar(); break;
//                case 3: deleteShiftLeft(); break;
//                case 4: evenOddPartition(); break;
//                case 5: intersectionArray(); break;
//            }
//
//        }while(choice!=0);
//    }
//}