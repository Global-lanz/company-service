
CREATE TABLE IF NOT EXISTS currency
(
    currency_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name        CHARACTER VARYING,
    symbol      CHARACTER VARYING(3),
    code        CHARACTER VARYING(3)
    );

CREATE TABLE IF NOT EXISTS company
(
    company_id  UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name        CHARACTER VARYING NOT NULL,
    country     CHARACTER VARYING,
    currency_id UUID,
    CONSTRAINT company_currency_fk FOREIGN KEY (currency_id) REFERENCES currency (currency_id)
    );

INSERT INTO currency (name, symbol, code)
VALUES ('US Dollar', '$', 'USD');
INSERT INTO currency (name, symbol, code)
VALUES ('Euro', '€', 'EUR');
INSERT INTO currency (name, symbol, code)
VALUES ('Japanese Yen', '¥', 'JPY');
INSERT INTO currency (name, symbol, code)
VALUES ('British Pound', '£', 'GBP');
INSERT INTO currency (name, symbol, code)
VALUES ('Australian Dollar', 'A$', 'AUD');
INSERT INTO currency (name, symbol, code)
VALUES ('Canadian Dollar', 'C$', 'CAD');
INSERT INTO currency (name, symbol, code)
VALUES ('Swiss Franc', 'CHF', 'CHF');
INSERT INTO currency (name, symbol, code)
VALUES ('Chinese Yuan', '¥', 'CNY');
INSERT INTO currency (name, symbol, code)
VALUES ('Hong Kong Dollar', 'HK$', 'HKD');
INSERT INTO currency (name, symbol, code)
VALUES ('New Zealand Dollar', 'NZ$', 'NZD');
INSERT INTO currency (name, symbol, code)
VALUES ('Swedish Krona', 'kr', 'SEK');
INSERT INTO currency (name, symbol, code)
VALUES ('Norwegian Krone', 'kr', 'NOK');
INSERT INTO currency (name, symbol, code)
VALUES ('Russian Ruble', '₽', 'RUB');
INSERT INTO currency (name, symbol, code)
VALUES ('Indian Rupee', '₹', 'INR');
INSERT INTO currency (name, symbol, code)
VALUES ('Brazilian Real', 'R$', 'BRL');
INSERT INTO currency (name, symbol, code)
VALUES ('South African Rand', 'R', 'ZAR');
INSERT INTO currency (name, symbol, code)
VALUES ('Mexican Peso', '$', 'MXN');
INSERT INTO currency (name, symbol, code)
VALUES ('Singapore Dollar', 'S$', 'SGD');
INSERT INTO currency (name, symbol, code)
VALUES ('South Korean Won', '₩', 'KRW');
INSERT INTO currency (name, symbol, code)
VALUES ('Turkish Lira', '₺', 'TRY');
INSERT INTO currency (name, symbol, code)
VALUES ('Israeli New Shekel', '₪', 'ILS');