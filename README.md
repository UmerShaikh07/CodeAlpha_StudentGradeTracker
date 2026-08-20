

# Student Grade Tracker GUI

A Java Swing-based desktop application designed to manage student records and track academic performance. The application allows users to enter student information, record marks for three subjects, automatically calculate averages and grades, and display pass/fail status through an easy-to-use graphical interface.

## 📌 Project Overview

The **Student Grade Tracker GUI** is developed using Java and Swing. It provides a simple and interactive way to manage student grades without using the command line.

Users can add multiple students, enter their marks, view calculated results in a table, and generate an overall class performance summary.

## ✨ Features

* 👨‍🎓 Add multiple student records
* 📝 Enter marks for three subjects
* 🧮 Automatically calculate average marks
* 🏆 Automatically assign grades
* ✅ Display PASS or FAIL status
* 📊 Display student records in a table
* 🧹 Clear input fields
* 📋 Generate class performance summary
* 🥇 Find the highest-performing student
* 📉 Find the lowest-performing student
* 📈 Calculate overall class average
* 🔢 Count passed and failed students
* ⚠️ Validate user input
* 🎨 Clean and colorful graphical interface

## 🛠️ Technologies Used

* **Java**
* **Java Swing**
* **JFrame**
* **JPanel**
* **JButton**
* **JTextField**
* **JTable**
* **JOptionPane**
* **ArrayList**
* **Object-Oriented Programming**
* **NetBeans IDE**

## 📂 Project Structure

```text
StudentGradeTrackerGui/
│
├── StudentGradeTrackerGui.java
└── Student.java
```

### StudentGradeTrackerGui.java

This is the main GUI class. It creates the application window, input fields, buttons, student table, validation system, and summary functionality.

### Student.java

This class stores student information such as name and subject marks. It also calculates the student's average, grade, and pass/fail status.

## 🎯 How the Application Works

1. Launch the application.
2. Enter the student's name.
3. Enter marks for Subject 1.
4. Enter marks for Subject 2.
5. Enter marks for Subject 3.
6. Click **ADD STUDENT**.
7. The application calculates the average automatically.
8. The grade and status are displayed in the student table.
9. Add additional students if required.
10. Click **SHOW SUMMARY** to view the overall class performance.

## 📊 Example

Suppose a student has the following marks:

```text
Student Name: Ali
Subject 1: 85
Subject 2: 90
Subject 3: 80
```

The application calculates:

```text
Average: 85.00
Grade: A
Status: PASS
```

The student record is then displayed in the table.

## ⚠️ Input Validation

The application validates user input before adding a student.

It checks that:

* Student name is not empty.
* All subject marks are entered.
* Marks contain valid numerical values.
* Marks are between **0 and 100**.
* Invalid input displays an appropriate error message.

## 📋 Student Records Table

The application displays student information in the following format:

| Student Name | Subject 1 | Subject 2 | Subject 3 | Average | Grade | Status |
| ------------ | --------: | --------: | --------: | ------: | ----- | ------ |
| Ali          |        85 |        90 |        80 |   85.00 | A     | PASS   |
| Ahmed        |        70 |        75 |        68 |   71.00 | B     | PASS   |

## 📈 Class Summary

The **SHOW SUMMARY** button provides overall class statistics, including:

* Total number of students
* Class average
* Highest average
* Top-performing student
* Lowest average
* Lowest-performing student
* Number of passed students
* Number of failed students

## 🖥️ How to Run the Project

### Requirements

Before running the project, make sure you have:

* Java JDK installed
* NetBeans IDE installed

### Steps

1. Open **NetBeans IDE**.
2. Create or open the Java project.
3. Make sure the package name is:

```java
StudentGradeTrackerGui
```

4. Add both Java files to the same package:

```text
StudentGradeTrackerGui.java
Student.java
```

5. Right-click the project.
6. Select **Clean and Build**.
7. Right-click the project again.
8. Select **Run**.
9. The Student Grade Tracker window will open.

## 🎨 GUI Design

The application uses a simple color-themed interface with:

* Dark blue header
* Green Add Student button
* Orange Clear button
* Blue Summary button
* White input cards
* Student records table
* Input validation messages

## 📚 Learning Objectives

This project demonstrates practical use of:

* Java fundamentals
* Classes and objects
* Encapsulation
* ArrayList
* Methods
* Exception handling
* Event handling
* Java Swing GUI development
* JTable and table models
* Input validation
* Basic data processing

## 🚀 Future Improvements

Possible future improvements include:

* Save student records to a file
* Load previously saved records
* Edit student records
* Delete student records
* Search for students
* Add more subjects
* Export results to PDF or Excel
* Add login functionality
* Connect the application to a database

## 👨‍💻 Author

**Umer Shaikh**

Java Development Intern
CodeAlpha Internship Project

## 📄 License

This project is created for **educational and internship purposes**. You are welcome to study, modify, and improve the project.
