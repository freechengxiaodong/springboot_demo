package springboot.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Autowired
    @RequestMapping("/hello")
    public String hello(){
        return "www.biancheng.net";
    }
    @RequestMapping("/hello2")
    public String hello2(){
        return "hello2方法";
    }
}
