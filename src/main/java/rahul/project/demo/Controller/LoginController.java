package rahul.project.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rahul.project.demo.Model.UserModel;
import rahul.project.demo.Repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/login")
    public String showLoginForm() {
        return "home"; // returns the login.html Thymeleaf template
    }



    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password) {

        if (isValidUser(username, password)) {
            return "mainPage"; // redirect to the dashboard page on successful login
        } else {
            return "mainPage"; // redirect back to the login page with an error parameter
        }
    }

    private boolean isValidUser(String username, String password) {
        final UserModel user = userRepository.findByUsername(username);
        if(user == null){
            //throw new UserNotFoundException();
            try {
                throw new Exception("User Not Found");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if(user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
}

