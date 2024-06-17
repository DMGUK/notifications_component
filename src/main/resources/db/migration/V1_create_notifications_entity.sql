CREATE SEQUENCE IF NOT EXISTS notifications_seq INCREMENT BY 1;

CREATE TABLE notifications (
   id INT PRIMARY KEY CHECK (id > 0) NOT NULL DEFAULT NEXTVAL ('notifications_seq'),
   title VARCHAR(255),
   message TEXT,
   message_date DATE,
   message_type VARCHAR(255),
   user_id INT
);