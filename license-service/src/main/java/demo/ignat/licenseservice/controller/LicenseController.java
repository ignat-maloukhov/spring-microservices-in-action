package demo.ignat.licenseservice.controller;

import demo.ignat.licenseservice.exception.LicenseNotFoundException;
import demo.ignat.licenseservice.model.License;
import demo.ignat.licenseservice.service.LicenseExpiredDateGenerator;
import demo.ignat.licenseservice.service.LicensePriceGenerator;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/license")
public class LicenseController {

    private final LicenseService licenseService;

    /**
     * Проверяет работоспособность endpoint "/api/v1/license".
     * Пример использования: localhost:8080/api/v1/license/health
     *
     * @return объект ResponseEntity<String> с кодом ответа
     */
    @GetMapping("/health")
    public ResponseEntity<String> isAlive() {
        return ResponseEntity.ok("api is alive");
    }


    /**
     * Создает новую лицензию
     *
     * @param type                 - тип лицензии
     * @param expiredDateGenerator - генератор срока действия лицензии
     * @param priceGenerator       - генератор цены лицензии
     * @return - объект License
     */
    @PostMapping()
    public ResponseEntity<License> generateLicense(License.Type type,
                                                   LicenseExpiredDateGenerator expiredDateGenerator,
                                                   LicensePriceGenerator priceGenerator) {
        var expiredDate = expiredDateGenerator.generate();
        var price = priceGenerator.generate();
        var license = licenseService.generate(type);
        return ResponseEntity.ok(license);
    }


    /**
     * Возвращает объект лицензии по id
     *
     * @param id - идентификатор лицензии
     * @return - объект License
     * @throws LicenseNotFoundException
     */

    @GetMapping()
    public ResponseEntity<License> getLicense(@RequestParam("id") UUID id) throws LicenseNotFoundException {

        var license = licenseService.get(id);
        return ResponseEntity.ok(license);
    }

    /**
     * Изменяет лицензию
     *
     * @param id - идентификатор лицензии
     * @return - объект License
     * @throws LicenseNotFoundException
     */
    @PutMapping()
    public ResponseEntity<License> updateLicense(@RequestParam("id") UUID id) throws LicenseNotFoundException {

        var license = licenseService.update(id);
        return ResponseEntity.ok(license);
    }

    /**
     * Удаляет текущую лицензию
     *
     * @param id - идентификатор лицензии
     * @return - объект License, которая была удалена
     * @throws LicenseNotFoundException
     */
    @DeleteMapping()
    public ResponseEntity<License> deleteLicense(@RequestParam("id") UUID id) throws LicenseNotFoundException {

        var license = licenseService.delete(id);
        return ResponseEntity.ok(license);
    }

}