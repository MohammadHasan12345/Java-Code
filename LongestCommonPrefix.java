import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Scanner sc = new Scanner(System.in);

        String Output = "";
        List<String> Strs = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String inpt = sc.nextLine();
            Strs.add(inpt);
        }

        boolean x = true;
        while (x) {
            for (int i = 0; i < 5; i++) {
                if (Strs.get(0).charAt(i) == Strs.get(1).charAt(i) && 
                    Strs.get(1).charAt(i) == Strs.get(2).charAt(i)) {
                    x = true;
                    Output = Output + Strs.get(0).charAt(i);
                } else {
                    x = false;
                    break;
                }
            }
            x = false;
        }

        System.out.println(Output);
        return Output;
    }
}
