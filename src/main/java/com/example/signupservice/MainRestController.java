package com.example.signupservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController
{
    @Autowired
    CredentialRepository credentialRepository;

    @PostMapping("signup")
    public ResponseEntity<String> signup(@RequestParam("username") String username, @RequestParam("password") String password )
    {
        Credential credential = new Credential();
        credential.setId(username);
        credential.setPassword(password);
        credentialRepository.save(credential);
        return new ResponseEntity<>("New User Successfully Signed Up", HttpStatus.OK);
    }

}
