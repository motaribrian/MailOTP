package com.codewithmotari.mailotp.otp.controller;

import com.codewithmotari.mailotp.otp.model.OTP;
import com.codewithmotari.mailotp.otp.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OTPController {
    @Autowired
    private OtpService otpservice;
    @RequestMapping("/otps")
    public List<OTP> getAllOtps(){
        return otpservice.getAllOtps();
    }
    @RequestMapping("/saveotp")
    public OTP save(OTP otp){
        return otpservice.saveOtp();
    }
}
