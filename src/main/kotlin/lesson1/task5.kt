package lesson1

fun main() {
    var seconds: Short = 6480

    var minutes1 = seconds/60
    var hours = minutes1/60
    var minutes2 = minutes1%60

    println("0$hours:$minutes2:00")

}