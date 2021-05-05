CREATE TABLE IF NOT EXISTS transactions
(
    tx_id      INT          NOT NULL AUTO_INCREMENT,
    tx_host    VARCHAR(100) NOT NULL,
    tx_user_ud INT          NOT NULL,
    tx_date    TIMESTAMP    NOT NULL,
    CONSTRAINT transaction_pk PRIMARY KEY (tx_id)
);
CREATE TABLE IF NOT EXISTS frequent_answer_questions
(
    id_faq     INT          NOT NULL AUTO_INCREMENT,
    question   VARCHAR(100) NOT NULL,
    answers    VARCHAR(100) NOT NULL,
    tx_id      INT          NOT NULL,
    tx_host    VARCHAR(100) NOT NULL,
    tx_user_ud INT          NOT NULL,
    tx_date    TIMESTAMP    NOT NULL,
    CONSTRAINT frequent_answer_questions_pk PRIMARY KEY (id_faq)
);