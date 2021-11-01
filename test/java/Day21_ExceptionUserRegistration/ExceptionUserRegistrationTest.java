package Day21_ExceptionUserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.firstName("Afroj");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.firstName("afroj");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.lastName("Satwilkar");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.lastName("satwilkar");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.email("afroz.satvilkar2014@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.email("afrozsatvilkar.gmail.com");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.phoneNumber("91 9075528330");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.phoneNumber("91 907552833047");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule1("afroj78Ra");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule1("jhsjhj");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule2_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule2("Afroj786");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule2_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule2("afroj786");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule3_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule3("Afroj786");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule3_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule3("Afrojhgds");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule4_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule4("Afroj@786");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule4_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule4("Afroj786");
        Assert.assertEquals(false, actualResult);
    }

}
