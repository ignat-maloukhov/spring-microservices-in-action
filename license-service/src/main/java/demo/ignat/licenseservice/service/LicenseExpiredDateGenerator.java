package demo.ignat.licenseservice.service;

import java.time.LocalDate;

public interface LicenseExpiredDateGenerator {
    LocalDate generate();
}
