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

    @GetMapping("/api/message/set")
    public static String setMessage(@RequestParam String m) {
        currentMessage = m;
        return "ok";
    }
    public static String getcurrentMessage(){
        return currentMessage;
    }

}
