CREATE TABLE admin_logs (
                            id UUID PRIMARY KEY,
                            date TIMESTAMP NOT NULL,
                            admin VARCHAR(255) NOT NULL,
                            action VARCHAR(100) NOT NULL,
                            entity_type VARCHAR(100) NOT NULL,
                            entity_id VARCHAR(100),
                            details TEXT
);