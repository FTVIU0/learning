
/*//foreach
Init.getIntSeq.foreach(println)
Init.getIntSeq.foreach(x => println(x*x))

//flatten
val flatten = Init.getListSeq.flatten
print(flatten)

//transpose
Init.getListSeq.transpose*/

Init.getIntSeq.head
Init.getIntSeq.last
Init.getIntSeq.headOption
Init.getIntSeq.lastOption
Init.getIntSeq.tail
Init.getIntSeq.init
Init.getIntSeq.tails.foreach(println)
Init.getIntSeq.inits.foreach(println)
Init.getIntSeq.slice(1, 5)
Init.getIntSeq.take(3)
Init.getIntSeq.takeWhile(_<8)
Init.getIntSeq.drop(2)
Init.getIntSeq.dropWhile(_<5)
Init.getIntSeq.splitAt(3)
Init.getIntSeq.span(_<7)
Init.getIntSeq.partition(_%2==0)
Init.getIntSeq.groupBy(_%2==0)
Init.getIntSeq.filter(_%2==0).forall(_%2==0)
Init.getIntSeq.count(_%2==0)
Init.getIntSeq.mkString("[",".","]")
Init.getIntSeq.view(0,2)

Init.getIntSeq.sliding(3, 3).foreach(println)







