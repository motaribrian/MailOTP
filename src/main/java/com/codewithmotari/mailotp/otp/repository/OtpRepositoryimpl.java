package com.codewithmotari.mailotp.otp.repository;

import com.codewithmotari.mailotp.otp.model.OTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository
public class OtpRepositoryimpl {
    @Autowired
    private OtpRepository otpRepository;
    public OTP save(OTP otp){
        return otpRepository.save(otp);

    }
    public void deleteOtp(OTP otp){
        boolean b = !(otp == null);
        if (b)
        otpRepository.delete(otp);

    }
    public List<OTP> getAll(){
        return otpRepository.findAll();
    }

}
