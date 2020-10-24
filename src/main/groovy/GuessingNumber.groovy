class GuessingNumber {
    static void main(String[] args) {
        def random = new Random()
        def hidden = random.nextInt(20)

        while (true) {
            println "Guess number"
            def number = System.in.newReader().readLine() as Integer
            if (number < hidden) {
                println "The number was too small"
            } else if (number > hidden) {
                println "The number was too big"
            } else {
                println "Winner winner chicken dinner"
                break
            }
        }
    }
}
