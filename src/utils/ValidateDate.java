package utils;

import utils.myexception.InvalidDate;

public class ValidateDate {
    public boolean validateDate (String email) throws InvalidDate {
        String regex = "";
        if (!email.matches(regex)) {
            throw new InvalidDate("Invalid email format : "+ email);
        }
        return true;
    }

}
