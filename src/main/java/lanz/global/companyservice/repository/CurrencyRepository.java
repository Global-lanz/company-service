package lanz.global.companyservice.repository;

import lanz.global.companyservice.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CurrencyRepository extends JpaRepository <Currency, UUID> {


}
