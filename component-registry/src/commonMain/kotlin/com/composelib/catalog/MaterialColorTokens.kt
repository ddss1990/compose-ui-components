package com.composelib.catalog

/**
 * Material 3 standard color tokens.
 *
 * These 13 fields map directly to `lightColorScheme()` / `darkColorScheme()`
 * in Compose Multiplatform and feed all built-in M3 components
 * (Button, Card, Switch, etc.).
 */
data class MaterialColorTokens(
    val primary: String,
    val onPrimary: String,
    val primaryContainer: String,
    val onPrimaryContainer: String,
    val secondary: String,
    val onSecondary: String,
    val background: String,
    val onBackground: String,
    val surface: String,
    val onSurface: String,
    val surfaceVariant: String,
    val onSurfaceVariant: String,
    val outline: String,
)
