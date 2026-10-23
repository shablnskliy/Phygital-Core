CREATE TABLE tournaments (
                             id UUID PRIMARY KEY,
                             public_number VARCHAR(50),
                             name VARCHAR(255) NOT NULL,
                             discipline VARCHAR(100) NOT NULL,
                             format VARCHAR(100),
                             city VARCHAR(100),
                             venue VARCHAR(255),
                             short_description TEXT,
                             description TEXT,
                             start_at TIMESTAMP NOT NULL,
                             end_at TIMESTAMP NOT NULL,
                             registration_ends_at TIMESTAMP NOT NULL,
                             image_name VARCHAR(255),
                             image_url TEXT,
                             created_at TIMESTAMP NOT NULL,
                             updated_at TIMESTAMP
);

CREATE TABLE tournament_rules (
                                  tournament_id UUID NOT NULL REFERENCES tournaments(id) ON DELETE CASCADE,
                                  rule VARCHAR(500)
);