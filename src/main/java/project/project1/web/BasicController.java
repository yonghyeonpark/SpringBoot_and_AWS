package project.project1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.project1.web.dto.BasicResponseDto;

@RestController
public class BasicController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public BasicResponseDto basicResponseDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new BasicResponseDto(name, amount);
    }

}
