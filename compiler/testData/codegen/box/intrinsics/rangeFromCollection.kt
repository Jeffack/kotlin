fun box(): String {
    val list = java.util.ArrayList<IntRange>()
    list.add(1..3)
    list[0].start
    return "OK"
}
