package Excersises;

public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println(romanToInt("CM"));

    }
    public static int romanToInt(String romanNumeral){

            int ans = 0;
            int num = 0;
            for (int i = romanNumeral.length() - 1; i >= 0; i--) {
                switch(romanNumeral.charAt(i)) {
                    case 'I': num = 1; break;
                    case 'V': num = 5; break;
                    case 'X': num = 10; break;
                    case 'L': num = 50; break;
                    case 'C': num = 100; break;
                    case 'D': num = 500; break;
                    case 'M': num = 1000; break;
                }
                if (4 * num < ans){
                    ans = ans - num;
                }
                else ans = ans + num;
            }
            return ans;
        }
}




