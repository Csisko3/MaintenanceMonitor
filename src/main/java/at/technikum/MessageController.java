package at.technikum;

import org.springframework.web.bind.annotation.*;


@RestController
public class MessageController {
     private String defaultMessage = "Everything operates as expected";
    private String currentMessage = defaultMessage;

    @GetMapping("/api/message")
    public String getMessage() {
        return currentMessage;
    }


}
