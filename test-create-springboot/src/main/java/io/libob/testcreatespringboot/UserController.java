package io.libob.testcreatespringboot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/createUser")
    public String createUser() {
        String a = "String2";
        String b = "String";
        String c = b + "2";
        new StringBuilder().append("");
        userService.insert("libob", "22222222");
        userService.update("libob", "111111111");
        return "用户创建成功";
    }

    @GetMapping("/list")
    public String list() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(userService.list());
    }

    @GetMapping("/lisetByUsername")
    public String lisetByUsername(@RequestParam String username) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(userService.listByUsername(username));
    }

    // http delete
    @GetMapping("/deleteByUsername")
    public String deleteByUsername(@RequestParam String username) {
        boolean result = userService.deleteByUsername(username);
        if (result) {
            return "删除成功";
        }

        return "删除失败";

    }
}
