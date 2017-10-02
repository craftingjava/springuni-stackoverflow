package com.springuni.question46521912;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lcsontos on 10/2/17.
 */
@Controller
public class ClassController {

    @RequestMapping("/application/index.do")
    public String index(HttpServletRequest request, ModelMap modelMap) {
        // This one can handle any rest URIs, e.g: localhost:8080/application/abc, localhost:8080/application/abc/12/asdasd/3123,...
        modelMap.put("requestURI", request.getRequestURI());
        return "index";
    }

    @RequestMapping("/application/**")
    public ResponseEntity handle(HttpServletRequest request) {
        return ResponseEntity.ok(request.getRequestURI());
    }

}
