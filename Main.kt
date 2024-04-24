import javax.print.attribute.standard.QueuedJobCount

fun main() {
    println("Hello World!")
    removeB("Barnie bakes brown bagels and buns")

    var x=arrOfNums(arrayOf(20,14,45,76,12,65,9))
    println(x)

    calculateVolume(6)
    checkPalindrome("wow")


}

//Removing b  in a string
fun removeB(words:String){
    var sentence = words.lowercase().split("b")
    println(sentence)
}

//function that takes an array of integers and return sum,count and average of all elements


data class Operation(var sum: Int,var count: Int,var average:Double)
    fun arrOfNums(nums:Array<Int>):Operation{
        var sum = nums.sum()
        var count= nums.count()
        var average = nums.average()
        var result = Operation(sum,count,average)
        return result

    }

//function to calculate the volume of a sphere

//fun calculateVolume(r:Int,pi:Double=3.14159,num:Int=4/3){
//    var volume = (r*r*r) * pi * num
//println(volume)
//}

fun calculateVolume(r:Int){
    var pi = 3.14159
    var num = 4/3
    var vol = pi * num * (r*r*r)
    println(vol)
}

fun checkPalindrome(word:String):Boolean{
    var x = word.reversed()
     var result = word== x
    println(result)
    return result


}

