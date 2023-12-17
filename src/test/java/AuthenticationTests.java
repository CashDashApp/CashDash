import org.cashdash.controllers.Authentication;
import org.cashdash.models.User;
import org.cashdash.services.UserService;
import org.cashdash.utils.Rand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthenticationTests {
    @Test
    public void loginSuccess() {
//        try {
//            User expectedUser = new User(
//                    Rand.generateString(8),
//                    Rand.generateString(8),
//                    false
//            );
//
//            // TODO: register user
//            UserService.createUser(expectedUser.getFullname(), expectedUser.getUsername(), expectedUser.getPassword());
//
//            User loginUser = new User(expectedUser.getUsername(), expectedUser.getPassword());
//            Authentication.login(loginUser);
//
//            expectedUser = UserService.findByUsername(expectedUser.getUsername());
//
//            Assertions.assertEquals(loginUser.getId(), expectedUser.getId());
//            Assertions.assertEquals(loginUser.getUsername(), expectedUser.getUsername());
//            Assertions.assertEquals(loginUser.getFullname(), expectedUser.getFullname());
//            Assertions.assertEquals(loginUser.isAdmin(), expectedUser.isAdmin());
//
//
//        } catch (Exception exception) {
//            Assertions.fail(exception.getMessage());
//        }
    }
}
