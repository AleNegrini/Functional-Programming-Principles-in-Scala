package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c>r) 0 else {if (c==0 || r == 0) 1 else (pascal(c-1,r-1)+pascal(c,r-1))}
    }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def is_balanced(chars: List[Char], open: Int): Boolean =
        if (chars.isEmpty) open == 0
        else if (chars.head == '(') is_balanced(chars.tail,open+1)
        else if (chars.head == ')') open>0 && is_balanced(chars.tail,open-1)
        else is_balanced(chars.tail,open)
      is_balanced(chars,0)
    }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
      def cycle(money: Int, coins: List[Int]): Int = {
        if (coins.isEmpty || money < 0 ) 0
        else if (money == 0 ) 1
        else cycle(money, coins.tail) + cycle(money - coins.head, coins)
      }

    cycle(money, coins)
  }
}
