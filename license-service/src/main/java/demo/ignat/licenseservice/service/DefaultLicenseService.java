package demo.ignat.licenseservice.service;

import demo.ignat.licenseservice.controller.LicenseService;
import demo.ignat.licenseservice.model.License;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Service
@AllArgsConstructor
public class DefaultLicenseService implements LicenseService {

    private final LicenseExpiredDateGenerator licenseExpiredDateGenerator;
    private final LicensePriceGenerator licensePriceGenerator;

    @Override
    public License generate(License.Type type) {
        return null;
    }

    @Override
    public License get(UUID id) {
        return null;
    }

    @Override
    public License update(UUID id) {
        return null;
    }

    @Override
    public License delete(UUID id) {
        return null;
    }
}
