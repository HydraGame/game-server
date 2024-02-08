class Game {
    companion object {
        fun loop(cyclesPerSecond: Int) {
            if (cyclesPerSecond > 1000 || cyclesPerSecond < 1) {
                throw Exception("cyclesPerSecond must be number between 1 and 1000. Got $cyclesPerSecond")
            }
            val sleepTime = (1000 / cyclesPerSecond).toLong()

            for (i in 1..10) {
                println(i)
                Thread.sleep(sleepTime)
            }
        }
    }
}