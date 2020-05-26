package adapter;

public class Customer {
    public static final String US = "US";
    public static final String CANADA = "Canada";
    public static final String CHINA = "China";

    private final String country;
    private final String state;
    private final String zip;

    public Customer(String inp_zip, String inp_state, String inp_country) {
        zip = inp_zip;
        state = inp_state;
        country = inp_country;
    }

    public boolean isValidZip() {

        if (country.equals(Customer.US)) {
            USAZipCode us = new USAZipCode();

            return us.isValidZipCode(zip, state);
        }
        if (country.equals(Customer.CANADA)) {
            CanadianPostalCode objCAPCode = new CanadianPostalCode();
            ZipCodeValidator adapter = new CAPostalCodeAdapter(objCAPCode);

            return adapter.isValidZipCode(zip, state);
        }
        if (country.equals(Customer.CHINA)) {
            ChinesePostalCode chinesePostalCode = new ChinesePostalCode();
            ChinesePostalCodeAdapter adapter = new ChinesePostalCodeAdapter(chinesePostalCode);
            return adapter.isValidZipCode(zip, state);
        } else
            return false;
    }
}// end of class


