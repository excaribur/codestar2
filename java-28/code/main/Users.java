package main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
class UserManagement {
    @GetMapping("/api/list")
    String[] listAllUser() {
        return data;
    }
    @PostMapping("/api/add")
    String addUser(String user) {
        data[0] = user;
        return "OK";
    }
     
    String[] data = { "Bill G", "Mark Z", "Elon M" };
    
    @PatchMapping("/api/update")
    String update(String name, int index) {
        if (index >= data.length) return "Error";
        data[index] = name;
        return "OK";
    
    }

}
