DROP TABLE tasks IF EXISTS;
DROP TABLE workers IF EXISTS;
DROP TABLE worklogs IF EXISTS;


CREATE TABLE tasks (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(100)
);


CREATE TABLE workers (
  id   INTEGER IDENTITY PRIMARY KEY,
  user_name VARCHAR(80)
);
CREATE INDEX workers_user_name ON workers (user_name);
CREATE UNIQUE INDEX uk_user_name ON workers (user_name);

CREATE TABLE worklogs (
  id         INTEGER IDENTITY PRIMARY KEY,
  worker_id INTEGER NOT NULL,
  task_id INTEGER NOT NULL,
  day DATE NOT NULL,
  from_time TIME NOT NULL,
  to_time TIME NOT NULL,
  description VARCHAR(250)
);
ALTER TABLE worklogs ADD CONSTRAINT fk_worklogs_workers FOREIGN KEY (worker_id) REFERENCES workers (id);
ALTER TABLE worklogs ADD CONSTRAINT fk_worklogs_tasks FOREIGN KEY (task_id) REFERENCES tasks (id);

