
# ☕ SQL Database: Coffee & Employee Tables

This SQL script sets up a simple database with two tables: `coffee` and `Emp`. It includes table creation and data insertion commands.

---

## 📁 Database: `test`

### 🔸 Table: `coffee`

Stores information about different coffee types and their prices.

#### 📌 Structure:
| Column Name  | Data Type       | Description                |
|--------------|------------------|----------------------------|
| `id`         | INT(5) AUTO_INCREMENT | Primary key, unique coffee ID |
| `coffee_name`| VARCHAR(100)     | Name of the coffee         |
| `priced`     | INT(5)           | Price of the coffee (₹)    |

#### 🧩 Sample Data:
```sql
INSERT INTO coffee VALUES (101, 'Febary', 120);
INSERT INTO coffee VALUES (102, 'Royal', 140);
INSERT INTO coffee VALUES (103, 'Diamond', 180);
```

---

### 🔸 Table: `Emp`

Stores employee information and their basic salary.

#### 📌 Structure:
| Column Name   | Data Type | Description                    |
|---------------|-----------|--------------------------------|
| `Emp_NO`      | INTEGER   | Primary key, unique employee ID|
| `Emp_Name`    | TEXT      | Name of the employee           |
| `Basicsalary` | INTEGER   | Basic salary (₹)               |

#### 🧩 Sample Data:
```sql
INSERT INTO Emp VALUES (101, 'Ramesh', 25000);
INSERT INTO Emp VALUES (102, 'Ravi', 20000);
```

> ⚠️ Note: The original insert statements used `EMPLOYEE` instead of `Emp`. Be sure to match table names correctly.

---

## ✅ Instructions to Run

1. Start your MySQL/MariaDB server.
2. Open a MySQL client or terminal.
3. Run the SQL script in this order:
```sql
USE test;

-- Create and populate `coffee` table
CREATE TABLE IF NOT EXISTS `coffee` (
  `id` INT(5) NOT NULL AUTO_INCREMENT,
  `coffee_name` VARCHAR(100) NOT NULL,
  `priced` INT(5),
  PRIMARY KEY (`id`)
);
INSERT INTO coffee VALUES (101, 'Febary', 120);
INSERT INTO coffee VALUES (102, 'Royal', 140);
INSERT INTO coffee VALUES (103, 'Diamond', 180);

-- Create and populate `Emp` table
CREATE TABLE Emp (
  Emp_NO INTEGER PRIMARY KEY,
  Emp_Name TEXT NOT NULL,
  Basicsalary INTEGER
);
INSERT INTO Emp VALUES (101, 'Ramesh', 25000);
INSERT INTO Emp VALUES (102, 'Ravi', 20000);
```

---

## 📌 License
This is a basic educational SQL setup – free to use for learning and practice.
