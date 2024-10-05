public class SubsetString {
    public static void findSubstring(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Correct recursive call
        findSubstring(str, ans + str.charAt(i), i + 1);
        findSubstring(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubstring(str, "", 0);
    }
}
