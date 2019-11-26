package sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sfgpetclinic.model.services.VetServise;
@RequestMapping("/vets")
@Controller
public class VetController {
    private final VetServise vetService;

    public VetController(VetServise vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/index","/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
