// Don't use "def" --> makes global variable-like item
// Otherwise, the variable goes to the main runtime method's scope
main_greeting = "Hello"

def say_hi(someone) {
    println "${main_greeting} $someone"
}

def configure_greeting(new_greeting) {
    main_greeting = new_greeting
}

return this
