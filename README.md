# Mini Hospital Emergency System

A console-based **Mini Hospital Emergency System** developed in Java to demonstrate the practical use of fundamental data structures such as **Binary Search Trees, Queues, Stacks, and Linked Lists**.

The system allows hospital staff to register and manage patients, handle emergency patients, record treatments, and maintain patient visit history.

---

## 📌 Project Overview

The **Mini Hospital Emergency System** is a Java console application designed to simulate basic hospital management operations.

The project demonstrates how different data structures can be applied to solve real-world problems:

* **Binary Search Tree (BST)** → Patient registration, searching, deletion, and sorted display
* **Queue** → Emergency patient waiting list
* **Stack** → Treatment history
* **Linked List** → Patient visit history

The application provides a menu-driven interface through which users can perform these operations.

---

## 🎯 Objectives

The main objectives of this project are:

1. To implement fundamental data structures using Java.
2. To understand how data structures can be applied to real-world systems.
3. To manage patient information efficiently.
4. To implement searching, insertion, deletion, and traversal operations.
5. To demonstrate FIFO and LIFO concepts.
6. To maintain patient treatment and visit records.
7. To create a simple console-based hospital management system.

---

## ✨ Features

### 1. Patient Management

The system provides the following patient management operations:

* Register a new patient
* Search for a patient using Patient ID
* Delete a patient
* Display all registered patients

Patient information includes:

* Patient ID
* Patient Name
* Age
* Contact Number
* Medical Condition

Patient records are stored using a **Binary Search Tree**.

---

### 2. Emergency Patient Management

Emergency patients are managed using a **Queue**.

Available operations:

* Add an emergency patient
* Treat the next patient
* Display waiting patients

The queue follows the:

> **FIFO — First In, First Out**

principle.

The patient who enters the emergency queue first is treated first.

---

### 3. Treatment Management

Treatment records are managed using a **Stack**.

Available operations:

* Add a treatment record
* Remove the last treatment record
* Display treatment history

The stack follows the:

> **LIFO — Last In, First Out**

principle.

The most recently added treatment record is removed first.

---

### 4. Patient Visit History

Patient visit records are maintained using a **Linked List**.

Available operations:

* Add a patient visit
* Search for a visit
* Remove a visit
* Display visit history

Each visit contains:

* Visit ID
* Visit Date
* Doctor Name
* Diagnosis
* Treatment

---

## 🧱 Data Structures Used

| Data Structure     | Implementation   | Purpose                           |
| ------------------ | ---------------- | --------------------------------- |
| Binary Search Tree | `PatientBST`     | Store and manage patients         |
| Queue              | `EmergencyQueue` | Manage emergency waiting patients |
| Stack              | `TreatmentStack` | Store treatment history           |
| Linked List        | `VisitHistory`   | Store patient visit history       |

---

## 📂 Project Structure

```text
MiniHospitalEmergencySystem/
│
├── src/
│   ├── module-info.java
│   │
│   └── hospital/
│       ├── Patient.java
│       ├── PatientBST.java
│       ├── EmergencyQueue.java
│       ├── TreatmentRecord.java
│       ├── TreatmentStack.java
│       ├── Visit.java
│       ├── VisitHistory.java
│       ├── HospitalSystem.java
│       └── TestHospitalSystem.java
│
├── .classpath
├── .project
└── README.md
```

---

## 📄 Class Description

### `Patient.java`

Represents a hospital patient.

Stores:

```text
Patient ID
Patient Name
Age
Contact Number
Medical Condition
```

---

### `PatientBST.java`

Implements a **Binary Search Tree** for patient records.

Main operations:

```java
insert()
search()
delete()
displayInOrder()
```

The Patient ID is used as the BST key.

---

### `EmergencyQueue.java`

Implements a queue for emergency patients.

Main operations:

```java
enqueue()
dequeue()
display()
```

The queue ensures that patients are treated in the order they arrive.

---

### `TreatmentRecord.java`

Represents an individual treatment record.

Stores:

```text
Patient ID
Patient Name
Treatment
Doctor Name
```

---

### `TreatmentStack.java`

Implements a stack for treatment records.

Main operations:

```java
push()
pop()
display()
```

The latest treatment record is removed first.

---

### `Visit.java`

Represents a patient's hospital visit.

Stores:

```text
Visit ID
Visit Date
Doctor Name
Diagnosis
Treatment
```

---

### `VisitHistory.java`

Implements a linked list for patient visit records.

Main operations:

```java
addVisit()
searchVisit()
removeVisit()
displayHistory()
```

---

### `HospitalSystem.java`

Contains the main application and console menu.

The main menu provides:

```text
1.  Register Patient
2.  Search Patient
3.  Delete Patient
4.  Display Patients

5.  Add Emergency Patient
6.  Treat Next Patient
7.  Display Waiting Queue

8.  Add Treatment Record
9.  Remove Last Treatment
10. Display Treatment History

11. Add Patient Visit
12. Search Visit
13. Remove Visit
14. Display Visit History

0. Exit
```

---

### `TestHospitalSystem.java`

A separate test program used to verify the main data structures and operations.

It tests:

* Patient BST
* Emergency Queue
* Treatment Stack
* Visit History

The test program displays `PASS` or `FAIL` messages where appropriate.

---

## ⚙️ Requirements

To run this project, you need:

* Java JDK 8 or later
* Java-compatible IDE such as:

  * Eclipse
  * IntelliJ IDEA
  * Visual Studio Code
* Git (optional, for version control)

---

## 🚀 How to Run

### Method 1 — Using Eclipse

1. Open **Eclipse**.
2. Select:

```text
File → Import → Existing Projects into Workspace
```

3. Select the project folder.
4. Click **Finish**.
5. Locate:

```text
src/hospital/HospitalSystem.java
```

6. Right-click the file.
7. Select:

```text
Run As → Java Application
```

The hospital system menu will appear in the console.

---

### Method 2 — Using Command Line

Navigate to the source directory:

```bash
cd MiniHospitalEmergencySystem/src
```

Compile the Java files:

```bash
javac hospital/*.java
```

Run the application:

```bash
java hospital.HospitalSystem
```

---

## 🧪 Running the Tests

The project includes:

```text
TestHospitalSystem.java
```

To run the test program:

```bash
cd MiniHospitalEmergencySystem/src
javac hospital/*.java
java hospital.TestHospitalSystem
```

The test program checks the functionality of:

```text
Patient BST
Emergency Queue
Treatment Stack
Visit History
```

At the end, it displays:

```text
========================================
       ALL TESTS COMPLETED
========================================
```

---

## 💻 Example Usage

### Register a Patient

Select:

```text
1
```

Enter:

```text
Patient ID: 101
Patient Name: Nimal
Age: 30
Contact Number: 0722222222
Medical Condition: Headache
```

The system displays:

```text
Patient registered successfully.
```

---

### Search for a Patient

Select:

```text
2
```

Enter:

```text
Enter Patient ID: 101
```

The system displays the patient's information.

---

### Add an Emergency Patient

Select:

```text
5
```

The patient is added to the emergency queue.

---

### Treat the Next Patient

Select:

```text
6
```

The first patient in the emergency queue is removed and treated.

---

### Add a Treatment Record

Select:

```text
8
```

A new treatment record is added to the treatment stack.

---

### Remove the Last Treatment

Select:

```text
9
```

The most recently added treatment record is removed.

---

### Add a Patient Visit

Select:

```text
11
```

A new visit is added to the patient's visit history.

---

## 🔄 Data Structure Concepts

### Binary Search Tree

Patients are organized according to their Patient ID.

```text
             105
            /   \
          101   110
         /
        99
```

Searching can move left or right depending on the Patient ID.

---

### Queue

Emergency patients follow FIFO order:

```text
Front
  ↓
[Patient A] → [Patient B] → [Patient C]
                                  ↑
                                Rear
```

Patient A will be treated first.

---

### Stack

Treatment records follow LIFO order:

```text
       TOP
        ↓
 [Treatment C]
 [Treatment B]
 [Treatment A]
```

Treatment C is removed first.

---

### Linked List

Patient visits are connected sequentially:

```text
[Visit 1] → [Visit 2] → [Visit 3] → null
```

Each node contains one visit and a reference to the next node.

---

## ⏱️ Time Complexity

| Operation             | Data Structure | Average / Typical Complexity |
| --------------------- | -------------- | ---------------------------: |
| Insert Patient        | BST            |             O(log n) average |
| Search Patient        | BST            |             O(log n) average |
| Delete Patient        | BST            |             O(log n) average |
| Display Patients      | BST            |                         O(n) |
| Add Emergency Patient | Queue          |                         O(1) |
| Treat Patient         | Queue          |                         O(1) |
| Add Treatment         | Stack          |                         O(1) |
| Remove Treatment      | Stack          |                         O(1) |
| Add Visit             | Linked List    |                         O(n) |
| Search Visit          | Linked List    |                         O(n) |
| Remove Visit          | Linked List    |                         O(n) |
| Display Visits        | Linked List    |                         O(n) |

> Note: A normal Binary Search Tree can become unbalanced, resulting in O(n) worst-case performance for insertion, search, and deletion.

---

## 🧩 Design Approach

The system separates each data structure into its own Java class.

This provides:

* Better organization
* Easier testing
* Improved readability
* Reusability
* Separation of responsibilities

The `HospitalSystem` class acts as the main controller and connects the different data structures through the console menu.

---

## 🔐 Current Limitations

This project is intended as an educational console application.

It currently does not include:

* Database storage
* User authentication
* Graphical user interface
* Online/cloud functionality
* Automatic backup
* Advanced medical reporting
* Multi-user support

Data is stored only while the application is running.

---

## 🔮 Future Improvements

Possible future improvements include:

1. Add a database such as MySQL.
2. Add a graphical user interface.
3. Add login and authentication.
4. Add doctor management.
5. Add appointment scheduling.
6. Add room/bed management.
7. Add billing functionality.
8. Add persistent patient records.
9. Replace the normal BST with a balanced tree such as AVL Tree.
10. Add JUnit automated tests.
11. Add input validation and error handling.
12. Generate patient reports.

---

## 📚 Learning Outcomes

After completing this project, the following concepts can be demonstrated:

* Java classes and objects
* Encapsulation
* Constructors
* Getters
* Method overriding
* Recursion
* Binary Search Trees
* Queues
* Stacks
* Linked Lists
* Searching
* Insertion
* Deletion
* Tree traversal
* FIFO
* LIFO
* Console-based application development
* Basic software testing
* Git version control

---

## 🌳 Git Commit Strategy

The project was developed incrementally using meaningful commits.

Each file can be developed through two commits:

### First Commit

Create the basic structure of the class.

Example:

```bash
git add Patient.java
git commit -m "Create Patient model class"
```

### Second Commit

Add or improve the functionality.

Example:

```bash
git add Patient.java
git commit -m "Add patient accessors and display method"
```

Example commit progression:

```text
Create Patient model class
Add patient accessors and display method

Create Patient BST structure
Implement patient insertion and search

Add BST deletion functionality
Add in-order patient display

Create emergency queue structure
Implement enqueue and dequeue operations

Create treatment record model
Implement treatment stack operations

Create visit model
Implement visit history linked list

Create hospital system menu
Connect hospital operations

Add hospital system test program
Test all data structures
```

---

## 👨‍💻 Author

**Mini Hospital Emergency System**

Developed as a Java data structures project demonstrating the practical application of fundamental data structures in a hospital emergency management scenario.

---

## 📜 License

This project is intended for **educational and academic purposes**.

You are free to modify and extend the project for learning purposes.

---

## ⭐ Conclusion

The **Mini Hospital Emergency System** demonstrates how fundamental data structures can be combined to build a practical application.

By using:

```text
Binary Search Tree → Patient Management
Queue             → Emergency Management
Stack             → Treatment History
Linked List       → Visit History
```

the project provides a simple but effective demonstration of data structure implementation in Java.
