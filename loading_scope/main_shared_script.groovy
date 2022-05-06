load "./loading_scope/secondary_script.groovy"

stages {
    stage("Top stage") {
        do_secondary_print("In stage")
    }

    do_secondary_print("Out of stage")
}

