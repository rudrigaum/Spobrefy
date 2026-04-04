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
