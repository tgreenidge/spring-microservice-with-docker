-- Table is not normalized
CREATE TABLE claims (
    id SERIAL,
    ledger_id VARCHAR(50),
    pscu_id VARCHAR(50) NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    amount DECIMAL,
    claim_type VARCHAR(50),
    date_submitted TIMESTAMP NOT NULL DEFAULT(current_timestamp),
    date_approved TIMESTAMP NOT NULL DEFAULT(current_timestamp)
);