package adapter;

/**
 * @Author Ardien
 * @Date 5/26/2020 1:48 PM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class ChinesePostalCode {

    public boolean isValidChinesePostalCode(String postalCode, String province) {
        postalCode = postalCode.replace("/[. -]/", "");
        return postalCode.matches("^[1-9]\\d{5}(?!\\d)$");
    }
}
