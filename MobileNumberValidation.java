package in.waterbillingcalculator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

		public static boolean isValidMobileNumber(String mobileNumber) {
			// If mobileNumber is empty return false

			if ( mobileNumber == null) {
				return false;
			}

			// Regular expression for mobileNumber validation
			Pattern validate = Pattern.compile("[6-9]{1}[0-9]{9}");

			Matcher match = validate.matcher(mobileNumber);
			return match.matches();
		}
}

