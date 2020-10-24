class DecisionMaking {
    static void main(String[] args) {
        int exam = 70

        if (exam >= 70) {
            println "You passed the exam"
        }

        float pi = 3.1416
        if (pi == 3.1416f) {
            println "Its pi value"
        } else {
            println "It's not pi value"
        }

        int age = 15
        if (age >= 0 && age < 7) {
            println "Give a funny smile"
        } else if (age >= 8 && age < 18){
            println "Give a candy"
        } else if(age >= 18 && age <100){
            println "Give a funny story"
        }else{
            println "error"
        }

        int i = 0
        int j = 1
        switch(i) {
            case 0:
                switch(j) {
                    case 0:
                        println("i is 0, j is 0")
                        break
                    case 1:
                        println("i is 0, j is 1")
                        break
                    default: println("nested default case!!")
                }
                break

            default: println("No matching case found!!")
        }
    }
}
