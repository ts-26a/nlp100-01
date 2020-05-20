from random import sample
from re import findall


class Nlp100_01:
    def q00(self):
        s = "stressed"
        print(s[::-1])

    def q01(self):
        s = "パタトクカシー"
        print(s[0::2])

    def q02(self):
        s1 = "パトカー"
        s2 = "タクシー"
        print(''.join(sum(zip(s1, s2), ())))

    def q03(self):
        s = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics."
        s = list(map(len, findall(r"\w+", s)))
        print(s)

    def q04(self):
        s = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
        arr = [1, 5, 6, 7, 8, 9, 15, 16, 19]
        s = s.split()
        ans = {}
        for x in range(1, len(s) + 1):
            if x in arr:
                ans[x] = s[x - 1][:1]
            else:
                ans[x] = s[x - 1][:2]
        print(ans)

    def q05_word_bi_gram(self, s, n):
        s = s.split()
        return [s[x:x + 2] for x in range(len(s) - 1)]

    def q05_letter_bi_gram(self, s, n):
        return [s[x:x + 2] for x in range(len(s) - 1)]

    def q05(self):
        s = "I am an NLPer"
        print(self.q05_word_bi_gram(s, 2))
        print(self.q05_letter_bi_gram(s, 2))

    def q06_letter_bi_gram(self, s, n):
        return [s[x:x + 2] for x in range(len(s) - 1)]

    def q06(self):
        s1 = "paraparaparadise"
        s2 = "paragraph"
        X = set(self.q06_letter_bi_gram(s1, 2))
        Y = set(self.q06_letter_bi_gram(s2, 2))
        print(f"{X = }")
        print(f"{Y = }")
        print(f"{X & Y = }")
        print(f"{X & Y = }")
        print(f"{X - Y = }")
        print(f"{'se' in X = }")
        print(f"{'se' in Y = }")

    def q07_tmp_new_str(self, x, y, z):
        return f"{x}時の{y}は{z}"

    def q07(self):
        print(self.q07_tmp_new_str(12, "気温", 22.4))

    def q08_cipher(self, s):
        res = ""
        for x in s:
            if x.islower():
                res += chr(219 - ord(x))
            else:
                res += x
        return res

    def q08(self):
        print("暗号化する文章を入力してください")
        s = input("=>")
        c = self.q08_cipher(s)
        print(f"暗号化: {c}")
        print(f"復号化: {self.q08_cipher(c)}")

    def q09(self):
        print("文章を入力してください")
        s = input("=>")
        ans = ""
        for x in s.split():
            if len(x) <= 4:
                ans += x
            else:
                ans += x[0] + "".join(sample(x[1:-1], len(x) - 2)) + x[-1]
            ans += " "
        print(ans)


nlp = Nlp100_01()
nlp.q00()
nlp.q01()
nlp.q02()
nlp.q03()
nlp.q04()
nlp.q05()
nlp.q06()
nlp.q07()
nlp.q08()
nlp.q09()
