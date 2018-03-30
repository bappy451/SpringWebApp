package com.project.travelguide.Controllers;

import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Services.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        return "index";
    }
}
