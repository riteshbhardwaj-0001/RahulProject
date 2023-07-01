package rahul.project.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {


    @GetMapping("/message")
    public String getMessagePage(){
        return "message";
    }
    @PostMapping("/submit-message")
    public String submitMessage(@RequestParam("message") String message) {
        System.out.println("User submitted message: " + message);

        return "redirect:/success-page";
    }
}

