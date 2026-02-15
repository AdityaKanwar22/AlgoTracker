📊 AlgoTracker – Algorithm Performance Analyzer (Java)

AlgoTracker is a modular Java console application designed to execute, compare, and analyze the performance of various algorithms including sorting, searching, and graph algorithms.

This project demonstrates strong Object-Oriented Programming (OOP) principles, clean architecture, and practical understanding of Data Structures and Algorithms.

🚀 Features

👤 User Registration & Login System

🔄 Sorting Algorithms

Bubble Sort

Selection Sort

Merge Sort

Quick Sort

🔍 Searching Algorithms

Linear Search

Binary Search

🌐 Graph Algorithms

Breadth-First Search (BFS)

Depth-First Search (DFS)

🧪 Automatic Test Data Generation

📈 Performance Tracking using System.nanoTime()

📂 Result Management System

🏗️ Project Architecture

The project follows a clean modular package structure:

com.algorithmtracker
│
├── Main.java
│
├── ui/
│   └── ConsoleUI.java
│
├── auth/
│   ├── User.java
│   ├── UserManager.java
│   └── UserExporter.java
│
├── algorithm/
│   ├── Algorithm.java
│   ├── SortingAlgorithms.java
│   ├── SearchingAlgorithms.java
│   └── GraphAlgorithms.java
│
├── performance/
│   └── PerformanceTracker.java
│
├── data/
│   └── TestDataGenerator.java
│
└── result/
    └── ResultManager.java

🔹 Separation of Concerns

UI Layer → Handles user interaction

Auth Module → Manages user login & registration

Algorithm Module → Contains all algorithm implementations

Performance Module → Measures execution time

Data Module → Generates test inputs

Result Module → Stores and displays results

🧠 OOP Concepts Implemented

✅ Encapsulation

✅ Abstraction (Algorithm interface)

✅ Polymorphism

✅ Modular Design

✅ Interface-based Programming

⚙️ How the Application Works

The application starts from Main.java

User registers or logs in

User selects an algorithm

Test data is generated automatically

Selected algorithm executes

Execution time is recorded

Results are displayed and stored

📈 Performance Measurement

Execution time is measured using:

long start = System.nanoTime();
algorithm.execute();
long end = System.nanoTime();


This allows comparison between different algorithms based on runtime performance.

🛠️ Technologies Used

Java

Object-Oriented Programming

Console-Based UI

Data Structures & Algorithms

💡 Purpose of the Project

This project was built to:

Practically understand time complexity

Compare algorithm efficiency

Apply OOP concepts in a structured system

Build a resume-level Java project

🔮 Future Improvements

GUI Version (Java Swing / JavaFX)

Database Integration (MySQL)

Export results to CSV

Graphical performance visualization

Multi-threaded execution support

▶️ How to Run

Clone the repository:

git clone https://github.com/your-username/AlgoTracker.git


Open in IntelliJ / Eclipse

Run Main.java

📌 Author

Your Name
Java & Data Structures Enthusiast
