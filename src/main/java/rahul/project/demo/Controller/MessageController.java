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
        // Process the user-submitted message here
        // You can perform any desired actions (e.g., save to a database, send an email, etc.)

        // Example: Print the message to the console
        System.out.println("User submitted message: " + message);

        // Redirect to a success page or return a different view if needed
        return "redirect:/success-page";
    }
}

