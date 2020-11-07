package net.endu.enduscan.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/backend")
public class BackendController {

    @GetMapping()
    public String getString() {
        return "Hello2";
    }

}