# Online Test Java Program

This Java program implements a simple online test application using Swing GUI components. Users can answer multiple-choice questions, bookmark questions for review, and receive a final result at the end.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Features](#features)
- [Code Explanation](#code-explanation)
- [License](#license)

## Prerequisites

- Java Development Kit (JDK) installed on your machine.

## Usage

1. Compile the program:
   ```bash
   javac OnlineTest.java
   ```

2. Run the compiled program:
   ```bash
   java OnlineTest
   ```

3. Follow the on-screen instructions to answer questions and navigate through the test.

## Features

- Multiple-choice questions with radio button options.
- Navigation through questions using the "Next" button.
- Bookmarking questions for later review.
- Displaying the final result at the end of the test.

## Code Explanation

The code is structured as follows:

- `OnlineTest` class: The main class that extends `JFrame` and implements the `ActionListener` interface.
  - Instance variables for labels, radio buttons, buttons, and counters.
  - Constructor initializes GUI components, layout, and properties.
  - `actionPerformed` method handles button clicks.
  - `set` method sets up questions and answer options.
  - `check` method checks the selected answer for each question.
  - `main` method creates an instance of the `OnlineTest` class.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the `README.md` file further based on your specific needs.