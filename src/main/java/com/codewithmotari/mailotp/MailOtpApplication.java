package com.codewithmotari.mailotp;

import com.codewithmotari.mailotp.otp.model.OTP;
import com.codewithmotari.mailotp.otp.repository.OtpRepository;
import com.codewithmotari.mailotp.otp.service.OtpService;
import com.codewithmotari.mailotp.person.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class MailOtpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailOtpApplication.class, args);
    }

}
