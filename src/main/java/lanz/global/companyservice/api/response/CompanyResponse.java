package lanz.global.companyservice.api.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

public record CompanyResponse(
        @Schema(description = "The currency that the social media company uses by default") UUID companyId,
        @Schema(description = "The name of the social media company") String name,
        @Schema(description = "The name of the country where the social media company is located") String country,
        @Schema(description = "The currency that the social media company uses by default") UUID currencyId) {
}
