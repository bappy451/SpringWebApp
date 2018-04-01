package com.project.travelguide.Services;

import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Models.SignUp;
import org.springframework.web.multipart.MultipartFile;

public interface SignUpService {

    SignUpCommand saveSignUpCommand(SignUpCommand command);
    SignUp findById(Long l);
    SignUpCommand findCommandById(Long l);
    void saveImageFile(Long id, MultipartFile file);
}
