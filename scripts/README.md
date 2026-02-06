# Scripts

This folder contains small helper scripts used to generate source code and resources for the **Components** library.

## Prerequisites

### Sibling `green` repository checkout (required for icon generation)

Some scripts (notably `generate-compose-icons`) source SVG assets from the **Green** repository.

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
4. Generates/updates the icon manifest (`GdsIcons.kt`) via `generate-icon-manifest`.

Outputs:
- Generated `ImageVector` sources under:
  - `components/src/main/kotlin/se/seb/gds/icons/solid/`
  - `components/src/main/kotlin/se/seb/gds/icons/regular/`
- Generated manifest:
  - `components/src/main/kotlin/se/seb/gds/icons/GdsIcons.kt`

Usage:

```bash
cd scripts
./generate-compose-icons
```

Notes:
- Requires a sibling checkout of the `green/` repository (see prerequisites above).
- Uses the `s2c` tool to perform the SVG → Compose conversion.

### `generate-icon-manifest`

Generates the icon manifest source file (`GdsIcons.kt`) based on the generated icons.

This makes it easier for consuming apps to discover and use the available icons without
having to know the generated file names/structure.

Typically you don’t need to run this manually, since `generate-compose-icons` calls it.

Usage:

```bash
cd scripts
./generate-icon-manifest
```

### `s2c`

A wrapper around an SVG → Compose converter used by `generate-compose-icons`.

It’s primarily an internal helper, and is called by `generate-compose-icons` with the correct
flags (package names, theme reference, output directories, etc.).

If it fails with a “found project structure, but not binaries” message, it usually means the
underlying converter tool needs to be built for your machine.
