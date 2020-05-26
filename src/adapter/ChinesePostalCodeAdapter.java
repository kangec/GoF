package adapter;

/**
 * @Author Ardien
 * @Date 5/26/2020 1:49 PM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class ChinesePostalCodeAdapter extends ChinesePostalCode implements ZipCodeValidator {
    ChinesePostalCode chinesePostalCode;

    public ChinesePostalCodeAdapter(ChinesePostalCode chinesePostalCode) {
        this.chinesePostalCode = chinesePostalCode;
    }

    @Override
    public boolean isValidZipCode(String zip, String state) {
        return isValidChinesePostalCode(zip, state);
    }
}
