CREATE TABLE tournament_applications (
                                         id UUID PRIMARY KEY,
                                         team_id UUID NOT NULL,
                                         tournament_id UUID NOT NULL,
                                         captain_name VARCHAR(255) NOT NULL,
                                         additional_info TEXT,
                                         status VARCHAR(50) NOT NULL DEFAULT 'NEW',
                                         created_at TIMESTAMP NOT NULL
);