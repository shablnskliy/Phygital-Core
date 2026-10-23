CREATE TABLE teams (
                       id UUID PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       discipline VARCHAR(255) NOT NULL,
                       created_at TIMESTAMP NOT NULL,
                       updated_at TIMESTAMP
);

CREATE TABLE team_members (
                              id UUID PRIMARY KEY,
                              team_id UUID NOT NULL REFERENCES teams(id) ON DELETE CASCADE,
                              name VARCHAR(255) NOT NULL,
                              is_captain BOOLEAN DEFAULT FALSE
);