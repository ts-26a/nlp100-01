class Nlp100() {
    fun q00() {
        val s: String = "stressed"
        println(s.reversed())
    }

    fun q01() {
        val s = "パタトクカシー"
        for (i in arrayOf(1, 3, 5, 7)) {
            print(s[i - 1])
        }
        println()
    }

    fun q02() {
        val s1: List<Char> = "パトカー".toList()
        val s2: List<Char> = "タクシー".toList()
        for ((x, y) in s1.zip(s2)) {
            print("$x$y")
        }
        println()
    }

    fun q03() {
        val s: String = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics."
        val matchls = Regex("""\w+""").findAll(s)
        val ans: List<Int> = matchls.toList().map() {it.value.length}
        println(ans)
    }

    fun q04() {
        val s: String = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
        var arr: List<Int> = listOf(1, 5, 6, 7, 8, 9, 15, 16, 19)
        arr = arr.map() {it - 1}
        val sl: List<String> = s.split(" ")
        var ml: MutableMap<Int, String> = mutableMapOf()
        for (i in 0..(sl.size - 1)) {
            if (i in arr) {
                ml[i + 1] = sl[i].substring(0, 1)
            }
            else {
                ml[i + 1] = sl[i].substring(0, 2)
            }
        }
        println(ml)
    }

    fun q05NGram(tg: List<Char>, n: Int): List<String> {
        val res: MutableList<String> = mutableListOf()
        for (i in 0..(tg.size - n)) {
            res.add(tg.slice(i..(i + n - 1)).toString())
        }
        return res.toList()
    }

    fun q05NGram_(tg: List<String>, n: Int): List<String> {
        val res: MutableList<String> = mutableListOf()
        for (i in 0..(tg.size - n)) {
            res.add(tg.slice(i..(i + n - 1)).toString())
        }
        return res.toList()
    }

    fun q05() {
        val s: String = "I am an NLPer"
        println(q05NGram(s.toList(), 2))
        println(q05NGram_(s.split(" "), 2))
    }

    fun q06NGram(tg: List<Char>, n: Int): List<String> {
        val res:MutableList<String> = mutableListOf()
        for (i in 0..(tg.size - n)) {
            res.add(tg.slice(i..(i + n - 1)).toString())
        }
        return res.toList()
    }
    fun q06() {
        val s1: String = "paraparaparadise"
        val s2: String = "paragraph"
        val X: Set<String> = q06NGram(s1.toList(), 2).toSet()
        val Y: Set<String> = q06NGram(s2.toList(), 2).toSet()
        val se: String = "[s, e]"
        println("X = ${X}")
        println("Y = ${Y}")
        println("X + Y = ${X + Y}")
        println("X - Y = ${X - Y}")
        println("X * Y = ${X intersect Y}")
        println("se in X = ${se in X}")
        println("se in Y = ${se in Y}")
    }

    fun q07TmpNewString(x: Int, y: String, z: Double) = "${x}時の${y}は${z}"

    fun q07() {
        val s: String = q07TmpNewString(12, "気温", 22.4)
        println(s)
    }

    fun q08Cipher(s: String): String {
        var rs: String = ""
        val charset = Charsets.UTF_8
        val regex = """[a-z]""".toRegex()
        for (ch in s) {
            if (regex matches ch.toString()) {
                var cc = ch.toChar().toByte()
                rs += byteArrayOf((219 - cc).toByte()).toString(charset)
            }
            else {
                rs += ch
            }
        }
        return rs
    }

    fun q08() {
        val s: String = readLine()!!
        val r: String = q08Cipher(s)
        println(r)
        println(q08Cipher(r))
    }

    fun q09() {
        val s1: String = readLine()!!
        val ss: List<String> = s1.split(" ")
        for (s in ss) {
            if (s.length > 4) {
                print(s[0])
                for (x in (2..(s.length) - 1).shuffled()) {
                    print(s[x - 1])
                }
                print(s[s.length - 1])
                print(" ")
            }
            else {
                print("$s ")
            }
        }
        println()
    }
}


fun main(args: Array<String>) {
    val nlp = Nlp100()
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
}
