import kotlin.test.Test
import kotlin.test.assertNotNull

class TimeMessage {

    @Test
    fun testMessageIsNotNull() {
        val Messenger = HelloWorld()
        // Retrieve the message.
        val message = Messenger.HelloWorldMessage()
        // Assert: Check that the message is not null.
        assertNotNull(message, "The message can't be null")
    }
}
