package com.bridgeit.utility;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender implements IMailSender {
	private	final String from= "appfundo@gmail.com";
	private final String password= "appfundoo123";

		public int sendMail(String to, String subject, String msg) {

			// setting email SMTP properties
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			// check the authentication
			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, password);
				}
			});

			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));

				// recipients email address
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

				// add the Subject of email
				message.setSubject(subject);

				// message body
				message.setText(msg);

				Transport.send(message);
				return 1;
			} catch (MessagingException e) {
				e.printStackTrace();
				return 0;
			}
		}

	public String getLink(String link, long id) {
		
		return link+id;
	}
}
