class Loops {
    static void main(String[] args) {
        for (int count = 0; count < 5; count++) {
            println "count " + count
        }

        println " "

        for (item in 0..<10) {
            println "item " + item
        }

        println " "

        def listNumbers = [0, 1, 2, 3, 4, 5]
        for (int number in listNumbers) {
            println "number " + number
        }

        println ""

        0.upto(2) { number -> println "upTo closure " + number }

        println ""

        int cycle = 0
        while (cycle < 5) {
            println "cycle " + cycle
            cycle++
        }
    }
}
