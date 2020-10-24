import org.codehaus.groovy.runtime.typehandling.GroovyCastException

class Variables {
    static void main(String[] args) {
        // You can define dynamic variables
        def dynamic=0
        println dynamic.getClass()
        dynamic=0.5f
        println dynamic.getClass()
        dynamic=0.9d
        println dynamic.getClass()
        dynamic="Test"
        println dynamic.getClass()

        // You can define static variables
        int static_=0
        println static_.getClass()
        try{
            static_="error"
            println static_.getClass()
        } catch(GroovyCastException ex){
            println "Doesn't apply dynamic casting"
        }

        // You can use multi line
        def quotes = """
            |First Line
            |Second Line
            | Third Line
            |   Four Line 
        """.stripMargin("|")
        println quotes

        // Implements new type
        def bigNumberOne = 10.5g
        BigDecimal bigNumberTwo = 10.5g
        println bigNumberOne.getClass()
        println bigNumberTwo.getClass()

        // Check list of objects
        def obj = ["first", 2, 'third']
        println obj.getClass()

        // instanceof checks if obj is the subclass of some class.
        println obj instanceof List
        println obj instanceof java.util.ArrayList

        // getClass returns the exact type of an object.
        println obj.getClass() == List
        println obj.getClass() == java.util.ArrayList

    }
}
