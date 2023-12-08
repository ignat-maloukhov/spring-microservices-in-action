package demo.ignat.licenseservice.util;

import demo.ignat.licenseservice.service.LicenseExpiredDateGenerator;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class FilePropertiesLicenseExpiredDateGenerator implements LicenseExpiredDateGenerator {
    @Override
    public LocalDate generate() {
        return null;
    }
}
