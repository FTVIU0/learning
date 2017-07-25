/**
  * Created by Nlte on 2017/07/25 11:45.
  */
object Main extends App {
  //flatten
  println("----------flatten-------------")
  val flatten = Init.getListSeq.flatten
  println(flatten)

  //transpose
  println("----------transpose-------------")
  val seq = Init.getListSeq
  println(seq)
  val transpose = seq.transpose
  println(transpose)
  //unzip
  println("----------unzip-------------")
  val unzip = Init.getMap.unzip
  println(unzip)

  //  ++
  println("----------++-------------")
  private val seq1 = Init.getIntSeq ++ Init.getStrSeq
  println(seq1)

  //  collect
  println("----------collect-------------")
  Init.getIntSeq.collect {
    case x if x % 2 == 0 => 1
    case _  => 0
  }.foreach(print)

  //  map/flatMap
  println()
  println("----------map/flatMap-------------")
  Init.getIntSeq.map(_*2).foreach(x=>print(x+" "))

  //  scan
  println()
  println("----------scan-------------")
  val ints = Init.getIntSeq.scanRight(1)(_*_)
  println(ints)

//  fold
  println("----------fold-------------")
  private val i = Init.getIntSeq.sum
  println(i)




}
