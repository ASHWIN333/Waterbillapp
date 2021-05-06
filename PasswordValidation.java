package in.waterbillingcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

		public static boolean isValidPassword (String enteredPassword) {
			// If password is empty,length greater than 10,then return false

			if (enteredPassword == null) {
				return false;
			}

			// Regular expression for password validation
			Pattern validate = Pattern.compile("[a-zA-Z0-9]{8}");

			Matcher match = validate.matcher(enteredPassword);
			return match.matches();
		}
}
