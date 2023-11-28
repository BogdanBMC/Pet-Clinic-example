package ClinicExample.PetClinic.Controllers;

import ClinicExample.PetClinic.Services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

        public  final OwnerService ownerService;

        //injecting owner service
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"/owners","/","/owners/index","/owners/index.html"})
    public String index(Model model){

        model.addAttribute("owners",ownerService.findAll()); //owners e numele propietatii din model care face find all pe ownnerservice

        return "Owners/index";
    }


}
