CREATE TABLE IF NOT EXISTS medical_card
(
    id              BIGINT  NOT NULL    PRIMARY KEY,
    client_status   CHAR,
    med_status      CHAR,
    registry_dt     DATE,
    comment         TEXT
);

CREATE TABLE IF NOT EXISTS contact
(
    id              BIGINT          NOT NULL    PRIMARY KEY,
    phone_number    VARCHAR(32)     NOT NULL,
    email           VARCHAR(128),
    profile_link    TEXT
);

CREATE TABLE IF NOT EXISTS person_data
(
    id              BIGINT          NOT NULL    PRIMARY KEY,
    last_name       VARCHAR(255)    NOT NULL,
    first_name      VARCHAR(255)    NOT NULL,
    birth_dt        DATE            NOT NULL,
    age             SMALLINT,
    sex             CHAR            NOT NULL,
    contact_id      BIGINT          NOT NULL        REFERENCES contact (id),
    medical_card_id BIGINT          NOT NULL        REFERENCES medical_card (id),
    parent_id       BIGINT  CHECK (parent_id <> id) REFERENCES person_data (id)
);

CREATE TABLE IF NOT EXISTS illness
(
    id              BIGINT      NOT NULL    PRIMARY KEY,
    medical_card_id BIGINT      NOT NULL    REFERENCES medical_card (id),
    type_id         BIGINT,
    heaviness       CHAR,
    appearance_dttm TIMESTAMP   NOT NULL,
    recovery_dt     DATE
);

CREATE TABLE IF NOT EXISTS address
(
    id          BIGINT          NOT NULL    PRIMARY KEY,
    contact_id  BIGINT          NOT NULL    REFERENCES contact (id),
    country_id  BIGINT          NOT NULL,
    city        VARCHAR(255)    NOT NULL,
    index       INT,
    street      VARCHAR(255)    NOT NULL,
    building    VARCHAR(32)     NOT NULL,
    flat        VARCHAR(32)
);

