// Author: Kartikeya Gupta        Github ID: kartikcode           Questions: P01 - P17
/*******************************************************************************************/

/*########Question 1###########*/

def lastElem(list: List[Any] ): Unit={
  val list_copy=list.reverse
  println(list_copy.head)
  //OR
  println(list{list.size-1})
  
}

/*########Question 2###########*/

def penultimate(list: List[Any]): Unit={
  val elem= list{list.size-2}
  println(elem)
}

/*########Question 3###########*/

def kElem(list: List[Any], k: Int ): Unit={
  val elem=list{k}
  println(elem)
}

/*########Question 5###########*/

def listSize(list: List[Any] ): Unit={
  val list_size= list.size
  println(list_size)
}

/*########Question 6###########*/

def checkPallin(list: List[Any] ): Unit={
  val list_copy=list.reverse
  println(list_copy==list)
}

/*########Question 7###########*/

def flatten(list: List[Any]) : List[Any] = list flatMap{
  case nl: List[_] => flatten(nl)
  case e  => List(e)
}
//println(flatten(list1))

/*########Question 8###########*/

var list2=List[Any]()
def compress(list:List[Any]): List[Any]= {
  var prev=list{0}
  list2=list2:+prev
  list.map{
  x=>{
    if(x!=prev){
      prev=x
      list2=list2:+prev
}}}}

/*########Question 9###########*/

var listn2=List[List[Any]]()
def pack(list:List[Any]): List[List[Any]]= {
  var prev=list{0}
  var count=1
  list.map{
  x=>{
    if(x!=prev){
      val sl= List.fill(count)(prev)
      listn2=listn2 :+ sl
      prev=x
      count=1
    }
    else{
      count= count+1
    }}}
listn2 = listn2 :+ List.fill(count)(prev)
listn2
}

/*########Question 10###########*/

var listn3=List[Any]()
def encode(list:List[Any]): List[Any]= {
  var prev=list{0}
  var count=1
  list.map{
  x=>{
    if(x!=prev){
      listn3=listn3 :+ (count,prev)
      prev=x
      count=1
    }
    else{
      count= count+1
    }}}
listn3 = listn3 :+ (count,prev)
listn3
}

/*########Question 11###########*/

var listn4=List[Any]()
def encodeModified(list:List[Any]): List[Any]= {
  var prev=list{0}
  var count=1
  list.map{
  x=>{
    if(x!=prev){
      if(count>1){
      listn4=listn4 :+ (count,prev)
      }
      else{
        listn4=listn4 :+ prev
      }
      prev=x
      count=1
    }
    else{
      count= count+1
    }}}
listn4 = listn4 :+ (count,prev)
listn4
}

/*########Question 12###########*/

var listn5=List[Any]()
def decode(list:List[(Int,Symbol)]): List[Any]= {
  list.map{
   x=>{
    var (len,elem)=x
    listn5= listn5 :+ List.fill(len)(elem)
    flatten(listn5)
}}}

/*########Question 14###########*/

def duplicate(list: List[Any]): List[Any]={
  var listn=List[Any]()
  list.map{
   x=>{
     listn=listn :+ List.fill(2)(x)
   }}
   flatten(listn)
}

/*########Question 15###########*/

def duplicateN(N:Int,list: List[Any]): List[Any]={
  var listn=List[Any]()
  list.map{
   x=>{
     listn=listn :+ List.fill(N)(x)
   }}
   flatten(listn)
}

/*########Question 16###########*/

def dropN(n:Int,ls: List[Int]): List[Any]={
  ls.zipWithIndex filter(elem => (elem._2 + 1)%n!=0 ) map{ _._1 }
}

/*########Question 17###########*/

def split(n:Int, list:List[Int]) : (List[Int],List[Int])={
 var (a,b) = list.span(_ < (n+1))
 var ans=(a.toList,b.toList)
 ans
}
