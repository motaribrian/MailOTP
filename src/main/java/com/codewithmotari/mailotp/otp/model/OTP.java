package com.codewithmotari.mailotp.otp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
@Data
@Entity
public class OTP {
    @Id
    @GeneratedValue
    @Getter
    private long ID;
    @Column
    private String OTP;
    @Column
    private LocalDateTime expirytime;

    public OTP(String OTP, LocalDateTime expirytime) {
        this.OTP = OTP;
        this.expirytime = expirytime;
    }

    protected OTP() {
    }

}
