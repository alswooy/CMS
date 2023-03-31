package com.zerobase.cms.user.client.sevice;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.config.FeignConfig;
import com.zerobase.cms.user.sevice.test.EmailSendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FeignConfig.class)
class EmailSendServiceTest {
    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest(){
    //숙제?
        mailgunClient.sendEmail(null);
//        String response = mailgunClient.sendEmail();
//
//        System.out.println("보내젓다링 : " + response);
    }


}