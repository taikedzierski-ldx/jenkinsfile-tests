println "Should be 'Good morning Polly ...' and 'Hello Tommy ...'"

lower = load "simple_load/lower.groovy"
lower.configure_greeting("Good morning")
lower.say_hi("Polly")

lower.set_exclamation("...")

lower2 = load "simple_load/lower.groovy"
lower2.say_hi("Tommy")

