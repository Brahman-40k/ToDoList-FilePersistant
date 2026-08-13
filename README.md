# To-Do List Application (File Persistent)

A modular, command-line To-Do List application written in Java. It allows users to create, update, and manage tasks with local file persistence, ensuring tasks are saved between application sessions.

## 🚀 Features

- **Task Management**: Add, update, and track daily tasks efficiently.
- **Status Tracking**: Keep track of task states (e.g., Pending, In Progress, Completed).
- **File Persistence**: Automatically saves tasks to disk and reloads them on application startup.
- **Interactive CLI**: Simple text-based user interface for intuitive terminal navigation.
- **Clean Architecture**: Separated models, business logic, storage, and UI components.

## 🛠️ Prerequisites

- **Java JDK**: Java 11 or higher (JDK 17 recommended)
- **Apache Maven**: Version 3.6+

## 📁 Project Structure

```
ToDoList-FilePersistant/
├── src/
│   └── main/
│       └── java/
│           ├── Main.java          # Application entry point
│           ├── UserInterface.java # CLI interaction & menu system
│           ├── TaskManager.java   # Core task management operations
│           ├── TaskStorage.java   # File saving and loading operations
│           ├── Task.java          # Task data model
│           └── Status.java        # Task status enumeration
├── pom.xml                        # Maven build configuration
├── .gitignore                     # Git ignore rules
└── README.md                      # Project documentation
```

## ⚙️ Quick Start

### 1. Clone the Repository

```bash
git clone https://github.com/Brahman-40k/ToDoList-FilePersistant.git
cd ToDoList-FilePersistant
```

### 2. Build the Project

Build the project using Maven:

```bash
mvn clean package
```

### 3. Run the Application

Execute using Maven:

```bash
mvn exec:java -Dexec.mainClass="Main"
```

Or run the compiled JAR directly:

```bash
java -cp target/todo-list-1.0-SNAPSHOT.jar Main
```

## 📜 License

This project is available under the MIT License.
