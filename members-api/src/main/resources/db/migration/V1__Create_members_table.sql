CREATE TABLE members (
    id SERIAL,
    member_id VARCHAR(50) NOT NULL,
    ledger_id VARCHAR(50),
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    street_address_1 VARCHAR(100),
    street_address_2 VARCHAR(100),
    city VARCHAR(100)
);