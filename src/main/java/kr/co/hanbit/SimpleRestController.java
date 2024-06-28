package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러
@RestController
public class SimpleRestController {

    @RequestMapping("/")
    public String hello(){
        return "Hello <strong>Backend</strong>";
    }

//    @RequestMapping("/bye")
//    public String bye(){
//        return "Bye";
//    }
}
