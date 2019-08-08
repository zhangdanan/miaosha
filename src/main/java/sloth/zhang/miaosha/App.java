package sloth.zhang.miaosha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 15:55 2019/8/7
 * @Modificd By;
 */

@EnableAutoConfiguration
@RestController
public class App {

    @RequestMapping("/")
    public String hello(){
        return "hello world";
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(App.class,args);
    }
}
