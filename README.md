
# **Calculator Project**

A simple Java Calculator project that supports basic arithmetic operations. The project also includes unit tests for verifying the correctness of its methods.

---

## **Features**

The Calculator includes the following functionalities:

1. **Basic Arithmetic Operations**:
   - Addition
   - Subtraction
   - Multiplication
   - Division (with error handling for division by zero)
   - Modulus
   - Exponentiation
   - Factorial

2. **Unit Testing**:
   - Test cases implemented using JUnit to ensure the reliability of all methods.

---

## **Project Structure**

```
Calculator/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Calculator.java   # Main Calculator class
│   │   │   ├── Main.java         # Entry point for testing the calculator manually
│   └── test/
│       └── java/
│           └── CalculatorTest.java   # JUnit test cases for the Calculator
├── pom.xml                        # Maven configuration file
└── README.md                      # Project documentation
```

---

## **Technologies Used**

- **Java**: Programming language used to implement the Calculator.
- **JUnit**: Framework for unit testing.
- **Maven**: Build and dependency management tool.

---

## **Getting Started**

### **1. Prerequisites**
- Java Development Kit (JDK 17 or higher)
- Apache Maven

---

### **2. Clone the Repository**
```bash
git clone <repository-url>
cd Calculator
```

---

### **3. Run the Project**
1. Compile the code:
   ```bash
   javac -d bin src/main/java/*.java
   ```
2. Run the main program:
   ```bash
   java -cp bin Main
   ```

---

### **4. Run Unit Tests**
To execute the JUnit test cases, use Maven:
```bash
mvn test
```

---

## **Future Improvements**
- Add advanced mathematical functions such as logarithms and trigonometric operations.
- Implement a GUI for the calculator.

---

## **Contributors**
- **Your Name**: Developer

---

## **License**
This project is licensed under the MIT License. See the `LICENSE` file for more details.
