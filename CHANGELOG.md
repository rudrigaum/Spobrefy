# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

- Initial project setup with Clean Architecture
- GitHub Actions CI/CD workflows (ci.yml and code-quality.yml)
- Detekt configuration for code quality analysis
- EditorConfig for consistent code formatting
- Contributing guidelines and documentation
- Pull request template
- Code of Conduct

### Changed

- (Changes in unreleased version go here)

### Deprecated

- (Deprecated features go here)

### Removed

- (Removed features go here)

### Fixed

- (Bug fixes go here)

### Security

- (Security patches go here)

## [0.1.0] - 2026-04-04

### Added

- Project initialization
- Gradle setup with Kotlin DSL
- Version catalog (libs.versions.toml)
- Build configuration:
  - Target SDK 35
  - Minimum SDK 26
  - Java compatibility 17
- Core dependencies:
  - Kotlin 2.2.10
  - Jetpack Compose 2024.09.00
  - Hilt 2.51
  - Retrofit 2.11.0
  - OkHttp 4.12.0
  - Kotlinx Serialization 1.6.3
- Testing dependencies:
  - JUnit 4.13.2
  - Espresso 3.7.0
  - MockK 1.13.10
- Code quality tools:
  - Detekt 1.23.6
  - Jacoco 0.8.11
  - SonarQube 4.4.1.3373
  - ktlint 1.2.1
- Documentation:
  - README with project overview and setup instructions
  - CONTRIBUTING guidelines for contributors
  - LICENSE (MIT)
  - CODE_OF_CONDUCT for community standards
  - CHANGELOG for tracking changes
- GitHub Actions workflows:
  - CI workflow for building and testing
  - Code quality workflow with Detekt and SonarQube
- EditorConfig for consistent code formatting
- Pull request template

### Changed

- (No changes yet in initial release)

### Deprecated

- (No deprecations yet)

### Removed

- (No removals yet)

### Fixed

- (No bug fixes yet)

### Security

- (No security patches yet)

---

## Guidelines for Contributors

### Unreleased Section

Keep an "Unreleased" section at the top of the changelog for upcoming changes. This makes it easier to see what's coming.

### Version Format

Follow semantic versioning:
- MAJOR version when you make incompatible API changes
- MINOR version when you add functionality in a backwards-compatible manner
- PATCH version when you make backwards-compatible bug fixes

Examples:
- `[1.0.0]` - First major release
- `[0.2.1]` - Patch release
- `[0.2.0]` - Minor release

### Date Format

Use ISO 8601 format: `YYYY-MM-DD`

Example: `[1.0.0] - 2026-04-04`

### Categories

Use these categories in order:

1. **Added** - New features
2. **Changed** - Changes in existing functionality
3. **Deprecated** - Features that will be removed in future versions
4. **Removed** - Features that have been removed
5. **Fixed** - Bug fixes
6. **Security** - Security patches and vulnerability fixes

### Writing Guidelines

- Be concise but descriptive
- Use past tense (added, fixed, changed, removed)
- Group related changes together
- Link to related issues and PRs when possible
- Keep it user-focused (what changed for users, not implementation details)

### Example Entry

```markdown
## [1.2.0] - 2026-05-15

### Added

- Search functionality for tracks and artists (#123)
- Offline playback support (#124, #125)
- User preferences storage (#126)

### Changed

- Improved playlist loading performance (#127)
- Updated Spotify API integration (#128)

### Fixed

- Fixed audio playback crash on Android 8 (#129)
- Resolved memory leak in player (#130)

### Security

- Updated OkHttp to fix security vulnerability (#131)
```

---

## How to Update Changelog

### When Making Changes

1. Move items from "Unreleased" to a new version section
2. Follow semantic versioning
3. Use today's date in ISO 8601 format
4. Keep the newest version at the top

### Step-by-Step Process

```bash
# 1. Make your changes and commit them
git commit -m "feat: add search functionality"

# 2. Update CHANGELOG.md with new version
# Move items from Unreleased to new version section

# 3. Commit the changelog update
git commit -m "chore: update CHANGELOG for v1.2.0"

# 4. Create a git tag (optional but recommended)
git tag -a v1.2.0 -m "Release version 1.2.0"

# 5. Push both commits and tags
git push origin main
git push origin --tags
```

### Commit Message Format

Use this format when updating changelog:

```bash
git commit -m "chore: update CHANGELOG for v1.2.0"
```

---

## Common Mistakes to Avoid

- ❌ Don't write implementation details
- ❌ Don't forget to move from "Unreleased"
- ❌ Don't use inconsistent dates or formats
- ❌ Don't mix categories in one entry
- ❌ Don't forget to update version numbers

---

## Resources

- [Keep a Changelog](https://keepachangelog.com/) - Official specification
- [Semantic Versioning](https://semver.org/) - Version numbering standard
- [Conventional Commits](https://www.conventionalcommits.org/) - Commit message format

---

**Last updated:** 2026-04-04
