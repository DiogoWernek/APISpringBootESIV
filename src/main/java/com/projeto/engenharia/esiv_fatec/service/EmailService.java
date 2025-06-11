package com.projeto.engenharia.esiv_fatec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendNewClientNotification(String nomeCliente) {
        System.out.println("Enviando e-mail para novo cliente: " + nomeCliente);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("jow123.wernek@gmail.com");
        message.setSubject("Novo cliente cadastrado");
        message.setText("Um novo cliente foi cadastrado: " + nomeCliente);
        message.setFrom("diogowernek86@gmail.com");

        mailSender.send(message);
    }
}
