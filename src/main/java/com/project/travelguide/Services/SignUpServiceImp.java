package com.project.travelguide.Services;

import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Models.SingUp;
import com.project.travelguide.Repositorys.SignUpRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SignUpServiceImp implements SignUpService{
    private final SignUpRepository signUpRepository;

    public SignUpServiceImp(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

    @Override
    public SingUp findById(Long l) {
        Optional<SingUp> singUpOptional = signUpRepository.findById(l);

        if (!singUpOptional.isPresent()) {
            throw new RuntimeException("Recipe Not Found!");
        }

        return singUpOptional.get();
    }

    @Override
    public void deletById(Long idToDelete) {
        signUpRepository.deleteById(idToDelete);
    }

    @Override
    public SignUpCommand saveSignUpCommand(SignUpCommand command) {
        return null;
    }
}
