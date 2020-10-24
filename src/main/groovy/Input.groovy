class Input {
    static void main(String[] args) {


        println "What is your name?"
        def name = System.in.newReader().readLine()
        println "Nice to meet you " + name

        println "Put first number"
        def first = System.in.newReader().readLine() as Integer
        println "Put second number"
        def second = System.in.newReader().readLine() as Integer
        println "The sum is " + (first + second)
    }
}
