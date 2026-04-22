# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

---

## [Unreleased]

### Added
### Changed
### Deprecated
### Removed
### Fixed

## [1.1.0] - 2026-04-22

### Added
- `GdsCallOut` — new component replacing `GdsInformationCard`. Same functionality and API,
  renamed to better reflect its purpose as a contextual call-out message rather than a generic
  information card.
- `GdsCalloutDefaults` — new defaults object replacing `GdsInformationCardDefaults`. Provides
  the following styles:
  - `informationSubtle()` — subtle neutral style (previously `information()`)
  - `informationSubtleOnWhite()` — subtle style on a white background (previously `informationOnWhite()`)
  - `information()` — prominent information style (previously `loud()`)
  - `critical()` — critical/error style
  - `notice()` — notice/informational style
  - `warning()` — warning style

### Changed
-  Update `onClick` parameter to be nullable in `ListRowItem` to allow for non-clickable rows.

### Deprecated
- `GdsInformationCard` — use `GdsCallOut` instead. The IDE will offer an automatic
  quick-fix migration via `ReplaceWith`.
- `GdsInformationCardDefaults` — use `GdsCalloutDefaults` instead. Each deprecated function
  has a corresponding `ReplaceWith` pointing to its equivalent in `GdsCalloutDefaults`:
  - `information()` → `GdsCalloutDefaults.informationSubtle()`
  - `informationOnWhite()` → `GdsCalloutDefaults.informationSubtleOnWhite()`
  - `loud()` → `GdsCalloutDefaults.information()`

See [MIGRATION.md](MIGRATION.md) for step-by-step migration instructions.

---

## [1.0.2] - 2026-04-20

### Added
- Add content slot to `ListRowItem` to allow for more flexible content in list rows.
- `notice()` - new style added to `GdsButtonDefaults`

---

<!-- Links -->
[1.1.0]: https://github.com/seb-oss/green-android/releases/tag/1.1.0
[1.0.2]: https://github.com/seb-oss/green-android/releases/tag/1.0.2
