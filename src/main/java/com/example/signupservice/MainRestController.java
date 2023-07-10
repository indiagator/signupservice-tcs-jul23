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

        String walletid = String.valueOf((int)(Math.random()*10000));
        Wallet wallet = new Wallet();
        wallet.setId(walletid);
        wallet.setBalance(0);

        Usernamewalletlink usernamewalletlink = new Usernamewalletlink();
        usernamewalletlink.setId(username);
        usernamewalletlink.setWalletid(walletid);

        return new ResponseEntity<>("New User Successfully Signed Up", HttpStatus.OK);


    }

}
