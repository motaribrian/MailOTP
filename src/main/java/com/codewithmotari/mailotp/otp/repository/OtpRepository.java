package com.codewithmotari.mailotp.otp.repository;

import com.codewithmotari.mailotp.otp.model.OTP;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OtpRepository extends JpaRepository<OTP,Long> {
    @Override
    Page<OTP> findAll(Pageable pageable);

}
