package demo.ignat.licenseservice.util;

import demo.ignat.licenseservice.service.LicensePriceGenerator;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FilePropertiesLicensePriceGenerator implements LicensePriceGenerator {
    @Override
    public BigDecimal generate() {
        return null;
    }
}
