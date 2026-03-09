# Scripts

This folder contains small helper scripts used to generate source code and resources for the **Components** library.

## Prerequisites

### Sibling `green` repository checkout (required for icon generation)

Some scripts (notably `generate-compose-icons` and `generate-vector-drawables`) source SVG assets from the **Green** repository.

These scripts assume you have both repositories checked out next to each other:

```
<parent>/
  green/         # the Green repository (source of SVG icons)
  green-android/ # this repository (Components for Android)
```

If `green` isn’t present, icon generation will fail because the SVG input assets can’t be found.

### Running scripts from the correct working directory

A few scripts currently rely on relative paths and therefore **must be executed from inside the `scripts/` folder**.

Run scripts like this:

```bash
cd scripts
./generate-compose-icons
```

If you run them from the repository root (for example `./scripts/generate-compose-icons`) you may see errors about missing files/binaries.

## Scripts

### `generate-compose-icons`

Generates Compose `ImageVector`s from the SVG icons maintained in the **Green** repository.

What it does:

1. Reads all SVG assets from the Green repository (solid + regular icon sets).
2. Converts them into Kotlin source files containing Compose `ImageVector`s.
3. Post-processes the generated Kotlin files to fix known issues in generated output.
4. Generates/updates the icon manifest used in this Android repo via `generate-icon-manifest`.
5. Generates a **backend-friendly icon manifest** via `generate-icon-enums`.

Outputs:

**Android (this repo)**
- Generated `ImageVector` sources under:
  - `components/src/main/kotlin/se/seb/gds/icons/solid/`
  - `components/src/main/kotlin/se/seb/gds/icons/regular/`
- Generated manifest used by the Android library:
  - `components/src/main/kotlin/se/seb/gds/icons/GdsIcons.kt`

**Backend/BFF (generated for copying)**
- Generated file:
  - `scripts/GdsIcons.kt`

  This file is intentionally **gitignored** in this repo because it’s meant to be copied into the backend/BFF service.

Usage:

```bash
cd scripts
./generate-compose-icons
```

Notes:
- Requires a sibling checkout of the `green/` repository (see prerequisites above).
- Uses the `s2c` tool to perform the SVG → Compose conversion.

### `generate-icon-manifest`

Generates the icon manifest source file (`GdsIcons.kt`) used by the Android library, based on the generated icons.

Typically you don’t need to run this manually, since `generate-compose-icons` calls it.

Usage:

```bash
cd scripts
./generate-icon-manifest
```

### `generate-icon-enums`

Generates a backend-friendly icon manifest at `scripts/GdsIcons.kt`.

This is useful when another service (for example a BFF) needs a stable list of icon identifiers
without depending on the Android library module structure.

The generated file is **gitignored** in this repo because it’s an output artifact intended to be copied elsewhere.

Usage:

```bash
cd scripts
./generate-icon-enums
```

### `generate-vector-drawables`

Generates **Android VectorDrawable** XML files from the SVG icons maintained in the **Green** repository.

This is useful if a consuming app (or a legacy View-based screen) wants to use the same icon set via `@drawable/...` resources.

What it does:

1. Reads all SVG assets from the Green repository (solid + regular icon sets).
2. Converts them into Android VectorDrawable XML resources.

Output:

- Generated VectorDrawables under:
  - `components/src/main/res/drawable/`

Resource naming:

- The output is prefixed to avoid collisions between icon sets:
  - `gds_solid_<icon>.xml`
  - `gds_regular_<icon>.xml`

Notes:

- These resources are intended to be **tinted** by the caller (for example via `android:tint`, `ImageView.setColorFilter`, or Compose `Icon(tint = ...)`).
- Conversion uses a simple bash-based parser that extracts SVG path data and wraps it in VectorDrawable XML format.
- Works best for icon-style SVGs (simple paths). Complex SVGs with gradients, masks, or filters may not convert perfectly.

Usage:

```bash
cd scripts
./generate-vector-drawables
```

Requirements:

- A sibling checkout of the `green/` repository (see prerequisites above).
- Standard Unix tools (`bash`, `sed`, `grep`) — available by default on macOS/Linux.

### `s2c`

A wrapper around an SVG → Compose converter used by `generate-compose-icons`.

It’s primarily an internal helper, and is called by `generate-compose-icons` with the correct
flags (package names, theme reference, output directories, etc.).

If it fails with a “found project structure, but not binaries” message, it usually means the
underlying converter tool needs to be built for your machine.
