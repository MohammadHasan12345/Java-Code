public class RomanToInteger {

    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = value(s.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue;  // subtract if smaller value before larger (e.g., IV = 5 - 1)
            } else {
                total += currentValue;  // add otherwise
            }

            prevValue = currentValue;
        }

        return total;
    }

    private static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));     // Output: 3
        System.out.println(romanToInt("LVIII"));   // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}
