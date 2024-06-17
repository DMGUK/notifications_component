CREATE SEQUENCE IF NOT EXISTS user_settings_seq INCREMENT BY 1;

CREATE TABLE user_settings (
    id INT PRIMARY KEY CHECK (id > 0) NOT NULL DEFAULT NEXTVAL ('user_settings_seq'),
    notification_turned_on BOOLEAN
);