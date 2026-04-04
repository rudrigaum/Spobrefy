# 🎵 Spobrefy

A modern Android music streaming application built with Kotlin and Jetpack Compose, featuring Spotify API integration and Clean Architecture.

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Architecture](#architecture)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Building & Testing](#building--testing)
- [Code Quality](#code-quality)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

- 🎵 Stream music from Spotify
- 🔍 Search for songs, artists, and playlists
- ❤️ Save favorite tracks
- 📱 Modern UI with Jetpack Compose
- 🌙 Dark mode support
- 🔐 Secure authentication with Spotify OAuth
- 📊 Offline-first with local database
- 🚀 Fast and responsive performance

## 🛠️ Tech Stack

### Core
- **Language:** Kotlin 2.2.10
- **UI Framework:** Jetpack Compose 2024.09.00
- **Minimum SDK:** Android 8.0 (API 26)
- **Target SDK:** Android 9.1

### Architecture & DI
- **Pattern:** Clean Architecture
- **DI:** Hilt 2.51
- **Serialization:** Kotlinx Serialization 1.6.3

### Networking
- **HTTP Client:** OkHttp 4.12.0 + Retrofit 2.11.0
- **API:** Spotify Web API
- **Logging:** OkHttp Logging Interceptor

### Database
- **Local Storage:** Room Database (coming soon)
- **Caching:** Repository pattern with in-memory cache

### Testing
- **Unit Tests:** JUnit 4.13.2
- **Instrumented Tests:** Espresso 3.7.0
- **UI Tests:** Compose UI Testing

### Code Quality
- **Static Analysis:** Detekt 1.23.6
- **Code Coverage:** Jacoco 0.8.11
- **SonarQube:** 4.4.1.3373
- **Linting:** ktlint 1.2.1

### Build & CI/CD
- **Build System:** Gradle with Kotlin DSL
- **CI/CD:** GitHub Actions
- **Version Catalog:** Gradle 8.3.0

## 🏗️ Architecture

This project follows **Clean Architecture** principles with the following layers:

```
┌─────────────────────────────────┐
│     Presentation Layer          │
│  (Compose UI + ViewModels)      │
└──────────────┬──────────────────┘
               │
┌──────────────▼──────────────────┐
│     Domain Layer                │
│  (Use Cases + Entities)         │
└──────────────┬──────────────────┘
               │
┌──────────────▼──────────────────┐
│     Data Layer                  │
│  (Repository + Data Sources)    │
└─────────────────────────────────┘
```

### Key Principles
- **Dependency Inversion:** High-level modules don't depend on low-level modules
- **Single Responsibility:** Each class has one reason to change
- **Open/Closed:** Open for extension, closed for modification
- **Interface Segregation:** Clients don't depend on interfaces they don't use
- **Liskov Substitution:** Derived classes can substitute base classes

## 🚀 Getting Started

### Prerequisites

- Android Studio Jellyfish or later
- JDK 17+
- Git
- Spotify Developer Account (for API credentials)

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/rudrigaum/spobrefy.git
cd spobrefy
```

2. **Create local.properties** (if not exists)
```bash
echo "sdk.dir=${ANDROID_SDK_ROOT}" > local.properties
```

3. **Open in Android Studio**
```bash
open -a "Android Studio" .
```

4. **Setup Spotify API Credentials**
   - Go to [Spotify Developer Dashboard](https://developer.spotify.com/dashboard)
   - Create a new app
   - Copy your Client ID and Client Secret
   - Add to `local.properties`:

```properties
spotify.client_id=YOUR_CLIENT_ID
spotify.client_secret=YOUR_CLIENT_SECRET
spotify.redirect_uri=com.rudrigaum.spobrefy://callback
```

5. **Build the project**
```bash
./gradlew clean build
```

6. **Run on emulator or device**
```bash
./gradlew installDebug
adb shell am start -n com.rudrigaum.spobrefy/.MainActivity
```

## 📁 Project Structure

```
spobrefy/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/com/rudrigaum/spobrefy/
│   │   │   │   ├── data/              # Data layer
│   │   │   │   │   ├── api/
│   │   │   │   │   ├── repository/
│   │   │   │   │   └── datasource/
│   │   │   │   ├── domain/            # Domain layer
│   │   │   │   │   ├── usecase/
│   │   │   │   │   └── entity/
│   │   │   │   ├── presentation/      # Presentation layer
│   │   │   │   │   ├── ui/
│   │   │   │   │   ├── viewmodel/
│   │   │   │   │   └── navigation/
│   │   │   │   ├── di/                # Dependency Injection
│   │   │   │   └── util/
│   │   │   └── res/
│   │   ├── test/                      # Unit tests
│   │   └── androidTest/               # Instrumented tests
│   └── build.gradle.kts
├── build.gradle.kts                   # Root build config
├── settings.gradle.kts
├── gradle/
│   ├── libs.versions.toml
│   └── wrapper/
├── .github/
│   └── workflows/
│       ├── ci.yml
│       └── code-quality.yml
├── detekt.yml
├── .editorconfig
├── .gitignore
└── README.md
```

## 🏗️ Building & Testing

### Build Commands

```bash
# Clean build
./gradlew clean build

# Build without tests
./gradlew build -x test

# Build release APK
./gradlew assembleRelease

# Install on device
./gradlew installDebug
```

### Running Tests

```bash
# Run all unit tests
./gradlew test

# Run unit tests for debug variant
./gradlew testDebugUnitTest

# Run instrumented tests
./gradlew connectedAndroidTest

# Run with coverage report
./gradlew testDebugUnitTest jacocoTestReport
```

### Viewing Reports

```bash
# Unit test report
open app/build/reports/tests/testDebugUnitTest/index.html

# Coverage report
open app/build/reports/jacoco/jacocoTestReport/html/index.html
```

## ✅ Code Quality

### Quality Checks

```bash
# Run all quality checks
./gradlew qualityChecks

# Run Detekt analysis
./gradlew detekt

# Auto-fix code style
./gradlew qualityChecksFix

# Generate quality reports
./gradlew detekt sonarqube
```

### Detekt Configuration

Code quality rules are defined in `detekt.yml`. Key rules:

- **Complexity:** Max method length 60 lines, max parameters 6
- **Naming:** Follow Kotlin naming conventions
- **Performance:** Avoid unnecessary object allocation
- **Potential Bugs:** Null safety, exception handling
- **Style:** Clean code principles

### GitHub Actions

Two workflows are configured:

1. **CI Workflow** (`ci.yml`)
   - Runs on every push and PR
   - Builds the project
   - Runs unit tests
   - Generates reports

2. **Code Quality Workflow** (`code-quality.yml`)
   - Runs Detekt analysis
   - Sends results to SonarQube
   - Comments on PRs with results
   - Blocks merge if critical issues found

## 🤝 Contributing

We welcome contributions! Please follow these steps:

### 1. Create a feature branch
```bash
git checkout -b feature/your-feature-name
# or
git checkout -b fix/your-bug-fix
# or
git checkout -b chore/your-chore
```

### 2. Follow coding standards
- Use the [Kotlin Style Guide](https://kotlinlang.org/docs/coding-conventions.html)
- Run code quality checks before committing:
```bash
./gradlew qualityChecks
```

### 3. Write tests
- Unit tests for business logic
- Instrumented tests for UI
- Aim for >80% code coverage

### 4. Commit with clear messages
```bash
git commit -m "feature: add search functionality for playlists"
git commit -m "fix: handle null pointer exception in player"
git commit -m "chore: update Gradle dependencies"
```

### 5. Push and create a Pull Request
```bash
git push origin your-branch-name
```

### 6. PR Guidelines
- Link related issues
- Provide screenshots if UI changes
- Write clear description of changes
- Ensure all checks pass

## 📝 Commit Message Convention

We follow [Conventional Commits](https://www.conventionalcommits.org/):

```
<type>(<scope>): <subject>

<body>

<footer>
```

### Types
- `feat:` New feature
- `fix:` Bug fix
- `chore:` Build, dependencies, or tooling
- `docs:` Documentation
- `refactor:` Code refactoring
- `test:` Adding or updating tests
- `perf:` Performance improvements

### Examples
```bash
git commit -m "feat(auth): implement Spotify OAuth 2.0"
git commit -m "fix(player): resolve audio playback issue"
git commit -m "chore: update Gradle to 8.4.0"
```

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Rodrigo Cerqueira**
- GitHub: [@rudrigaum](https://github.com/rudrigaum)
- Email: rodrigocerqueirareis@gmail.com

## 🙏 Acknowledgments

- Spotify for the amazing Web API
- Google for Jetpack Compose and Hilt
- JetBrains for Kotlin
- All contributors who have helped with this project

## 📞 Support

If you have any questions or issues, please:

1. Check the [GitHub Issues](https://github.com/rudrigaum/spobrefy/issues)
2. Search for existing solutions
3. Create a new issue with a clear description

---

**Made with ❤️ by [Rodrigaum](https://github.com/rudrigaum)**
