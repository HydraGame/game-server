class Game {
    companion object {
        fun loop(cyclesPerSecond: Int) {
            var state = GameState(
                listOf(Galaxy("Andromeda")),
                listOf(Player("Liviu")),
                listOf(Timer(0, 1))
            )
            if (cyclesPerSecond > 1000 || cyclesPerSecond < 1) {
                throw Exception("cyclesPerSecond must be number between 1 and 1000. Got $cyclesPerSecond")
            }
            val sleepTime = (1000 / cyclesPerSecond).toLong()

            for (i in 1..10) {
                state.timers.first().value += state.timers.first().rate
                println(state)
                Thread.sleep(sleepTime)
            }
        }

        //  galaxy
        //  -- name
        //  -- planets
    }
}