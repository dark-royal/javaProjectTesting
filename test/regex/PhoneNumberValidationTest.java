package regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberValidationTest {

    @Test
    public void testValidationOfPhoneNumber(){
        String phoneNumber = "";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber2(){
        String phoneNumber = "09035067896";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber3(){
        String phoneNumber = "+2349035067896";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber4(){
        String phoneNumber = "+234903506789645";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber5(){
        String phoneNumber = "+2349028979349";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber6(){
        String phoneNumber = "+2347114567834";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber7(){
        String phoneNumber = "+2349028.979349";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber8(){
        String phoneNumber = "a2349028979349";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber9(){
        String phoneNumber = "+23470oooooooo";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);

    }
    @Test
    public void testValidationOfPhoneNumber10(){
        String phoneNumber = "+234-7015678956";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber11(){
        String phoneNumber = "8023456712";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfPhoneNumber12(){
        String phoneNumber = "+234-70-245-987-98";
        boolean isPhoneNumberValid = PhoneNumberValidation.isPhoneNUmberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);

    }

    @Test
    public void testValidationOfEmailAddress1(){
        String email = "";
        boolean isEmailIsValid = PhoneNumberValidation.isEmailValid(email);
        assertFalse(isEmailIsValid);

    }

    @Test
    public void testValidationOfEmailAddress2(){
        String email = "ashley@semicolon.africa";
        boolean isEmailIsValid = PhoneNumberValidation.isEmailValid(email);
        assertTrue(isEmailIsValid);

    }

}