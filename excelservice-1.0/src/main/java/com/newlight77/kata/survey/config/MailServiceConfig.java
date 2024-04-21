package com.newlight77.kata.survey.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class MailServiceConfig {

  @Value("${service.mail.from}")
  private String from;

  @Value("${service.mail.to}")
  private String[] to;

  @Value("${service.mail.subject}")
  private String subject;

  @Value("${service.mail.text}")
  private String text;
}
