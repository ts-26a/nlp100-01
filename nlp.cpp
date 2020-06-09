#include <bits/stdc++.h>
#define println(r) cout << (r) << endl
#define print(r) cout << (r)
using namespace std;


class Nlp100 {
public:
    void q00() {
        string s = "stressed";
        char ss[s.size()];
        strcpy(ss, s.c_str());
        reverse(ss, ss + s.size());
        println(ss);
    }

    void q01() {
        string s = "パタトクカシーー";
        int p[] = {1, 3, 5, 7};
        int r;
        for (int i = 0; i < 4; i++) {
            r = p[i] * 3;
            print(s.substr(r - 3, r));
        }
        println("");
    }
};

int main() {
    Nlp100 nlp;
    nlp.q00();
    nlp.q01();
    return 0;
}
