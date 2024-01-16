class HelloWorld {
    fun HelloWorldMessage(): String {

        // hello world!
        var messgae = "Hello world!"
        val display = TimeDisplay()
        // obtain greeting string
        val greeting = display.timeRetrieve()

        // concatenate the string
        val message = messgae.plus(greeting)

        return message

    }
}