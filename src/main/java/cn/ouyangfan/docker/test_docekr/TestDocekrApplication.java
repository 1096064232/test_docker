package cn.ouyangfan.docker.test_docekr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestDocekrApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDocekrApplication.class, args);
    }

    @GetMapping("/test")
    public String test() {
        return "这是docker自动化部署的第一个项目";
    }
}
