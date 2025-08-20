
import java.util.Scanner;

class LenthOfLastWord {

    public static int FindLenth (String x) {
        String[] arrStrings = x.split(" ");
        
        for (int i = 0; i < arrStrings.length; i++) {
            arrStrings[i] = arrStrings[i].strip(); // store back trimmed word
        }

        // Last word's index:
        int index = arrStrings.length - 1;
        int output = arrStrings[index].length();

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(FindLenth(x));
    }
}
