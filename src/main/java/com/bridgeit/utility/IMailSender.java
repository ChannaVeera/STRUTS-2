package com.bridgeit.utility;

public interface IMailSender {
int sendMail(String to, String subject, String msg);
	String getLink(String link, long id);
}
