# Release Process

This document describes the steps to publish a new release of the Green Design System Android library.

---

## Versioning

This project follows [Semantic Versioning](https://semver.org/spec/v2.0.0.html):

| Change type                                        | Version bump              |
|----------------------------------------------------|---------------------------|
| Bug fixes, performance improvements                | Patch (x.x.**X**)         |
| New components, additive features, deprecations    | Minor (x.**X**.0)         |
| Breaking changes / removal of deprecated APIs      | Major (**X**.0.0)         |

---

## Steps

### 1. Update the version

In `gradle.properties`, bump `VERSION_NAME`:

```properties
VERSION_NAME=1.0.3
```

### 2. Update the Changelog

In `CHANGELOG.md`:
- Rename `[Unreleased]` to `[x.y.z] - YYYY-MM-DD`
- Add a new release link at the bottom of the file:
  ```
  [x.y.z]: https://github.com/seb-oss/green-android/releases/tag/x.y.z
  ```
- Add a fresh empty `[Unreleased]` section at the top for the next release

### 3. Update the Migration Guide (if needed)

If the release includes deprecations or API changes, update `MIGRATION.md` with:
- A new section titled `x.y.z-prev → x.y.z: <summary>`
- The reason for the change
- Before/after code examples
- A mapping table if styles or functions were renamed

### 4. Commit and open a Pull Request

Open a pull request targeting `main`. Once it is reviewed and merged, the release is ready to be triggered.

### 5. Trigger the release

> **No manual tagging needed.**
> Merging to `main` triggers a GitHub Actions workflow that automatically creates the Git tag from `VERSION_NAME` and runs the publish workflow to release the library to Maven Central.

---

## Post-release

- Add an empty `[Unreleased]` section to `CHANGELOG.md` if not already done.
- Notify the team of the new release and any migration steps required.

