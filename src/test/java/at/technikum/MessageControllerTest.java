package at.technikum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import at.technikum.MessageController;

class MessageControllerTest {

    @Test
    void defaultMessage() {
        String ABC = "Everything operates as expected";

        assertEquals(ABC, MessageController.currentMessage);
    }

    @Test
    void testSetMessage() {
        assertEquals(MessageController.currentMessage, MessageController.setMessage(MessageController.currentMessage));
    }

}