package demo.ignat.licenseservice.exception;

public class BaseLicenseException extends RuntimeException {

    public BaseLicenseException(String message) {
        super(message);
    }

    public BaseLicenseException() {
        super();
    }

}
