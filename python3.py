# 00
print("=" * 10 + "00" + "=" * 10)
s = "stressed"
print(s[::-1])
print()

# 01
print("=" * 10 + "01" + "=" * 10)
s = "パタトクカシーー"
print(s[0::2])
print()

# 02
print("=" * 10 + "02" + "=" * 10)
s1 = "パトカー"
s2 = "タクシー"
print(''.join(sum(zip(s1, s2), ())))
print()

# 03
print("=" * 10 + "03" + "=" * 10)
from re import findall
s = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics."
s_r = list(map(len, findall(r"\w+", s)))
print(s_r)
print()

# 04
print("=" * 10 + "04" + "=" * 10)
s = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
arr = [1, 5, 6, 7, 8, 9, 15, 16, 19]
ans = {}
sp = s.split()
for x in range(1, len(sp) + 1):
    if x in arr:
        ans[x] = sp[x - 1][:1]
    else:
        ans[x] = sp[x - 1][:2]
print(ans)
print()

# 05
print("=" * 10 + "05" + "=" * 10)
s = "I am an NLPer"


def letter_bi_gram(s, n):
    return [s[x:x + 2] for x in range(len(s) - 1)]


def word_bi_gram(s, n):
    s = s.split()
    return [s[x:x + 2] for x in range(len(s) - 1)]


print(word_bi_gram(s, 2))
print(letter_bi_gram(s, 2))
print()

# 06
print("=" * 10 + "06" + "=" * 10)
s1 = "paraparaparadise"
s2 = "paragraph"
X = set(letter_bi_gram(s1, 2))
Y = set(letter_bi_gram(s2, 2))
print(f"X {X}")
print(f"Y {Y}")
print(f"X | Y {X | Y}")
print(f"X & Y {X & Y}")
print(f"X - Y {X - Y}")
print(f"'se' in X {'se' in X}")
print(f"'se' in Y {'se' in Y}")
print()

# 07
print("=" * 10 + "07" + "=" * 10)


def tmp(x, y, z):
    return f"{x}時の{y}は{z}"


print(tmp(12, "気温", 22.4))

# 08
print("=" * 10 + "08" + "=" * 10)


def cipher(s):
    res = ""
    for x in s:
        if x.islower():
            res += chr(219 - ord(x))
        else:
            res += x
    return res


s = input()
c = cipher(s)
print(f"暗号化: {c}")
print(f"復号化: {cipher(c)}")
print()

# 09
from random import sample
print("=" * 10 + "09" + "=" * 10)
s = input()
ans = ""
for x in s.split():
    if len(x) < 5:
        ans += x
    else:
        ans += x[0] + "".join(sample(x[1:-1], len(x) - 2)) + x[-1]
    ans += " "
print(ans)
