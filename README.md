# 📊✨ AlgoTracker  
### 🚀 Algorithm Performance Analyzer (Java)

<p align="center">
  <b>Modular • OOP-Driven • Performance-Oriented • Resume-Ready</b>
</p>

---

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-red?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Architecture-Modular-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/OOP-Principles-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Focus-Data%20Structures-orange?style=for-the-badge" />
</p>

---

## 🌟 About The Project

**AlgoTracker** is a modular Java console application designed to execute, compare, and analyze the performance of various algorithms including:

- Sorting Algorithms
- Searching Algorithms
- Graph Algorithms

This project demonstrates strong **Object-Oriented Programming (OOP)** principles, clean architecture, and a practical understanding of **Data Structures & Algorithms**.

---

# 🚀 Features

## 👤 Authentication System
- 🔐 User Registration
- 🔑 Login System
- 📂 Result Export Support

---

## 🔄 Sorting Algorithms
- Bubble Sort
- Selection Sort
- Merge Sort
- Quick Sort

---

## 🔍 Searching Algorithms
- Linear Search
- Binary Search

---

## 🌐 Graph Algorithms
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

---

## 🧪 Performance Analysis
- Automatic Test Data Generation
- Runtime Measurement using `System.nanoTime()`
- Execution Time Comparison
- Result Management System

---

# 🏗️ Project Architecture

```
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
```

---

# 🔹 Separation of Concerns

✔ UI Layer → Handles user interaction  
✔ Auth Module → Manages login & registration  
✔ Algorithm Module → Contains all algorithm implementations  
✔ Performance Module → Measures execution time  
✔ Data Module → Generates test inputs  
✔ Result Module → Stores and displays results  

This ensures clean, maintainable, and scalable code.

---

# 🧠 OOP Concepts Implemented

✅ Encapsulation  
✅ Abstraction (Algorithm Interface)  
✅ Polymorphism  
✅ Modular Design  
✅ Interface-Based Programming  

---

# ⚙️ How The Application Works

1️⃣ Application starts from `Main.java`  
2️⃣ User registers or logs in  
3️⃣ User selects an algorithm  
4️⃣ Test data is generated automatically  
5️⃣ Selected algorithm executes  
6️⃣ Execution time is recorded  
7️⃣ Results are displayed and stored  

---

# 📈 Performance Measurement

Execution time is measured using:

```java
long start = System.nanoTime();
algorithm.execute();
long end = System.nanoTime();
```

This allows precise runtime comparison between algorithms.

---

# 🛠️ Technologies Used

- Java
- Object-Oriented Programming
- Console-Based UI
- Data Structures & Algorithms

---

# 💡 Purpose of the Project

This project was built to:

✔ Practically understand time complexity  
✔ Compare algorithm efficiency  
✔ Apply OOP concepts in a structured system  
✔ Build a strong resume-level Java project  

---

# 🔮 Future Improvements

✨ GUI Version (Java Swing / JavaFX)  
✨ Database Integration (MySQL)  
✨ Export results to CSV  
✨ Graphical performance visualization  
✨ Multi-threaded execution support  

---

# ▶️ How To Run

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/AlgoTracker.git
```

### 2️⃣ Open in IDE
- IntelliJ IDEA
- Eclipse
- VS Code (with Java extensions)

### 3️⃣ Run
Execute:

```
Main.java
```

---

# 👨‍💻 Author

### 💙 Aditya Kanwar  
Java & Data Structures Enthusiast  

---

<p align="center">
  ⭐ If you found this project useful, consider giving it a star!
</p>
