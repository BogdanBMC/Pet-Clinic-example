package ClinicExample.PetClinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {


    @RequestMapping({"/owners","/","/owners/index","/owners/index.html"})
    public String index(){

        return "Owners/index";
    }


}