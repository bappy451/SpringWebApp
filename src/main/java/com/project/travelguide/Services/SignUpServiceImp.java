package com.project.travelguide.Services;

import com.project.travelguide.Commands.SignUpCommand;
import com.project.travelguide.Converter.SignUpCommandToSignUp;
import com.project.travelguide.Converter.SignUpToSignUpCommand;
import com.project.travelguide.Models.SignUp;
import com.project.travelguide.Repositorys.SignUpRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.Optional;

@Service
@Slf4j
public class SignUpServiceImp implements SignUpService{
    private final SignUpRepository signUpRepository;
    private final SignUpCommandToSignUp signUpCommandToSignUp;
    private final SignUpToSignUpCommand signUpToSignUpCommand;

    public SignUpServiceImp(SignUpRepository signUpRepository, SignUpCommandToSignUp signUpCommandToSignUp, SignUpToSignUpCommand signUpToSignUpCommand) {
        this.signUpRepository = signUpRepository;
        this.signUpCommandToSignUp = signUpCommandToSignUp;
        this.signUpToSignUpCommand = signUpToSignUpCommand;
    }

    @Override
    @Transactional
    public SignUpCommand saveSignUpCommand(SignUpCommand command) {
        SignUp detached = signUpCommandToSignUp.convert(command);

        SignUp saved = signUpRepository.save(detached);
        log.debug("Student is saved in DB");
        return signUpToSignUpCommand.convert(saved);
    }

    @Override
    public SignUp findById(Long l) {
        Optional<SignUp> signUp = signUpRepository.findById(l);
        if(!signUp.isPresent()) throw new RuntimeException("User not found");

        return signUp.get();
    }

    @Override
    @Transactional
    public SignUpCommand findCommandById(Long l) {
        return signUpToSignUpCommand.convert(findById(l));
    }

    @Override
    @Transactional
    public void saveImageFile(Long id, MultipartFile file) {

        try {
            SignUp signUp = signUpRepository.findById(id).get();

            Byte[] byteObjects = new Byte[file.getBytes().length];

            int i = 0;

            for (byte b : file.getBytes()){
                byteObjects[i++] = b;
            }

            signUp.setProfileImage(byteObjects);

            signUpRepository.save(signUp);
        } catch (IOException e) {
            //todo handle better
            log.error("Error occurred", e);

            e.printStackTrace();
        }
    }
}
