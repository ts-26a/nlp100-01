import java.util.*;


class Nlp100 {
    public static void q00() {
        String s = "stressed";
        char ans[] = new char[s.length()];
        char ss[] = s.toCharArray();
        int slen = ss.length;
        for (int i = 0; i < slen; i++) {
            ans[slen - i - 1] = ss[i];
        }
        System.out.println(String.valueOf(ans));
    }

    private static boolean q01_includes(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return true;
        }
        return false;
    }

    public static void q01() {
        String s = "パタトクカシー";
        char ss[] = s.toCharArray();
        int arr[] = {1, 3, 5, 7};
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (q01_includes(arr, i + 1)) ans += String.valueOf(ss[i]);
        }
        System.out.println(ans);
    }

    public static void q02() {
        String s1 = "パトカー";
        String s2 = "タクシー";
        char ss1[] = s1.toCharArray();
        char ss2[] = s2.toCharArray();
        String ans = "";
        for (int i = 0; i < ss1.length; i++) ans += (String.valueOf(ss1[i]) + String.valueOf(ss2[i]));
        System.out.println(ans);
    }

    public static void q03() {
        String s = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics.";
        s = s.replaceAll(",", "").replaceAll("\\.", "");
        String ss[] = s.split(" ", 0);
        int ans[] = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            ans[i] = ss[i].length();
        }
        System.out.println(Arrays.toString(ans));
    }

    private static boolean q04_includes(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return true;
        }
        return false;
    }

    public static void q04() {
        String s = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can.";
        String ss[] = s.split(" ", 0);
        int arr[] = {1, 5, 6, 7, 8, 9, 15, 16, 19}; // 先頭の1文字
        Map<Integer, String> ans = new HashMap<Integer, String>();
        for (int i = 0; i < ss.length; i++) {
            if (q04_includes(arr, i + 1)) {
                ans.put(i + 1, ss[i].substring(0, 1));
            }
            else {
                ans.put(i + 1, ss[i].substring(0, 2));
            }
        }
        System.out.println(ans);
    }
}

class nlp {
    public static void main(String[] args) {
        Nlp100 nlp100 = new Nlp100();
        nlp100.q00();
        nlp100.q01();
        nlp100.q02();
        nlp100.q03();
        nlp100.q04();
    } 
}
