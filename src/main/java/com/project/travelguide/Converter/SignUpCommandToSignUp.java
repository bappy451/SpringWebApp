package com.project.travelguide.Converter;

import com.project.travelguide.Commands.SignUpCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.project.travelguide.Models.SignUp;

@Component
public class SignUpCommandToSignUp implements Converter<SignUpCommand, SignUp> {

    @Override
    public SignUp convert(SignUpCommand source) {
        if(source == null) return null;

        final SignUp signUp = new SignUp();
        signUp.setId(source.getId());
        signUp.setAccPassword(source.getAccPassword());
        signUp.setEmail(source.getEmail());
        signUp.setFirstName(source.getFirstName());
        signUp.setLastName(source.getLastName());
        signUp.setProfileImage(source.getProfileImage());

        return signUp;
    }
}
