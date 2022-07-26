fun largestgap(input: Array<Int>): Int {
    input.sort()
    var gap = 0
    var ele1=0
    var ele2 =0
    for((i,item) in input.withIndex()){
        if(i>0){
          if(item-input[i-1] >gap){
              gap = item-input[i-1]
              ele1 = item
              ele2 = input[i-1]
          }
        }
    }
    println("largest gap in the array is between $ele1 and $ele2 which is $gap")
    return gap
}

//class CodePractice {
    fun main(){
      var input = arrayOf(9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5)
//example 1
   largestgap(input)
//example 2
    oddEven(44)
    }

fun oddEven(i: Int) {
    var x =i
    var sum =0
    while (x>10){
        x %= 10
        sum += x
    }
    if(sum%2==0){
        println("$i Even")
    }else{
        println("$i Odd")
    }

}
//}