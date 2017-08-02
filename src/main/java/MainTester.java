import apicalls.usermanagement.ResetPasswordCall;
import dtos.RegisteredEmailUser;
import dtos.ResetPasswordRepsonse;
import dtos.Token;
import dtos.Uuid;
import dtos.catalog.Page;
import jsonobjects.Email;
import jsonobjects.UserPasswordResetObject;
import jsonobjects.UserVerificationObject;
import objects.User;
import services.OTPExtractionService;
import services.ProductService;
import services.UserCreationService;

public class MainTester {

    public static void main(String []args){

        /*ProductService productService = new ProductService();
        Page page = productService.getRandomProduct();
        System.out.println(page.getName());
        System.out.println(page.getSellingPrice().getCents());
        System.out.println(page.getNin());

        /*UserCreationService ucs = new UserCreationService();
        User user = new User();
        RegisteredEmailUser reu = ucs.createUser(user);
        System.out.println(reu.getToken());

        ResetPasswordCall rpc = new ResetPasswordCall();
        Email email = new Email("noonnoontest@gmail.com");
        Uuid uuid = rpc.requestPassword(email);

        OTPExtractionService otpes = new OTPExtractionService();
        String verficationCode = otpes.getVerificationCodeForgotPassword();
        UserVerificationObject userVerificationObjecto = new UserVerificationObject(uuid.getUuid(),verficationCode);
        Token token = rpc.verifyPassword(userVerificationObjecto);

        UserPasswordResetObject upro = new UserPasswordResetObject(uuid.getUuid(), token.getToken(),"Test1234");
        ResetPasswordRepsonse resetPasswordRepsonse = rpc.resetPassword(upro);
        System.out.println(resetPasswordRepsonse.getMessage());*/



    }
}
