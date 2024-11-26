package com.codewithmotari.mailotp.otp.service;

import com.codewithmotari.mailotp.otp.model.OTP;
import com.codewithmotari.mailotp.otp.repository.OtpRepositoryimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
@Service
public class OtpService  {
    private final int OTP_LENGTH=6;
    private final int OTP_DURATION_LENGTH=10;
    private final OtpRepositoryimpl otpRepositoryimpl;
    @Autowired
    public OtpService(OtpRepositoryimpl otpRepositoryimpl) {

        this.otpRepositoryimpl = otpRepositoryimpl;
    }

    public OTP generateOTP(){
        String otp=generateOTPToken();
        LocalDateTime expiryTime=LocalDateTime.now().plusMinutes(OTP_DURATION_LENGTH);
        return otpRepositoryimpl.save(new OTP(otp,expiryTime));
    }

    private String generateOTPToken() {
        StringBuilder otptoken=new StringBuilder(OTP_LENGTH);

       Random random=new Random();
        for (int i = 0; i < OTP_LENGTH; i++) {
            otptoken.append(random.nextInt(10));
            System.out.println("token at "+ i +" is "+ otptoken);
        }
        return otptoken.toString();
    }

    public List<OTP> getAllOtps(){
        return otpRepositoryimpl.getAll();
    }

    public OTP saveOtp() {
        return otpRepositoryimpl.save(generateOTP());
    }
}
