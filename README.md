# 📄 **README.md — Selenium Cucumber Test Automation Framework**

# 🚀 Selenium Cucumber Test Automation Framework (Java)

A scalable UI automation framework built using **Selenium WebDriver**, **Cucumber BDD (Gherkin)**, and **TestNG**, following **Page Object Model (POM)** design for clean and maintainable automation.

This framework automates **Google search** flow including page title verification and search results validation.

---

## 🧠 Framework Overview

This framework is designed to:

✔ Write tests in simple English using Gherkin  
✔ Separate Page logic from Test logic using Page Object Model  
✔ Automatically capture screenshots on failure  
✔ Support multiple browsers via configuration  
✔ Generate detailed HTML execution reports  
✔ Improve reusability, readability & scalability  

---

## 🔍 How Execution Works

| Layer | Responsibility |
|------|----------------|
| Feature file | Defines scenario in business language |
| Step definitions | Calls page methods to perform actions |
| Page Objects | UI locators + actions (POM design) |
| Hooks | Browser launch + teardown + screenshots |
| DriverFactory | Manages WebDriver instance |
| TestRunner | Integrates Cucumber with TestNG |

---

## 📌 Example BDD Scenario (google.feature)

```gherkin
Feature: Google Search

  Scenario: Verify Google search functionality
    Given User opens Google
    Then Google title should be displayed
    When User searches for "Selenium WebDriver"
    Then Search results should be displayed
````

---

## 📈 Benefits of Framework

| Benefit                  | Description                             |
| ------------------------ | --------------------------------------- |
| Clean architecture       | POM keeps code modular & maintainable   |
| Continuous reporting     | Automatic screenshots in reports        |
| Configurable execution   | Browser & URL through config.properties |
| Selenium Manager support | No manual WebDriver download needed     |
| CI/CD ready              | Works on cloud + GitHub Actions/Jenkins |

---

## ✨ Key Features

✔ Selenium 4 Manager — No driver setup required
✔ Page Object Model with Page Factory
✔ Browser selection from config file
✔ Hooks-based lifecycle management
✔ Screenshot capture on failure
✔ Cucumber TestNG integration with HTML reports
✔ Simple & scalable folder structure

---

## ⚙️ Configuration Settings

📍`src/test/resources/config.properties`

```
browser=chrome
baseUrl=https://www.google.com
```

🔹 Can support Firefox by updating browser value
🔹 Can extend for multi-environment execution later

---

## ▶️ How to Run the Tests

### 🔹 Using IntelliJ IDEA

Right-click 👉 `TestRunner.java` → **Run**

### 🔹 Using Maven Command

```sh
mvn clean test
```

### 📊 Report Location

After execution, open:

```
target/cucumber-report.html
```

Screenshots appear **inside the report** for failed tests.

---

## 🔍 Example User Flow

1️⃣ Launch browser → navigate to Google
2️⃣ Verify page title
3️⃣ Search for a keyword
4️⃣ Validate search results section
5️⃣ Close browser + attach screenshot on failure

---

## 🧪 Future Enhancements (Roadmap)

| Enhancement                        | Purpose                        |
| ---------------------------------- | ------------------------------ |
| Allure / Extent report integration | Rich reporting dashboard       |
| Parallel execution                 | Faster suite execution         |
| WebDriverWait utilities            | More stable and reliable tests |
| Multi-environment support          | QA / Stage / Prod config       |
| Jenkins / GitHub Actions pipeline  | CI/CD automation               |
| Logging (Log4j2)                   | Better debugging               |

---

## 🔗 Git Setup (Quick Guide)

```sh
git init
git add .
git commit -m "Initial automation framework"
git branch -M main
git remote add origin https://github.com/<username>/selenium-cucumber-framework.git
git push -u origin main
```

Use **Personal Access Token** instead of password when prompted.

---

## 🧑‍💻 Author

Automation Framework developed by **Manju S**
📍 Cucumber | Selenium | Java | TestNG | POM

```

---
