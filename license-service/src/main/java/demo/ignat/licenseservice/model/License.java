package demo.ignat.licenseservice.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record License(UUID id,
                      Type type,
                      LocalDate issued,
                      LocalDate expired,
                      BigDecimal price) {

    public enum Type {
        STANDARD,
        UNLIMITED

    }
}
