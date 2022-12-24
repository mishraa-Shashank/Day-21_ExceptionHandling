package com.day21assignment;

import java.util.regex.Pattern;

public class UserValidator {
    public static void main(String[] args) {
        System.out.println("Welcome to exception handling program.");
    }
    static boolean validate(String pattern, String input) {
        return Pattern.compile(pattern).matcher(input).matches();
    }

    public boolean validateFirstName(String firstName) {
        String firstNamePattern = "^[A-Z]{1}[a-z]{3,}$";
        boolean isMatched = validate(firstNamePattern, firstName);
        return isMatched;
    }

    public boolean validateLastName(String lastName) {
        String lastNamePattern = "^[A-Z]{1}[a-z]{3,}$";
        boolean isMatched = validate(lastNamePattern, lastName);
        return isMatched;
    }

    public boolean validateEmailAddress(String email) {
        String emailPattern = "^[a-zA-Z]{3,}(?=.*[.+-])[a-zA-Z0-9]*[@][a-zA-Z]+[.][a-z]{3,}([_+-.][a-zA-Z])*$";
        boolean isMatched = validate(emailPattern, email);
        return isMatched;
    }

    public boolean validateMobileNumber(String mobNumber) {
        String phoneNumberPattern = "^[+91|0]+[ ]?[6-9]{1}[0-9]{9}$";
        boolean isMatched = validate(phoneNumberPattern, mobNumber);
        return isMatched;
    }

    public boolean validatePassword(String password) {
        String passwordRegex = "^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[-#$%&@]+)(?=.*[a-zA-Z]).{8,}$";
        boolean isMatched = validate(passwordRegex, password);
        return isMatched;
    }
}
