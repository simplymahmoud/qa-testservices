package services;

import org.slf4j.Logger;

import javax.mail.*;
import javax.mail.search.FlagTerm;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import static org.slf4j.LoggerFactory.getLogger;

public class OTPExtractionService {

    private final String DEFAULT_EMAIL = "noonnoontest@gmail.com";
    private String password = "noontest12";
    private String subject = "Your noon registration code";
    private String subjectForgotPasword = "Your verification code for noon password reset";
    private static final Logger LOG = getLogger(OTPExtractionService.class);
    private String verificationCode = "";
    private String verificationCodeForgotPassword = "";
    Message[] messages;

    private String getMessage(){
        Properties props = new Properties();

        try {
            String smtpStr = "mail.smtp.host=smtp.gmail.com\n" +
                    "mail.smtp.socketFactory.port=465\n" +
                    "mail.smtp.socketFactory.class=javax.net.ssl.SSLSocketFactory\n" +
                    "mail.smtp.auth=true\n" +
                    "mail.smtp.port=465";
            InputStream inputStream = new ByteArrayInputStream(smtpStr.getBytes(StandardCharsets.UTF_8));
            props.load(inputStream);

            Session session = Session.getDefaultInstance(props, null);

            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", DEFAULT_EMAIL, password);

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);

            messages = inbox.search(
                    new FlagTerm(new Flags(Flags.Flag.SEEN), false));

            for (int i = messages.length - 1; i > 0; i--) {
                if(messages[i].getSubject().equals(subject)) {
                    return messages[i].getContent().toString();
                } else if(messages[i].getSubject().equals(subjectForgotPasword)){
                    return messages[i].getContent().toString();
                }
            }

            inbox.close(true);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }


    public String getVerificationCodeRegistration() {
        String targetStr =  getMessage();
        String indexB = String.valueOf(targetStr.indexOf("Your verification code for noon user registration is "));
        int startIndex = Integer.parseInt(indexB) + 53;
        int endIndex = Integer.parseInt(indexB) + 59;
        verificationCode = targetStr.substring(startIndex, endIndex);

        if(verificationCode.length() > 0)
            LOG.info("Verification code: " + verificationCode);
        else
            LOG.info("Verification code not found: ");

        return verificationCode;
    }

    public String getVerificationCodeForgotPassword() {
        String targetStr =  getMessage();
        String indexB = String.valueOf(targetStr.indexOf("Your verification code for noon password reset "));
        int startIndex = Integer.parseInt(indexB) + 50;
        int endIndex = Integer.parseInt(indexB) + 56;
        verificationCodeForgotPassword = targetStr.substring(startIndex, endIndex);

        if(verificationCode.length() > 0)
            LOG.info("Verification code: " + verificationCodeForgotPassword);
        else
            LOG.info("Verification for Forgot password code not found: ");

        return verificationCodeForgotPassword;
    }
}
