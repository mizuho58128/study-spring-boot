package demo.controller; // ← パッケージ名を必ずディレクトリ構成に合わせます

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/user/{name}")
    public String username(@PathVariable String name) {
        return "こんにちは、" + name + "さん！";
    }
}
