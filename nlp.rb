require 'set'


class Nlp100
  def q00()
    s = "stressed"
    puts s.reverse
  end

  def q01()
    s = "パタトクカシー"
    ans = ""
    for i in [1, 3, 5, 7].map {|n| n - 1}
      ans += s[i]
    end
    puts ans
  end

  def q02()
    s1 = "パトカー"
    s2 = "タクシー"
    ans = ""
    for i in (0...4)
      ans += s1[i] + s2[i]
    end
    puts ans
  end

  def q03()
    s = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics."
    s = s.split(" ")
    ans = []
    for x in s
      x = x.slice(/\w+/)
      ans.push(x.length)
    end
    print ans
    puts
  end

  def q04()
    s = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
    s = s.split(" ")
    ls = [1, 5, 6, 7, 8, 9, 15, 16, 19]
    ls.map! {|n| n - 1}
    ans = {}
    for i in (0..(s.length - 1))
      if ls.include?(i)
        ans[i + 1] = s[i][0]
      else
        ans[i + 1] = s[i][0, 2]
      end
    end
    puts ans
  end

  def q05_word_bi_gram(s, n)
    s = s.split(" ")
    res = []
    for x in (0...(s.length - 1))
      res.push(s.slice(x..(x + (n - 1))))
    end
    return res
  end

  def q05_letter_bi_gram(s, n)
    res = []
    for x in (0...(s.length - 1))
      res.push(s.slice(x..(x + (n - 1))))
    end
    return res
  end

  def q05()
    s = "I am an NLPer"
    print q05_word_bi_gram(s, 2)
    puts
    print q05_letter_bi_gram(s, 2)
    puts
  end

  def q06_letter_bi_gram(s, n)
    res = []
    for x in (0...(s.length - 1))
      res.push(s.slice(x..(x + (n - 1))))
    end
    return res
  end

  def q06()
    s1 = "paraparaparadise"
    s2 = "paragraph"
    x = q06_letter_bi_gram(s1, 2).to_set
    y = q06_letter_bi_gram(s2, 2).to_set
    puts "X = #{x}"
    puts "Y = #{y}"
    puts "X + Y = #{x + y}"
    puts "X & Y = #{x & y}"
    puts "X - Y = #{x - y}"
    puts "'se' in X = #{x.include?("se")}"
    puts "'se' in Y = #{y.include?("se")}"
  end

  def q07_tmp_new_str(x, y, z)
    return "#{x}時の#{y}は#{x}"
  end

  def q07()
    puts q07_tmp_new_str(12, "気温", 22.4)
  end

  def q08_cipher(s)
    res = ""
    for x in s.split("")
      if (x =~ /^[a-z]+$/) != nil
        res += (219 - x.ord).chr
      else
        res += x
      end
    end
    return res
  end

  def q08()
    puts "暗号化する文章を入力してください"
    s = gets
    c = q08_cipher(s)
    puts "暗号化: #{c}"
    puts "復号化: #{q08_cipher(c)}"
  end

  def q09()
    puts "文章を入力してください"
    s = gets
    ans = ""
    for x in s.split(" ")
      if x.length <= 4
        ans += x
      else
        ans += x[0] + x.slice(1, x.length - 2).split("").shuffle.join("") + x[-1]
      end
      ans += " "
    end
    puts ans
  end
end


nlp = Nlp100.new
nlp.q00
nlp.q01
nlp.q02
nlp.q03
nlp.q04
nlp.q05
nlp.q06
nlp.q07
nlp.q08
nlp.q09
