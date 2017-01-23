package com.startup.event.portal.poc.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

	@Autowired
	private JavaMailSender javaMailSender;

	public void send() {
		MimeMessage mail = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mail, true);
			helper.setTo("chandrapapijanni@gmail.com");
			helper.setReplyTo("chandrapapijanni@gmail.com");
			helper.setFrom("chandrapapijanni@gmail.com");
			helper.setSubject("Test Email");
			helper.setText("test email");
		} catch (MessagingException e) {
			e.printStackTrace();
		} finally {
		}
		javaMailSender.send(mail);
	}

}
