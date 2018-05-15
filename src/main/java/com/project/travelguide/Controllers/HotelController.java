package com.project.travelguide.Controllers;

import com.project.travelguide.Commands.HotelCommand;
import com.project.travelguide.Repositorys.HotelRepository;
import com.project.travelguide.Services.HotelService;
import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@Slf4j
public class HotelController {
    private HotelRepository hotelRepository;
    private HotelService hotelService;

    @Autowired
    public HotelController(HotelRepository hotelRepository, HotelService hotelService) {
        this.hotelRepository = hotelRepository;
        this.hotelService = hotelService;
    }

    @RequestMapping({"hotel/hotelForm"})
    public String getStudent(Model model){
        log.error("hotelForm loading...");
        model.addAttribute("command",new HotelCommand());
        return "hotel/hotelForm";
    }

    @PostMapping("/hotel/savedHotel")
    public String SavePlaceDetails(@ModelAttribute HotelCommand command, Model model, @RequestParam("imagefile") MultipartFile file) throws IOException {
        log.error("Loading Saved Place");
        HotelCommand command1 = hotelService.saveHotelCommand(command);
        hotelService.saveImageFile(command1.getId(),file);
        model.addAttribute("command",command1);
        return "/hotel/savedHotel";
    }

    @RequestMapping({"hotel/hotels"})
    public String getPlaces(Model model){
        log.error("loading hotelsssss");
        model.addAttribute("command",hotelRepository.findAll());
        return "hotel/hotels";
    }
    @GetMapping("/hotel/{id}/savedhotel")
    public String getPlacesById(Model model, @PathVariable String id){
        log.error(id);
        HotelCommand command = hotelService.findCommandById(new Long(id));
        model.addAttribute("command",command);
        return "hotel/savedHotel";
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView handleNotFound(Exception exception){

        log.error("Handling not found exception");
        log.error(exception.getMessage());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("404error");
        modelAndView.addObject("exception", exception);

        return modelAndView;
    }
}
