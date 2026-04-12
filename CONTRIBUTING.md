# Contributing to Spobrefy 🎵

Thank you for your interest in contributing to Spobrefy! This document provides guidelines and instructions for contributing to the project.

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [Development Workflow](#development-workflow)
- [Commit Guidelines](#commit-guidelines)
- [Pull Request Process](#pull-request-process)
- [Code Style](#code-style)
- [Testing](#testing)
- [Documentation](#documentation)
- [Reporting Bugs](#reporting-bugs)
- [Suggesting Enhancements](#suggesting-enhancements)
- [Questions?](#questions)

## Code of Conduct

### Our Pledge

We are committed to providing a welcoming and inspiring community for all. Please read and respect our Code of Conduct.

### Expected Behavior

- Use welcoming and inclusive language
- Be respectful of differing opinions and experiences
- Accept constructive criticism gracefully
- Focus on what is best for the community
- Show empathy towards other community members

### Unacceptable Behavior

- Harassment or discrimination of any kind
- Offensive comments related to personal characteristics
- Trolling or insulting comments
- Public or private harassment
- Publishing private information without consent

## Getting Started

### Prerequisites

Before you start contributing, make sure you have:

- Android Studio Jellyfish or later
- JDK 17 or later
- Git installed and configured
- A GitHub account
- Familiarity with Kotlin and Android development

### Setting Up Your Environment

1. **Fork the repository**
   - Click the "Fork" button in the top-right of the repository
   - This creates a copy under your GitHub account

2. **Clone your fork**
```bash
git clone https://github.com/YOUR_USERNAME/spobrefy.git
cd spobrefy
```

3. **Add upstream remote**
```bash
git remote add upstream https://github.com/rudrigaum/spobrefy.git
git remote -v
# You should see:
# origin    https://github.com/YOUR_USERNAME/spobrefy.git (fetch)
# origin    https://github.com/YOUR_USERNAME/spobrefy.git (push)
# upstream  https://github.com/rudrigaum/spobrefy.git (fetch)
# upstream  https://github.com/rudrigaum/spobrefy.git (push)
```

4. **Create a local branch**
```bash
git checkout -b feature/your-feature-name
```

5. **Set up the project**
```bash
# Build the project
./gradlew clean build

# Run tests to ensure everything works
./gradlew test
```

## Development Workflow

### 1. Keep your fork updated

Before starting new work, update your fork:

```bash
# Fetch updates from upstream
git fetch upstream

# Rebase your branch on the latest upstream
git rebase upstream/develop

# Or merge if you prefer
git merge upstream/develop
```

### 2. Create a feature branch

```bash
# From the develop branch
git checkout develop
git pull upstream develop

# Create and switch to your feature branch
git checkout -b feature/your-feature-name
# or
git checkout -b fix/your-bug-fix
# or
git checkout -b chore/your-task
```

### 3. Make your changes

- Write clean, readable code
- Follow the [Code Style](#code-style) guidelines
- Add or update tests as needed
- Update documentation if necessary

### 4. Run quality checks locally

```bash
# Run all checks
./gradlew qualityChecks

# Run unit tests
./gradlew testDebugUnitTest

# Run Detekt analysis
./gradlew detekt

# Auto-fix formatting issues
./gradlew qualityChecksFix
```

### 5. Commit your changes

Follow the [Commit Guidelines](#commit-guidelines) below.

### 6. Push to your fork

```bash
git push origin feature/your-feature-name
```

### 7. Create a Pull Request

See [Pull Request Process](#pull-request-process) section.

## Commit Guidelines

We follow [Conventional Commits](https://www.conventionalcommits.org/) specification.

### Commit Message Format

```
<type>(<scope>): <subject>

<body>

<footer>
```

### Type

Must be one of the following:

- **feat:** A new feature
- **fix:** A bug fix
- **docs:** Documentation changes
- **style:** Changes that do not affect code meaning (formatting, missing semicolons, etc.)
- **refactor:** Code change that neither fixes a bug nor adds a feature
- **perf:** Code change that improves performance
- **test:** Adding or updating tests
- **chore:** Changes to build process, dependencies, or tooling

### Scope

Optional. Specify the area of the codebase affected by the change:

- auth
- player
- search
- ui
- api
- database
- etc.

### Subject

- Use the imperative, present tense: "add" not "added" or "adds"
- Don't capitalize the first letter
- No period (.) at the end
- Maximum 50 characters

### Body

Optional. Provide additional context:

- Explain what and why, not how
- Wrap at 72 characters
- Separate from subject with a blank line

### Footer

Optional. Reference issues and breaking changes:

```
Fixes #123
Closes #456
BREAKING CHANGE: description
```

### Examples

```bash
git commit -m "feat(auth): implement Spotify OAuth 2.0 authentication"

git commit -m "fix(player): resolve audio playback issue on Android 12

The playback was stopping due to incorrect permission handling.
This fix ensures audio focus is properly requested before playback.

Fixes #456"

git commit -m "docs: update README with setup instructions"

git commit -m "chore: update Gradle to 8.4.0"

git commit -m "test: add unit tests for AuthRepository"
```

## Pull Request Process

### Before Creating a PR

1. **Ensure all checks pass locally**
```bash
./gradlew qualityChecks
./gradlew testDebugUnitTest
```

2. **Update your branch with latest changes**
```bash
git fetch upstream
git rebase upstream/develop
```

3. **Push your branch**
```bash
git push origin feature/your-feature-name
```

### Creating the PR

1. Go to the original repository on GitHub
2. Click "New Pull Request"
3. Select your branch as the source
4. Fill in the PR template with:
   - **Description:** Clear explanation of changes
   - **Related Issues:** Link any related issues with `Fixes #123`
   - **Type of Change:** Check the appropriate box (feature, fix, etc.)
   - **Testing:** Describe how you tested the changes
   - **Screenshots:** Add if UI changes
   - **Checklist:** Verify all items

### PR Title Format

Follow the same format as commit messages:

```
feat(auth): add two-factor authentication
fix(player): resolve audio sync issue
docs: update contributing guidelines
```

### PR Description Template

```markdown
## Description
Brief explanation of what this PR does.

## Related Issues
Fixes #123
Closes #456

## Type of Change
- [ ] Bug fix (non-breaking change that fixes an issue)
- [ ] New feature (non-breaking change that adds functionality)
- [ ] Breaking change (fix or feature that would cause existing functionality to change)
- [ ] Documentation update

## Testing
Describe the testing you've done:
- [ ] Unit tests added/updated
- [ ] Manual testing on device/emulator
- [ ] Tested on Android 8.0+

## Screenshots (if applicable)
Add screenshots of UI changes.

## Checklist
- [ ] My code follows the code style guidelines
- [ ] I have performed a self-review of my own code
- [ ] I have commented my code, particularly in hard-to-understand areas
- [ ] I have updated the documentation accordingly
- [ ] My changes generate no new warnings
- [ ] I have added tests that prove my fix is effective or that my feature works
- [ ] New and existing unit tests passed locally
- [ ] Code quality checks (Detekt) passed
```

### PR Review Process

1. Maintainers will review your PR
2. Requested changes may be asked
3. Make changes and push to the same branch
4. Review will be performed again
5. Once approved, your PR will be merged

## Code Style

### Kotlin Style Guide

We follow the [official Kotlin Style Guide](https://kotlinlang.org/docs/coding-conventions.html).

### Key Rules

- **Naming:**
  - Classes: `PascalCase`
  - Functions/variables: `camelCase`
  - Constants: `UPPER_SNAKE_CASE`
  - Private properties: `_camelCase` (optional)

- **Formatting:**
  - Use 4 spaces for indentation (not tabs)
  - Maximum line length: 120 characters
  - One class per file

- **Comments:**
  - Use meaningful comments
  - Explain "why", not "what"
  - Use KDoc for public functions and classes

- **Imports:**
  - Organize imports alphabetically
  - Remove unused imports
  - No wildcard imports (except for testing)

### Example

```kotlin
/**
 * Searches for tracks matching the given query.
 *
 * @param query The search query
 * @param limit Maximum number of results
 * @return List of matching tracks
 */
fun searchTracks(query: String, limit: Int = 20): List<Track> {
    require(query.isNotBlank()) { "Query cannot be empty" }
    require(limit > 0) { "Limit must be positive" }
    
    // Perform search
    return api.search(query, limit)
}
```

### Running Code Quality Tools

```bash
# Run Detekt (linting)
./gradlew detekt

# Auto-fix formatting issues
./gradlew qualityChecksFix

# Run all quality checks
./gradlew qualityChecks
```

## Testing

### Writing Tests

Tests are required for:
- New features
- Bug fixes
- Critical functionality changes

### Unit Tests

```kotlin
class TrackRepositoryTest {
    
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    
    private lateinit var repository: TrackRepository
    private val mockApi: TrackApi = mockk()
    
    @Before
    fun setup() {
        repository = TrackRepository(mockApi)
    }
    
    @Test
    fun searchTracks_withValidQuery_returnsResults() = runTest {
        // Arrange
        val query = "The Beatles"
        val expected = listOf(mockTrack())
        coEvery { mockApi.search(query) } returns expected
        
        // Act
        val result = repository.searchTracks(query)
        
        // Assert
        assertEquals(expected, result)
    }
}
```

### Running Tests

```bash
# Run all unit tests
./gradlew test

# Run tests for debug variant
./gradlew testDebugUnitTest

# Run specific test class
./gradlew testDebugUnitTest --tests "com.rudrigaum.spobrefy.data.TrackRepositoryTest"

# Run with coverage
./gradlew testDebugUnitTest jacocoTestReport
```

### Test Coverage

- Aim for >80% code coverage
- Focus on critical paths and edge cases
- Mock external dependencies

## Documentation

### When to Update Documentation

- Adding new features
- Changing existing functionality
- Modifying APIs
- Updating dependencies

### Documentation to Update

- `README.md` - General information
- `CONTRIBUTING.md` - This file
- Inline code comments (KDoc)
- Architecture documentation (if applicable)

### KDoc Format

```kotlin
/**
 * Describes what this function does.
 *
 * More detailed explanation if needed.
 *
 * @param param1 Description of param1
 * @param param2 Description of param2
 * @return Description of return value
 * @throws IllegalArgumentException if input is invalid
 *
 * Example:
 * ```
 * val result = myFunction("value", 123)
 * ```
 */
fun myFunction(param1: String, param2: Int): String {
    // Implementation
}
```

## Reporting Bugs

### Before Reporting

1. Check existing issues to avoid duplicates
2. Try the latest development version
3. Gather information about your environment

### Bug Report Template

Use the following template when creating a new issue:

```markdown
## Description
Clear and concise description of the bug.

## Environment
- Android version: (e.g., Android 12)
- Device: (e.g., Pixel 6, Emulator)
- App version: (e.g., 1.0.0)
- Android Studio version: (if relevant)

## Steps to Reproduce
1. Step 1
2. Step 2
3. ...

## Expected Behavior
What should happen.

## Actual Behavior
What actually happens.

## Screenshots
Add screenshots if helpful.

## Logs
Paste relevant error logs or stack traces.

## Additional Context
Any other context.
```

## Suggesting Enhancements

### Enhancement Request Template

```markdown
## Description
Clear description of the enhancement.

## Motivation
Why is this enhancement needed? What problem does it solve?

## Proposed Solution
How should this be implemented?

## Alternatives Considered
Other approaches you've considered.

## Additional Context
Screenshots, examples, or other relevant information.
```

## Questions?

- **GitHub Issues:** For bugs or feature requests
- **GitHub Discussions:** For general questions
- **Email:** contact@rudrigaum.com

---

**Thank you for contributing to Spobrefy! 🎵**
