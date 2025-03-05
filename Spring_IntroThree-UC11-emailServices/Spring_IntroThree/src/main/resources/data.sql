CREATE TABLE IF NOT EXISTS greeting (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    message VARCHAR(255) NOT NULL
);

INSERT INTO greeting (id, message) VALUES (1, 'Hello, Aarushi!');
INSERT INTO greeting (id, message) VALUES (2, 'Hello, Raj!');

