<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>Student Management System</h1>

<p>This is a simple Student Management System built using Java, Hibernate, and MySQL. It allows users to perform CRUD operations (Create, Read, Update, Delete) on student records.</p>

<h2>Features</h2>
<ul>
    <li>Insert new student data</li>
    <li>Update existing student data</li>
    <li>Delete student data</li>
    <li>Display all student records</li>
    <li>Display a single student record</li>
</ul>

<h2>Technologies Used</h2>
<ul>
    <li>Java</li>
    <li>Hibernate</li>
    <li>MySQL</li>
    <li>JDBC</li>
</ul>

<h2>Installation</h2>
<pre><code>git clone https://github.com/yourusername/student-management-system.git
cd student-management-system
// Set up your database and update hibernate.cfg.xml as needed.
</code></pre>

<h2>Configuration</h2>
<p>Update the <code>hibernate.cfg.xml</code> file to configure your database connection settings.</p>

<h2>How to Run</h2>
<pre><code>javac -cp ".:lib/*" com/controller/Student_Controller.java
java -cp ".:lib/*" com.controller.Student_Controller
</code></pre>

<h2>Usage</h2>
<p>Follow the on-screen menu to perform operations on student records.</p>

</body>
</html>
