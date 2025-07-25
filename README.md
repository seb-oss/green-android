# Green Design System Android

Green Design System Android is a project that consists of two main parts:

1. **Component Library**: A reusable library of UI components designed for Android applications. This library is distributed via GitHub Packages, making it easy to integrate into your own projects.
2. **Companion App**: A demonstration app showcasing the components available in the library. The app provides examples of how to use the components and serves as a reference for developers.

---

## Table of Contents

- [Component Library](#component-library)
  - [Features](#features)
  - [Installation](#installation)
  - [Usage](#usage)
- [Companion App](#companion-app)
  - [Features](#features-1)
  - [How to Run](#how-to-run)
- [Development](#development)
  - [Building the Project](#building-the-project)
  - [Contributing](#contributing)
- [License](#license)

---

## Component Library

The component library is a collection of customizable UI components designed to simplify and accelerate Android development. It is distributed as an `.aar` package via Maven Central Repository.

### Features

- A variety of reusable UI components.
- Fully customizable colors, styles, and behaviors.
- Designed with accessibility and performance in mind.
- Distributed via Maven Central Repository for easy integration.

### Installation

To use the component library in your project, add the dependency to your `build.gradle` file:

```kotlin
dependencies { 
    implementation("io.github.sebopensource:components::<latest-version>")
}
```

> **Note**: Replace `<latest-version>` with the latest version of the library. 

### Usage

Once installed, you can start using the components in your project. For example:

```kotlin
// Example usage of a Switch component
var checked by remember { mutableStateOf(true) }
GdsSwitch(
    checked = checked,
    onCheckedChanged = { checked = it },
    style = GdsSwitchDefaults.defaultStyle()
)
```

Refer to the [Companion App](#companion-app) for detailed examples of how to use the components.

#### Library preview

You can also launch the `DesignLibraryFragment` in your app to see the components in action. 
This fragment provides a visual representation of all available components and their configurations.


```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.fragment_container, DesignLibraryFragment())
    .commit()
```

---

## Companion App

The companion app is a showcase of the components available in the library. It demonstrates how to use the components and provides a visual reference for their appearance and behavior.

### Features

- Interactive examples of all components.
- A clean and intuitive UI for browsing components.

### How to Run

1. Clone the repository:

```bash
git clone git@github.com:seb-oss/green-android.git
```

2. Open the project in Android Studio.

3. Select the `app` module and run it on an emulator or physical device.

---

## Development

### Building the Project

To build the project locally:

1. Ensure you have Java 17 installed.
2. Run the following command to build the library and the app:

```bash
./gradlew build
```

### Contributing

Contributions are welcome! If you would like to contribute to the project:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with a detailed description of your changes.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.