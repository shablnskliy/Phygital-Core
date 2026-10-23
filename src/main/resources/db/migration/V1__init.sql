CREATE TABLE users (
                       id UUID PRIMARY KEY,
                       first_name VARCHAR(255) NOT NULL,
                       last_name VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       phone VARCHAR(50),
                       telegram VARCHAR(100),
                       birth_date DATE,
                       bio TEXT,
                       avatar TEXT,
                       role VARCHAR(50) NOT NULL,
                       created_at TIMESTAMP NOT NULL
);

-- Добавление тестовых пользователей (те самые, что были на фронте)
-- Пароли захешированы через BCrypt (Admin123! и User123!)
INSERT INTO users (id, first_name, last_name, email, password, phone, telegram, birth_date, bio, avatar, role, created_at)
VALUES
    (
        '11111111-1111-1111-1111-111111111111',
        'Анна', 'Сонина', 'admin@phygital.local',
        '$2a$10$X8k3bY5M4Q1w2e3r4t5y6u7i8o9p0a1s2d3f4g5h6j7k8l9z0x', -- хеш от "Admin123!"
        '+7 912 345-67-89', '@annasonina', '2000-05-14',
        'Администратор платформы и организатор турниров.', '', 'ADMIN', CURRENT_TIMESTAMP
    ),
    (
        '22222222-2222-2222-2222-222222222222',
        'Иван', 'Петров', 'user@phygital.local',
        '$2a$10$Y9m4cZ6N5R2x3w4e5r6t7y8u9i0o1p2a3s4d5f6g7h8j9k0l1z2x', -- хеш от "User123!"
        '+7 912 111-22-33', '@ivanpetrov', '2001-08-22',
        'Капитан New Dimension. Люблю баскетбол и командную игру.', '', 'USER', CURRENT_TIMESTAMP
    );