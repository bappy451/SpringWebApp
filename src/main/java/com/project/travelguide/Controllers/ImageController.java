package com.project.travelguide.Controllers;

import com.project.travelguide.Commands.HotelCommand;
import com.project.travelguide.Commands.PlaceDetailsCommand;
import com.project.travelguide.Commands.SafetyCommad;
import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Repositorys.*;
import com.project.travelguide.Services.HotelService;
import com.project.travelguide.Services.PlaceService;
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
    private SignUpService signUpService;
    private PlaceService placeService;
    private HotelService hotelService;

    @Autowired
    public ImageController(SignUpService signUpService, PlaceService placeService, HotelService hotelService) {
        this.signUpService = signUpService;
        this.placeService = placeService;
        this.hotelService = hotelService;
    }

    @GetMapping("/signUp/{id}/image")
    public void renderProfileImageFromDB(@PathVariable String id, HttpServletResponse response) throws IOException {
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

    @GetMapping("/place/{id}/image")
    public void renderPlaceImageFromDB(@PathVariable String id, HttpServletResponse response) throws IOException {
        PlaceDetailsCommand commad = placeService.findCommandById(Long.valueOf(id));

        if (commad.getPlaceImage() != null) {
            byte[] byteArray = new byte[commad.getPlaceImage().length];
            int i = 0;
            for (Byte wrappedByte : commad.getPlaceImage()){
                byteArray[i++] = wrappedByte; //auto unboxing
            }
            response.setContentType("image/jpeg");
            InputStream is = new ByteArrayInputStream(byteArray);
            IOUtils.copy(is, response.getOutputStream());
        }
    }
    @GetMapping("/hotel/{id}/image")
    public void renderHotelImageFromDB(@PathVariable String id, HttpServletResponse response) throws IOException {
        HotelCommand commad = hotelService.findCommandById(Long.valueOf(id));
        if (commad.getHotelImage() != null) {
            byte[] byteArray = new byte[commad.getHotelImage().length];
            int i = 0;
            for (Byte wrappedByte : commad.getHotelImage()){
                byteArray[i++] = wrappedByte; //auto unboxing
            }
            response.setContentType("image/jpeg");
            InputStream is = new ByteArrayInputStream(byteArray);
            IOUtils.copy(is, response.getOutputStream());
        }
    }

}
