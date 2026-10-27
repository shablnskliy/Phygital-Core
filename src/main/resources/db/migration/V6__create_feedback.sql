CREATE TABLE feedback (
                          id UUID PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          email VARCHAR(255),
                          topic VARCHAR(255) NOT NULL,
                          message TEXT NOT NULL,
                          status VARCHAR(50) NOT NULL DEFAULT 'new',
                          viewed_at TIMESTAMP,
                          created_at TIMESTAMP NOT NULL,
                          updated_at TIMESTAMP
);