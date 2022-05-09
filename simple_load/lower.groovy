// Don't use "def" --> makes global variable-like item
// Otherwise, the variable goes to the main runtime method's scope
main_greeting = "Hello"

static exclamation = "!"

def say_hi(someone) {
    println "${main_greeting} $someone ${exclamation}"
}

def configure_greeting(new_greeting) {
    main_greeting = new_greeting
}

def set_exclamation(new_excl) {
    exclamation = new_excl
}

return this
