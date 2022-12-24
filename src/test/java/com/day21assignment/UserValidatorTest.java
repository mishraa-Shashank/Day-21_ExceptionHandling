package com.day21assignment;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    UserValidator validator = new UserValidator();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws MyCustomException {
        boolean result = validator.validateFirstName("shashank");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws MyCustomException {
        boolean result = validator.validateLastName("Mishra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() throws MyCustomException {
        boolean result = validator.validateEmailAddress("abc@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws MyCustomException {
        boolean result = validator.validateMobileNumber("+91 99801998");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws MyCustomException {
        boolean result = validator.validatePassword("Shashank123@123");
        Assert.assertTrue(result);
    }
}
