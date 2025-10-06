-- Install uuid-ossp
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE LOG_RECORD (
    id UUID PRIMARY KEY NOT NULL,
    solution VARCHAR(50) NOT NULL,
    application VARCHAR(50) NOT NULL,
    type_log VARCHAR(50) NOT NULL,
    title VARCHAR(50) NOT NULL,
    path VARCHAR(50) NOT NULL,
    message VARCHAR(500) NOT NULL,
    timestamp TIMESTAMP NOT NULL
);