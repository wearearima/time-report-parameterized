INSERT INTO workers VALUES (1, 'JESSI');
INSERT INTO workers VALUES (2, 'FERNANDO');
INSERT INTO workers VALUES (3, 'URKO');
INSERT INTO workers VALUES (4, 'TELLE');
INSERT INTO workers VALUES (5, 'JAGOBA');

INSERT INTO tasks VALUES (1, 'Daily meeting');
INSERT INTO tasks VALUES (2, 'Holidays');
INSERT INTO tasks VALUES (3, 'Implement the use case Create report for user and day');
INSERT INTO tasks VALUES (4, 'Implement the use case Create report for user and month');
INSERT INTO tasks VALUES (5, 'Implement the use case Create report for month');




INSERT INTO worklogs (id, worker_id, task_id, day, from_time, to_time, description) VALUES (1, 1, 2, '2020-05-01', '08:30:00', '16:30:00', 'Holidays' );
INSERT INTO worklogs (id, worker_id, task_id, day, from_time, to_time, description) VALUES (2, 2, 2, '2020-05-01', '08:30:00', '16:30:00', 'Holidays' );
INSERT INTO worklogs (id, worker_id, task_id, day, from_time, to_time, description) VALUES (3, 3, 2, '2020-05-01', '08:30:00', '16:30:00', 'Holidays' );
INSERT INTO worklogs (id, worker_id, task_id, day, from_time, to_time, description) VALUES (4, 1, 1, '2020-05-05', '08:30:00', '09:30:00', 'Daily meeting' );
INSERT INTO worklogs (id, worker_id, task_id, day, from_time, to_time, description) VALUES (5, 2, 1, '2020-05-05', '08:30:00', '09:30:00', 'Daily meeting' );
INSERT INTO worklogs (id, worker_id, task_id, day, from_time, to_time, description) VALUES (6, 3, 1, '2020-05-05', '08:30:00', '09:30:00', 'Daily meeting' );
INSERT INTO worklogs (id, worker_id, task_id, day, from_time, to_time, description) VALUES (7, 4, 1, '2020-05-05', '08:30:00', '09:30:00', 'Daily meeting' );
INSERT INTO worklogs (id, worker_id, task_id, day, from_time, to_time, description) VALUES (8, 1, 3, '2020-05-05', '09:30:00', '16:30:00', 'Create database and queries' );
INSERT INTO worklogs (id, worker_id, task_id, day, from_time, to_time, description) VALUES (9, 1, 3, '2020-05-05', '08:30:00', '11:00:00', 'Create de frontend form for selecting user and date' );
