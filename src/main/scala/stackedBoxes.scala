object stackedBoxes extends App {

  def prt(s: String): Unit = {
    println("+" + " " * (s.length + 2) + "+")
    println("|" + " " * (s.length + 2) + "|")
    println("+" + "-" * (s.length + 2) + "+")
    println(s"| $s |")
    println("+" + "-" * (s.length + 2) + "+")
  }

  def prtStack(ls: List[String]): Unit = {
    println(" " * ((ls.last.length + 3) / 2) + "*")
    println(" " * ((ls.last.length + 3) / 2) + "|")
    ls.foldLeft(())((m, n) => {
      println(" " * ((ls.last.length - n.length) / 2) + "+" + "-" * (n.length + 2) + "+")
      println(" " * ((ls.last.length - n.length) / 2) + s"| $n |")
    })
    println("+" + "-" * (ls.last.length + 2) + "+")
  }

  val words = args.toList.sortBy(_.length)

  words match {
    case Nil => println("Nie ma torcika")
    case m :: Nil => prt(m)
    case _ => prtStack(words)
  }

}

