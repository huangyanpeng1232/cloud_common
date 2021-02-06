package com.admin.email.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("email")
public class SendEmailController {

    @RequestMapping("sendEmail")
    public String sendEmail(String recipients,String content){
        log.info("发送邮件功能 收件人：{} 内容：{}",recipients,content);
        return "true";
    }
}
