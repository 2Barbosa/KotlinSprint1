package lesson_3

fun main() {
    var num = 2
    var multiString = """
        |${num * 1}
        |${num * 2}
        |${num * 3}
        |${num * 4}
        |${num * 5}
        |${num * 6}
        |${num * 7}
        |${num * 8}
        |${num * 9}
    """.trimMargin()
    println(multiString)
}