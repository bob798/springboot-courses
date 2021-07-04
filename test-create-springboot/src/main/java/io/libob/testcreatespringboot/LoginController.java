package io.libob.testcreatespringboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {

        List<User> users = new ArrayList<>();
        User libob = new User("libob", "123456");
        User shang = new User("shang", "wsx123");
        User shi = new User("shi", "qaz123");
        users.add(libob);
        users.add(shang);
        users.add(shi);

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return "请填写用户名或密码";
        }
        for (User u :
                users) {
            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
                return "登录成功";
            }
        }
        return "登录失败，用户名或密码错误";
    }



}
