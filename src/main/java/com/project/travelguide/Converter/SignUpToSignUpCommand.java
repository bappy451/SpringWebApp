package com.project.travelguide.Converter;

import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Models.SignUp;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SignUpToSignUpCommand implements Converter<SignUp,SignUpCommand> {

    @Override
    public SignUpCommand convert(SignUp source) {
        if(source == null) return null;

        final SignUpCommand command = new SignUpCommand();
        command.setId(source.getId());
        command.setAccPassword(source.getAccPassword());
        command.setEmail(source.getEmail());
        command.setFirstName(source.getFirstName());
        command.setLastName(source.getLastName());
        command.setProfileImage(source.getProfileImage());

        return command;
    }
}
