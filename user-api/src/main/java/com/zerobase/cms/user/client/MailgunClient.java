package com.zerobase.cms.user.client;

import com.zerobase.cms.user.client.mailgun.SendMailForm;
import feign.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="mail",url = "https://api.mailgun.net/v3")
@Qualifier("mailgun")
public interface MailgunClient {
    @PostMapping("sandbox5165c5e964ae48dc8828ac5d25f5d444.mailgun.org/messages")
    Response sendEmail(@SpringQueryMap SendMailForm form);
}

