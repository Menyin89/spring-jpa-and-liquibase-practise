ALTER TABLE employees
ADD COLUMN department_id BIGINT NOT NULL REFERENCES departments(id);