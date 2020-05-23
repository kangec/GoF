package adapter;

public class CAPostalCodeAdapter extends CanadianPostalCode implements ZipCodeValidator {

    private final CanadianPostalCode objCPostCode;

    public CAPostalCodeAdapter(CanadianPostalCode pCode) {
        objCPostCode = pCode;
    }

    public boolean isValidZipCode(String zip, String state) {
        return isValidCanadianPcode(zip, state);
    }
}// end of class


