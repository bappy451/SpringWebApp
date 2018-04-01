package com.project.travelguide.Controllers;

import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Repositorys.*;
import com.project.travelguide.Services.SignUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class IndexController {

    private SignUpRepository signUpRepository;
    private DistanceMeterRepository distanceMeterRepository;
    private FoodRepository foodRepository;
    private FoodTypeRepository foodTypeRepository;
    private HotelRepository hotelRepository;
    private PlaceDetailsReviewRepository placeDetailsReviewRepository;
    private PlaceDetailsRepository placeDetailsRepository;
    private ReviewTypeRepository reviewTypeRepository;
    private SafettyRepository safettyRepository;
    private ZonedetailsRepository zonedetailsRepository;
    private SignUpService signUpService;

    @Autowired
    public IndexController(SignUpRepository signUpRepository, DistanceMeterRepository distanceMeterRepository, FoodRepository foodRepository, FoodTypeRepository foodTypeRepository, HotelRepository hotelRepository, PlaceDetailsReviewRepository placeDetailsReviewRepository, PlaceDetailsRepository placeDetailsRepository, ReviewTypeRepository reviewTypeRepository, SafettyRepository safettyRepository, ZonedetailsRepository zonedetailsRepository, SignUpService signUpService) {
        this.signUpRepository = signUpRepository;
        this.distanceMeterRepository = distanceMeterRepository;
        this.foodRepository = foodRepository;
        this.foodTypeRepository = foodTypeRepository;
        this.hotelRepository = hotelRepository;
        this.placeDetailsReviewRepository = placeDetailsReviewRepository;
        this.placeDetailsRepository = placeDetailsRepository;
        this.reviewTypeRepository = reviewTypeRepository;
        this.safettyRepository = safettyRepository;
        this.zonedetailsRepository = zonedetailsRepository;
        this.signUpService = signUpService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        log.error("index Controller method");
        model.addAttribute("command",new SignUpCommand());
        return "index";
    }

    @PostMapping("/showMassage")
    public String getMassage(@ModelAttribute SignUpCommand command, Model model, @RequestParam("imagefile") MultipartFile file){
        SignUpCommand command1 = signUpService.saveSignUpCommand(command);
        signUpService.saveImageFile(command1.getId(),file);
        model.addAttribute("command",command1);
        System.out.println(command.getEmail());
        return "showMassage";
    }

    @PostMapping("/logedIn")
    public String getShow(Model model, @ModelAttribute SignUpCommand command){
        System.out.println(command.getId());
        try{
            SignUpCommand command1 = signUpService.findCommandById(command.getId());
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


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public ModelAndView handleNotFound(Exception exception){

        log.error("Handling not found exception");
        log.error(exception.getMessage());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("404error");
        modelAndView.addObject("exception", exception);
        log.debug("404 error page loading");

        return modelAndView;
    }
}
