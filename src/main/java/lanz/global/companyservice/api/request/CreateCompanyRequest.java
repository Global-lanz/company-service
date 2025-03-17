package lanz.global.companyservice.api.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record CreateCompanyRequest(@Schema(description = "The name of the social media company") @NotBlank String name,
                                   @Schema(description = "The name of the country where the social media company is located") String country,
                                   @Schema(description = "The currency that the social media company uses by default") UUID currencyId) {
}
