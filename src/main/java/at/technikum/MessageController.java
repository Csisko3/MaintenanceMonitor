package at.technikum;

import org.springframework.web.bind.annotation.*;


@RestController
public class MessageController {
    static String defaultMessage = "Everything operates as expected";
    static String currentMessage = defaultMessage;

    @GetMapping("/api/message")
    public String getMessage() {
        return currentMessage;
    }

    @PostMapping("/api/message/set")
    public String setMessage(@RequestParam String m){
        currentMessage = m;
        return "ok";
    }

}
