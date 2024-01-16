import java.sql.DriverManager.println
import java.time.LocalDateTime

class TimeDisplay {

    fun timeRetrieve(): String {
        val current = LocalDateTime.now()
        val hour = current.hour

        val message = when {
            // Too late for work
            hour >= 21 -> "It's too late for work!"
            // Good morning
            hour < 12 -> "Good morning"
            // Good day
            else -> "Have a good day!"
        }

        // Print the current date and time.
        println("Current Date and Time is: $current")
        return message
    }
}
