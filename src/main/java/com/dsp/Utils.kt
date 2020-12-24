import kotlin.random.Random

/**
 * O(N)
 */
fun <T> randomizeArray(array: Array<T>) {
    val j = Random.nextInt(array.size)
    for (i in array.indices) {
        val t = array[i]
        array[i] = array[j]
        array[j] = t
    }
}

/**
 * O(log(N))
 */
//TODO fix tests
fun raiseToPower(a: Float, p: Int): Float {
    if (p == 1) return a
    var pp = 1
    var prev = a
    var result = 1F
    var foo = true
    do {
        pp *= 2
        when {
            pp < p -> {
                prev *= prev
            }
            pp == p -> {
                result = prev * prev
                foo = false
            }
            pp > p -> {
                result = prev * a
                foo = false
            }
        }
    } while (foo)
    return result
}
