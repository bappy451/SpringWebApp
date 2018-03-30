package com.project.travelguide.Services;

import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Models.SingUp;

public interface SignUpService {

    SingUp findById(Long l);

    void deletById(Long idToDelete);

    SignUpCommand saveSignUpCommand(SignUpCommand command);
}
