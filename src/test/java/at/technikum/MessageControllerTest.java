package at.technikum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MessageControllerTest {

        @Test
    void defaultMessage(){
        String ABC = "Everything operates as expected";

        assertEquals(ABC,MessageController.currentMessage);
    }
}