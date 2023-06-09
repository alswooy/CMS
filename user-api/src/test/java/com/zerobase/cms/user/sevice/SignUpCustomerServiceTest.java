package com.zerobase.cms.user.sevice;

import com.zerobase.cms.user.domain.SignUpForm;
import com.zerobase.cms.user.domain.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class SignUpCustomerServiceTest {
    @Autowired
    private SignUpCustomerService service;
    @Test
    void signUp(){
        SignUpForm from = SignUpForm.builder()
                .name("name")
                .birth(LocalDate.now())
                .email("abc@gmail.com")
                .password("1")
                .phone("01000000000")
                .build();
        Customer c = service.signUp(from);
        assertNotNull(c.getId());
        assertNotNull(c.getCreatedAt());
        Assert.isTrue(service.signUp(from).getId()!=null);

        //given
        //when
        //then
    }

}