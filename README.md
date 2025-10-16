

# 🧪 Selenium TestNG Login Automation with ExtentReports

This project automates login functionality testing using **Selenium WebDriver**, **TestNG**, and **ExtentReports**.
It includes **positive** and **negative** test cases for verifying a sample login page at
👉 [Practice Test Automation](https://practicetestautomation.com/practice-test-login/).

---

## 📁 Project Structure

```
SeleniumTestNGProject/
├── pom.xml
└── src/
    └── test/
        └── java/
            └── testnglogin/
                └── logindashboard.java
```

---

## 🚀 Features

* ✅ **Automated login tests** (Positive & Negative scenarios)
* 🧩 **TestNG framework integration**
* 📊 **ExtentReports** for detailed HTML test reporting
* 🌐 **Selenium WebDriver (ChromeDriver)** setup
* 💡 **Assertions** for validation of title, URL, and error messages

---

## 🧰 Tools & Technologies

| Tool                   | Purpose               |
| ---------------------- | --------------------- |
| **Java**               | Programming language  |
| **Selenium WebDriver** | Browser automation    |
| **TestNG**             | Testing framework     |
| **ExtentReports**      | Test reporting        |
| **Maven**              | Dependency management |

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/SeleniumTestNGLoginAutomation.git
cd SeleniumTestNGLoginAutomation
```

### 2. Install Dependencies

Make sure **Maven** is installed, then run:

```bash
mvn clean install
```

### 3. Update the Report Path

In `logindashboard.java`, update the report file path as per your system:

```java
String reportPath = "G:\\chaitanya\\ExtentReport.html";
```

Example (for macOS/Linux):

```java
String reportPath = "/Users/username/Reports/ExtentReport.html";
```

### 4. Run the Tests

You can run tests directly from **Eclipse/IntelliJ**, or use Maven:

```bash
mvn test
```

---

## 🧪 Test Cases Overview

| Test Name                  | Description                                 | Expected Result           |
| -------------------------- | ------------------------------------------- | ------------------------- |
| **Open Website Test**      | Opens the login page and verifies the title | Page title matches        |
| **Positive Login Test**    | Logs in with valid credentials              | Redirects to success page |
| **Negative Username Test** | Uses invalid username                       | Shows error message       |
| **Negative Password Test** | Uses invalid password                       | Shows error message       |

---

## 📄 Test Report

After execution, an HTML report is generated at your specified path (e.g. `G:\chaitanya\ExtentReport.html`).

You can open it in any browser to view:

* ✅ Passed and ❌ Failed test cases
* 📋 Steps with detailed info logs
* ⏱️ Execution timestamps

---

## 🧑‍💻 Author

**Sai Chaitanya Kancharana**
🔗 [LinkedIn]([https://www.linkedin.com/](https://www.linkedin.com/in/sai-chaitanya-kancharana/)) 
💼 Software Developer in Test | Passionate about Automation & QA Tools

---

## 📜 License

This project is licensed under the **MIT License** – feel free to use and modify it for learning or practice purposes.

