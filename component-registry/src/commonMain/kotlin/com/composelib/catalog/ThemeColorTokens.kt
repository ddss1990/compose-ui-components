package com.composelib.catalog

/**
 * Composite color tokens that combine Material 3 standard colors
 * with design-system semantic extensions.
 *
 * - `material` — 13 M3 fields consumed by `lightColorScheme()` / `darkColorScheme()`
 * - `semantic` — 22 semantic fields for text, icon, error, warning, divider, etc.
 *
 * Access pattern:
 * ```kotlin
 * theme.colors.material.primary
 * theme.colors.semantic.textPrimary
 * ```
 */
data class ThemeColorTokens(
    val material: MaterialColorTokens,
    val semantic: SemanticColorTokens,
)
