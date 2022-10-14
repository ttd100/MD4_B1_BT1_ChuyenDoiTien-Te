package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String kakalot(@RequestParam double rate,@RequestParam double usd, ModelMap modelMap) {
        double vnd = rate*usd;

        modelMap.addAttribute("usd",usd);

        modelMap.addAttribute("rate", rate);

        modelMap.addAttribute("vnd", vnd);
        return "convertform";
    }


}
