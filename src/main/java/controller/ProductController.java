package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @GetMapping("/product")
    public ModelAndView product() {
        ModelAndView modelAndView = new ModelAndView("/product");
        return modelAndView;
    }
}