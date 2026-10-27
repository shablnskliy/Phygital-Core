# Phygital Core - Backend (Java Spring Boot)

Бэкенд-часть платформы для проведения фиджитал-турниров.

## 🛠 Стек технологий
*   **Java 21** / **Spring Boot 3**
*   **PostgreSQL** (База данных)
*   **Flyway** (Миграции БД)
*   **Spring Security + JWT** (Авторизация)
*   **Swagger / OpenAPI** (Документация)
*   **Docker** (Контейнеризация)

## 🚀 Как запустить проект

### Вариант 1: Через Docker (Рекомендуемый)
Убедитесь, что у вас установлен Docker Desktop.
1. Откройте терминал в корне проекта.
2. Выполните команду: `docker-compose up -d --build`
3. Бэкенд будет доступен по адресу: `http://localhost:8080`

### Вариант 2: Локальный запуск (Java + PostgreSQL)
1. Создайте базу данных в PostgreSQL с именем `phygital_db`.
2. В файле `src/main/resources/application.yml` укажите свой логин и пароль от PostgreSQL.
3. Запустите класс `PhygitalCoreApplication` в IntelliJ IDEA.

## 📚 Документация API (Swagger)
После запуска проекта интерактивная документация доступна по ссылке:
👉 `http://localhost:8080/swagger-ui/index.html`

## 📂 Структура базы данных (Flyway)
Все таблицы создаются автоматически при запуске. Миграции лежат в `src/main/resources/db/migration`:
*   `V1` - Пользователи (users)
*   `V2` - Команды (teams, team_members)
*   `V3` - Турниры (tournaments, tournament_rules)
*   `V4` - Привязка юзеров к командам
*   `V5` - Логи администратора (admin_logs)
*   `V6` - Обратная связь (feedback)
*   `V7` - Заявки на турниры (tournament_applications)

## 🔑 Переменные окружения
Для работы JWT используется секретный ключ (указан в `application.yml`).
При деплое на продакшн он должен передаваться через переменные окружения `JWT_SECRET`.