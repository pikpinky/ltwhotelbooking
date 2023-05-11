package com.ltwhotel.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ltwhotel.dao.UserDAO;
import com.ltwhotel.entity.User;

public class UserController {
	UserDAO ud = new UserDAO();
	@PostMapping("/process-login")
    public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        // Lấy giá trị từ form đăng nhập
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // Kiểm tra và xác thực thông tin người dùng
        boolean isValid = ud.checkLogin(user);

        // Trả về phản hồi
        if (isValid) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }
}
