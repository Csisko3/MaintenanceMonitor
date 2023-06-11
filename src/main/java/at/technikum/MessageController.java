package at.technikum;

import org.springframework.web.bind.annotation.*;


@RestController
public class MessageController {
    static String defaultMessage = "Everything operates as expected";
    static String currentMessage = defaultMessage;
    static String testMessage;
    @GetMapping("/api/message")
    public String getMessage() {
        return currentMessage;
    }

    @GetMapping("/api/message/set")
    public static String setMessage(@RequestParam String m) {
        testMessage = m;
        currentMessage = m;

        return "ok";
    }

}
