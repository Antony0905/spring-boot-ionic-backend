package com.matheus.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.matheus.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

}
