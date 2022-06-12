/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.servlet.ServletContext;
import model.Account;
import util.SendingEmailUtil;

/**
 *
 * @author tretr
 */
public class EmailServiceIml implements EmailService {

    private static final String EMAIL_WELCOME_SUBJECT = "Welcome to OnlineShop";
    private static final String EMAIL_REGISTER_ACTIVE = "OnlineShop - Active Account!";
    private static final String EMAIL_FORGOT_PASSWORD = "OnlineShop - New Password";

    @Override
    public void sendEmail(ServletContext context, Account recipient, String type, String text) {
        String host = context.getInitParameter("host");
        String port = context.getInitParameter("port");
        String user = context.getInitParameter("user");
        String pass = context.getInitParameter("pass");

        try {
            String content = null;
            String subject = null;
            switch (type) {
                case "active":
                    subject = EMAIL_REGISTER_ACTIVE;
                    content = "Dear " + recipient.getFull_name() + " ,your account need to be active!\n"
                            + "Click the link below to active your account:\n"
                            + text + "\n"
                            + "Thank you very much!\n";
                    break;
                case "welcome":
                    subject = EMAIL_WELCOME_SUBJECT;
                    content = "Dear " + recipient.getFull_name() + " , hope you have a good time!";
                    break;
                case "forgot":
                    subject = EMAIL_FORGOT_PASSWORD;
                    content = "Dear " + recipient.getFull_name() + " , we send you the reset password link!\n"
                            + "Click the link below to come to reset password:\n"
                            + text + "\n"
                            + "Thank you very much!\n";
                    break;
                default:
                    subject = "OnlineShop";
                    content = "Maybe this email is wrong!";
            }
            SendingEmailUtil.sendEmail(host, port, user, pass, recipient.getEmail(), subject, content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
