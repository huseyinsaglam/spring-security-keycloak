INSERT INTO user (first_name, last_name, email, username, password) VALUES
('Huseyin', 'Saglam','hsaglam@gmail.com','hsaglam','$2a$10$5sW2HYS7jwi.kebCkk.Qi.q9tLE3aYO56eiaUsFzFbuSrEh6i494W'), -- huseyin123
('Merve', 'Kartal','mkartal@gmail.com','mkartal','$2a$10$CVrFva5TiibwSbx0EC9CXOB1G0i5/XWtBCikkcCJjQ1wrXHuHX22.'), -- merve123
('Sebahattin', 'Guclu','sguclu@gmail.com','sguclu','$2a$10$DSPv4yEAZBHNu8RCE6bT9.pmFEaMFfnsUggmUfoYhOMIKewNgkwn.'); -- sebahattin123

INSERT INTO roles (role, user_id) VALUES
('DIRECTOR', 1),
('PROFESSOR', 2),
('STUDENT', 3);
