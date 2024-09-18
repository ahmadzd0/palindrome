//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }


    private static boolean palindrome(String p) {
        int l = 0;
        int r = p.length() - 1;
        while (l > r) {
            if (p.charAt(l) != p.charAt(r)) {
                System.out.println(false);

            }
        }
        return true;


    }
}