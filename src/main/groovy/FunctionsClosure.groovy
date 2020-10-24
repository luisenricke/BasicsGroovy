class FunctionsClosure {
    static void main(String[] args) {

        def closure = { x, y ->
            return x + y
        }

        int first = 1
        int second = 1

        println "closure " + closure(first, second)
        println "return dynamic function" + functionSum(first, second)
        println "return static function" + functionMin(first, second)
        println "default params " + functionMultiply(first)

        def hello = "Hello"
        def closureX = { param -> println "${hello} ${param}" }
        closureX.call(" World ")
        closureTest(closureX)
    }

    static def functionSum(int x, int y) {
        return x + y
    }

    static int functionMin(int x, int y) {
        return x - y
    }

    static int functionMultiply(int x, int y = 1) {
        return x * y
    }

    static def closureTest(closure){
        closure.call(" Inner ")
    }
}
