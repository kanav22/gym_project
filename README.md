# Compose Commerce Catalog

[![CI](https://github.com/kanav22/compose-commerce-catalog/actions/workflows/ci.yml/badge.svg)](https://github.com/kanav22/compose-commerce-catalog/actions/workflows/ci.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

Jetpack Compose e-commerce catalog reference app — MVVM, Hilt, modular data layer, and Paparazzi golden tests.

---

## Overview

Product list and detail flows for a fitness apparel catalog. Focus areas: clean architecture, Compose UI, testability, and graceful handling of imperfect API data (missing images, HTML descriptions).

## Architecture

| Layer | Responsibility |
|-------|----------------|
| **UI** | Compose screens, navigation, design tokens |
| **ViewModel** | UI state, user actions, repository orchestration |
| **Data** | Repositories, deserialization, mock/CDN data sources |
| **DI** | Hilt modules for repositories and services |

**Stack:** Kotlin · Jetpack Compose · Hilt · Navigation Compose · Coil · Gson · Timber · Paparazzi

## Features

- Product list with title, price, color, and image handling (placeholder on failure)
- Product detail with HTML description parsing
- Enum-driven product state labels
- Golden snapshot tests for key screens

## Getting Started

### Prerequisites

- Android Studio Hedgehog or newer
- JDK 17+
- Android SDK 34

### Build & Run

```bash
./gradlew assembleDebug
./gradlew installDebug
```

### Tests

```bash
./gradlew testDebugUnitTest    # unit, Compose UI, and Paparazzi golden tests
```

## CI

GitHub Actions runs unit tests and `assembleDebug` on every push and pull request to `main`.

## Screenshots

<img width="342" alt="Product list" src="https://github.com/kanav22/gym_project/assets/5936688/f3b3581c-74af-4d35-80d2-9c07ca72abec">
<img width="327" alt="Product detail" src="https://github.com/kanav22/gym_project/assets/5936688/b9f2edf4-19d5-4f11-9bab-3c0afda9a2bb">
<img width="337" alt="Product detail variant" src="https://github.com/kanav22/gym_project/assets/5936688/5e6cccf2-fc6f-4154-8d72-207030bd8393">

## Roadmap

- Product search and filters (type, price range)
- Wishlist and basket flows
- Room/local cache for offline browsing
- Expanded accessibility coverage

## License

MIT — see [LICENSE](LICENSE).
