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
        int arr[] = {1, 5, 6, 7, 8, 9, 15, 16, 19};
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

    private static String[][] q05_word_n_gram(String s, int n) {
        String ss[] = s.split(" ", 0);
        String res[][] = new String[ss.length - (n - 1)][n];
        int c = 0;
        for (int i = 0; i < ss.length - (n - 1); i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = ss[i + j];
            }
        }
        return res;
    }

    private static String[] q05_letter_n_gram(String s, int n) {
        char ss[] = s.toCharArray();
        String res[] = new String[s.length() - (n - 1)]; // "abcd" -> ["ab", "bc", "cd"]
        String r = "";
        for (int i = 0; i < s.length() - (n - 1); i++) {
            r = "";
            for (int j = 0; j < n; j++) {
                r += String.valueOf(ss[i + j]);
            }
            res[i] = r;
        }
        return res;
    }

    public static void q05() {
        String s = "I am an NLPer";
        System.out.println(Arrays.deepToString(q05_word_n_gram(s, 2)));
        System.out.println(Arrays.toString(q05_letter_n_gram(s, 2)));
    }

    private static String[] q06_letter_n_gram(String s, int n) {
        char ss[] = s.toCharArray();
        String res[] = new String[s.length() - (n - 1)];
        String r = "";
        for (int i = 0; i < s.length() - (n - 1); i++) {
            r = "";
            for (int j = 0; j < n; j++) {
                r += String.valueOf(ss[i + j]);
            }
            res[i] = r;
        }
        return res;
    }

    private static HashSet<String> q06_set_union(HashSet<String> a, HashSet<String> b) {
        HashSet<String> res = new HashSet<String>();
        for (String s: a) {
            res.add(s);
        }
        for (String s: b) {
            res.add(s);
        }
        return res;
    }

    private static HashSet<String> q06_set_intersection(HashSet<String> a, HashSet<String> b) {
        HashSet<String> res = new HashSet<String>();
        if (a.size() > b.size()) {
            for (String s: a) {
                if (b.contains(s)) res.add(s);
            }
        }
        else {
            for (String s: b) {
                if (a.contains(s)) res.add(s);
            }
        }
        return res;
    }

    private static HashSet<String> q06_set_disjunction(HashSet<String> a, HashSet<String> b) {
        HashSet<String> res = new HashSet<String>();
        for (String s: a) {
            if (!(b.contains(s))) res.add(s);
        }
        return res;
    }

    public static void q06() {
        String s1 = "paraparaparadise";
        String s2 = "paragraph";
        HashSet<String> X = new HashSet<String>(Arrays.asList(q06_letter_n_gram(s1, 2)));
        HashSet<String> Y = new HashSet<String>(Arrays.asList(q06_letter_n_gram(s2, 2)));
        System.out.println("X | Y: " + q06_set_union(X, Y));
        System.out.println("X & Y: " + q06_set_intersection(X, Y));
        System.out.println("X - Y: " + q06_set_disjunction(X, Y));
        System.out.println("'se' in X: " + X.contains("se"));
        System.out.println("'se' in Y: " + Y.contains("se"));
    }

    private static String q07_tmp_new_string(int x, String y, double z) {
        int f = String.valueOf(z).length() - 1;
        return String.format("%d時の%sは%." + f + "g", x,  y, z);
    }

    public static void q07() {
        System.out.println(q07_tmp_new_string(12, "気温", 22.4));
    }

    private static String q08_cipher(String s) {
        char ss[] = s.toCharArray();
        String res = "";
        int r = 0;
        for (char sf: ss) {
            r = (int)sf;
            if (97 <= r && r <= 122) {
                res += String.valueOf((char)(219 - r));
            }
            else {
                res += String.valueOf(sf);
            }
        }
        return res;
    }

    public static void q08(String s) {
        String c = q08_cipher(s);
        System.out.println("暗号化: " + c);
        System.out.println("復号化: " + q08_cipher(c));
    }

    private static String[] q09_str_to_array(String s) {
        String res[] = new String[s.length()];
        char ss[] = s.toCharArray();
        int count = 0;
        for (char sf: ss) {
            res[count] = String.valueOf(sf);
            count++;
        }
        return res;
    }

    private static String q09_list_to_string(List<String> s) {
        String res = "";
        for (String sf: s) res += sf;
        return res;
    }

    private static String q09_random_string(String s) {
        if (s.length() < 5) return s;
        String ssf[] = q09_str_to_array(s);
        String ss[] = q09_str_to_array(s.substring(1, s.length() - 1));
        String res = String.valueOf(ssf[0]);
        List<String> ssl = Arrays.asList(ss);
        Collections.shuffle(ssl);
        res += q09_list_to_string(ssl);
        res += ssf[s.length() - 1];
        return res;
    }

    public static void q09(String s) {
        String ss[] = s.split(" ", 0);
        String res = "";
        for (String sf: ss) {
            res += (q09_random_string(sf)) + " ";
        }
        System.out.println(res);
    }
}

class nlp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Nlp100 nlp100 = new Nlp100();
        nlp100.q00();
        nlp100.q01();
        nlp100.q02();
        nlp100.q03();
        nlp100.q04();
        nlp100.q05();
        nlp100.q06();
        nlp100.q07();
        nlp100.q08(inp.nextLine());
        nlp100.q09(inp.nextLine());
        inp.close();
    } 
}
