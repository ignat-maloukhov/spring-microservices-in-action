package demo.ignat.licenseservice.controller;

import demo.ignat.licenseservice.model.License;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public interface LicenseService {

    License generate(License.Type type);

    License get(UUID id);

    License update(UUID id);

    License delete(UUID id);
}
