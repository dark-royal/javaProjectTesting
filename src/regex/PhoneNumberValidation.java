package regex;

public class PhoneNumberValidation {

    public static boolean isPhoneNUmberValid(String phoneNumber) {

        String regex = "((234|\\+234)-?|0)?(70|[8-9][0-1])\\d{8}";
        return phoneNumber.matches(regex);
    }


    public static boolean isEmailValid(String email) {
        String regex = "([a-z]\\.)?[a-z]+@(enum +@)(\\semicolon|learnspace|native.semicolon).africa";
        return email.matches(regex);
    }
}


