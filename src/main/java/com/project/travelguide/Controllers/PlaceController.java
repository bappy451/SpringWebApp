package com.project.travelguide.Controllers;

import com.project.travelguide.Commands.PlaceDetailsCommand;
import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Models.PlaceDetails;
import com.project.travelguide.Repositorys.PlaceDetailsRepository;
import com.project.travelguide.Services.PlaceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@Controller
public class PlaceController {

    private PlaceDetailsRepository placeDetailsRepository;
    private PlaceService placeService;

    @Autowired
    public PlaceController(PlaceDetailsRepository placeDetailsRepository, PlaceService placeService) {
        this.placeDetailsRepository = placeDetailsRepository;
        this.placeService = placeService;
    }

    @RequestMapping({"place/placeForm"})
    public String getStudent(Model model){
        log.error("PlaceForm loading...");
        model.addAttribute("command",new PlaceDetailsCommand());
        return "place/placeForm";
    }

    @PostMapping("place/savedPlace")
    public String SavePlaceDetails(@ModelAttribute PlaceDetailsCommand command,Model model, @RequestParam("imagefile") MultipartFile file) throws IOException {
        log.error("Loading Saved Place");
        PlaceDetailsCommand command1 = placeService.savePlaceDetailsCommand(command);
        placeService.saveImageFile(command1.getId(),file);
        model.addAttribute("command",command1);
        return "place/savedPlace";
    }
    @PostMapping("Faltuuuuu")
    public String getShow(Model model, @ModelAttribute PlaceDetailsCommand command){
        System.out.println(command.getId());
        try{
            PlaceDetailsCommand command1 = placeService.findCommandById(command.getId());
            if(command.getId()==command1.getId()){
                model.addAttribute("command",command1);
                return "logedIn";
            }
        }catch (Exception e){
            System.out.println(e);
            return "redirect:index";
        }
        return "redirect:index";
    }

    @RequestMapping({"place/coxsbazar"})
    public String getCoxsBazar(Model model){
        log.error("Cox's Bazar");
        model.addAttribute("command",new SignUpCommand());
        return "place/coxsbazar";
    }

    @RequestMapping({"place/rangamati"})
    public String getRangamati(Model model){
        log.error("Rangamati");
        model.addAttribute("command",new SignUpCommand());
        return "place/rangamati";
    }
    @RequestMapping({"place/places"})
    public String getPlaces(Model model){
        model.addAttribute("placeDetails",placeDetailsRepository.findAll());
        return "place/places";
    }

    @GetMapping("/place/{id}/savedPlace")
    public String getPlacesById(Model model, @PathVariable String id){
        log.error(id);
        PlaceDetailsCommand command = placeService.findCommandById(new Long(id));
        model.addAttribute("command",command);
        return "place/savedPlace";
    }
}
