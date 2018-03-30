package com.project.travelguide.Converter;

import com.project.travelguide.Commands.SignUpCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.project.travelguide.Models.SingUp;

@Component
public class SignUpCommandToSignUp implements Converter<SignUpCommand, SingUp> {

    @Override
    public SingUp convert(SignUpCommand source) {
        if(source == null) return null;

        final SingUp singUp = new SingUp();
        singUp.setId(source.getId());
        singUp.setAccPassword(source.getAccPassword());
        singUp.setEmail(source.getEmail());
        singUp.setFirstName(source.getFirstName());
        singUp.setLastName(source.getLastName());
        singUp.setProfileImage(source.getProfileImage());

        return singUp;
    }
}
