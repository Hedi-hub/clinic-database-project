package clinicDatabase.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService{

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(
            String from, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo("noreply@medicareplanner.com");
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }
}
