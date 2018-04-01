package com.project.travelguide.Controllers;

import com.project.travelguide.Commands.SafetyCommad;
import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Repositorys.*;
import com.project.travelguide.Services.SignUpService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class ImageController {

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
    public ImageController(SignUpRepository signUpRepository, DistanceMeterRepository distanceMeterRepository, FoodRepository foodRepository, FoodTypeRepository foodTypeRepository, HotelRepository hotelRepository, PlaceDetailsReviewRepository placeDetailsReviewRepository, PlaceDetailsRepository placeDetailsRepository, ReviewTypeRepository reviewTypeRepository, SafettyRepository safettyRepository, ZonedetailsRepository zonedetailsRepository, SignUpService signUpService) {
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

    @GetMapping("/signUp/{id}/image")
    public void renderImageFromDB(@PathVariable String id, HttpServletResponse response) throws IOException {
        SignUpCommand commad = signUpService.findCommandById(Long.valueOf(id));

        if (commad.getProfileImage() != null) {
            byte[] byteArray = new byte[commad.getProfileImage().length];
            int i = 0;

            for (Byte wrappedByte : commad.getProfileImage()){
                byteArray[i++] = wrappedByte; //auto unboxing
            }

            response.setContentType("image/jpeg");
            InputStream is = new ByteArrayInputStream(byteArray);
            IOUtils.copy(is, response.getOutputStream());
        }
    }

}
