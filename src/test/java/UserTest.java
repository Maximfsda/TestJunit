import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void createTest() {
        User user = new User("login", "email");
        String testLog = user.getLogin();
        String testEmail = user.getEmail();
        Assertions.assertEquals(testLog, "login");
        Assertions.assertEquals(testEmail, "email");
    }

    @Test
    public void createObjectTransmitNullTest() {
        User user = new User(null, null);
        String testLog = user.getLogin();
        String testEmail = user.getEmail();
        Assertions.assertNull(testLog);
        Assertions.assertNull(testEmail);
    }

    @Test
    public void incorrectDataTest() {
        User user = new User("Log1", "log2@mail.ru");
        String testLog = user.getEmail();
        //testLog.contains("@");
        //testLog.contains(".");
        Assertions.assertTrue(testLog.contains("@"));
        Assertions.assertTrue(testLog.contains("."));
    }

    @Test
    public void equalsLogAndEMail() {
        User user = new User("log3", "pass3");
        String testLog = user.getLogin();
        String testEmail = user.getEmail();
        Assertions.assertNotEquals(testLog, testEmail);
    }
}

