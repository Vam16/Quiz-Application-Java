# 🧠 Simple Minds — Java Quiz Application

### A timed, 10-question Java trivia quiz built in Swing

[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)](#)
[![Swing](https://img.shields.io/badge/UI-Java%20Swing-blue?style=flat)](#)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A desktop quiz game — "Simple Minds" — that walks a player through a name entry screen, a (deliberately funny) rules screen, a 10-question timed multiple-choice round on core Java concepts, and a final score screen. Built entirely in Java Swing with a live, self-repainting countdown timer and a game-show-style 50/50 lifeline.

## ✨ Features

- **Name entry → rules → quiz → score flow**, each screen its own `JFrame`, passing the player's name through the chain so the score screen can greet them by name.
- **Live 15-second-per-question countdown**, implemented via `paint()` + `Thread.sleep(1000)` + `repaint()` — the timer visibly ticks down on screen, and the quiz auto-advances to the next question if time runs out without an answer.
- **10 hand-written multiple-choice Java trivia questions** (JVM/JDK internals, marker interfaces, memory model, packages, JAR format) stored as a `String[10][5]` question bank with a matching `String[10][2]` answer key.
- **50-50 Lifeline** — a one-time-use button that eliminates two of the four options (correctly avoiding ever removing the right answer) to help the player narrow it down.
- **Auto-scoring** — 10 points per correct answer, tallied by comparing the player's recorded choice against the answer key once the quiz is submitted (either manually or by the timer running out on the last question).

## 🧱 Architecture

```
javaapplication4/
├── Login.java   # Name entry screen
├── Rules.java   # Rules screen (greets the player by name)
├── Quiz.java    # The 10-question timed round — question bank, timer, lifeline, scoring
└── Score.java   # Final score screen, loops back to Login
```

Each screen is a self-contained `JFrame` that constructs the next one directly (`new Rules(name)`, `new Quiz(name)`, `new Score(name, score)`) — a simple, linear hand-off with no separate navigation/state layer, appropriate for a four-screen quiz flow.

> Note: the package is named `javaapplication4` — NetBeans' default name for a new project when nothing more specific is chosen at creation time. Harmless, but a one-line rename (and updating the `package`/`import` statements accordingly) would be a natural polish pass if this project grows.

## 🛠️ Tech stack

| Layer | Technology |
|---|---|
| Language | Java |
| UI | Java Swing (hand-built layouts, no Designer/FXML) |
| IDE project | NetBeans |

## 🚀 Getting started

### Prerequisites

- **JDK 8+**
- **NetBeans** (recommended — opening `project.xml` lets NetBeans regenerate `build.xml` automatically) or any IDE that can run a plain Java Swing project from source

### Running it

1. **Clone the repository**
   ```bash
   git clone https://github.com/Vam16/Quiz-Application-Java.git
   ```
2. Open the folder as a project in NetBeans (**File → Open Project**), or compile directly:
   ```bash
   javac -d out src/javaapplication4/*.java
   cp -r src/icons out/icons
   java -cp out javaapplication4.Login
   ```
3. Enter your name, read the rules (you've been warned), and start the quiz. Ten questions, fifteen seconds each, one 50-50 lifeline — good luck.

## 📝 License

Distributed under the MIT License. See [`LICENSE`](LICENSE) for details.

## 👤 Author

**Mihai-Andrei Vasile**
