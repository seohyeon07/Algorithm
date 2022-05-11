package com.example.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {
    private String account;
    private String email;
    private String address;
    private String password;

    //굳이 snake, camel case가 아니더라도 실제 개발할때는 이도저도 아닌 케이스 존재
    //@JsonProperty("OTP")
    //예) private String OTP; // 약어: 대문자 표현 -> 맵핑하기위해 @JsonProperty가 필요

    @JsonProperty("phone_number") //매칭해주는 방법
    private String phoneNumber; //보낼 때 phone_number(snake case)하면 인식 못함. null로 출력됨.


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
