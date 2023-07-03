fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

/*
output : RED GREEN BLUE => merupakan nama dan objek dari enum class itu sendiri
 */