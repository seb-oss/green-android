# Migration Guide

## 1.0.2 → 1.1.0: `GdsInformationCard` → `GdsCallOut`

### Why

`GdsInformationCard` was renamed to `GdsCallOut` to better reflect its purpose as a
contextual call-out message rather than a generic information card.
`GdsInformationCardDefaults` was renamed to `GdsCalloutDefaults` accordingly.

### How to migrate

The IDE will offer an automatic **"Replace with..."** quick-fix on every deprecated call site
(powered by `@Deprecated` + `ReplaceWith`). You can also migrate manually using the mappings
below.

---

### Component

```kotlin
// Before
GdsInformationCard(
    heading = "Title",
    body = "Body text.",
    style = GdsInformationCardDefaults.loud(),
    onDismiss = {},
)

// After
GdsCallOut(
    heading = "Title",
    body = "Body text.",
    style = GdsCalloutDefaults.information(),
    onDismiss = {},
)
```

---

### Style mapping

| Old (`GdsInformationCardDefaults`) | New (`GdsCalloutDefaults`)             |
|------------------------------------|----------------------------------------|
| `information()`                    | `informationSubtle()`                  |
| `informationOnWhite()`             | `informationSubtleOnWhite()`           |
| `loud()`                           | `information()`                        |
| `critical()`                       | `critical()` *(unchanged)*             |
| `notice()`                         | `notice()` *(unchanged)*               |
| `warning()`                        | `warning()` *(unchanged)*              |

