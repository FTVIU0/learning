/**
  * Created by Nlte on 2017/07/25 11:47.
  */
object Init {

  def getIntSeq: Seq[Int] = {
    Seq(1 to 10: _*)
  }

  def getStrSeq: Seq[String] = {
    Seq("aa", "bb", "cc", "dd", "ee")
  }

  def getObjSeq: Seq[People] = {
    val p1 = People("ZhangSan", 21)
    val p2 = People("LiSi", 31)
    val p3 = People("WangWu", 41)
    val p4 = People("ZhaoQian", 21)
    val p5 = People("QILiu", 20)
    Seq(p1, p2, p3, p4, p5)
  }

  def getListSeq: Seq[List[Any]] = {
    Seq(List(1, 2, 3), List(1, 2, 3), List(5, 6, 7), List("A", "B", "C"))
  }

  def getMap: Seq[(String, Int)] = {
    Seq("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4)
  }
}

case class People(name: String, age: Int)

