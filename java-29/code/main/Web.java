package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class Web {
    @GetMapping("/branch")
    String showBranch(Model model) {
        model.addAttribute("brand", "iCoffee");
        model.addAttribute("phone", "021234567");
        
        String data[] = { "London", "Paris", "New York" };
        model.addAttribute("branches", data);

        return "branch";   //branch.html
    }
    @GetMapping("/")
    String showDefualt() {
        return "home";
    }
}
