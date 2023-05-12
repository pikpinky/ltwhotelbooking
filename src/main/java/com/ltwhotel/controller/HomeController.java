package com.ltwhotel.controller;

import com.ltwhotel.*;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {
	
    @Autowired
    private UserService userService;
    
	@GetMapping("/home")
	public String getHome() {
		return "home";
	}
	
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserDto userDto) {
        String username = userDto.getUsername();
        String password = userDto.getPassword();

        User user = userService.getUserByUsernameAndPassword(username, password);
        if (user != null) {
            return ResponseEntity.ok().body(user);
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password");
        }
    }
}