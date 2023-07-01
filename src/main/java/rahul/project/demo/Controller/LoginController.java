package rahul.project.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "loginPage"; // returns the login.html Thymeleaf template
    }



    /*@PostMapping("/login")
    public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        // Perform authentication logic here
        if (isValidUser(username, password)) {
            return "redirect:/dashboard"; // redirect to the dashboard page on successful login
        } else {
            return "redirect:/login?error"; // redirect back to the login page with an error parameter
        }
    }*/

    private boolean isValidUser(String username, String password) {
        // Perform your authentication logic here (e.g., check against a user database)
        // Return true if the user is valid, false otherwise
        return false;
    }
}

