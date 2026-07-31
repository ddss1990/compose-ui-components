package com.composelib.catalog

/**
 * Design-system semantic color tokens.
 *
 * These 22 fields express design intent beyond what Material 3 provides:
 * text hierarchy, icon hierarchy, error / warning states, surface extensions,
 * dividers, and press overlays.
 *
 * Access via `theme.colors.semantic.textPrimary`, etc.
 */
data class SemanticColorTokens(
    // ─── Text hierarchy ─────────────────────────────────────
    val textPrimary: String,
    val textSecondary: String,
    val textTertiary: String,
    val textQuaternary: String,
    val textDisabled: String,
    val textHighlight: String,
    val textOnHighlight: String,
    // ─── Icon hierarchy ─────────────────────────────────────
    val iconPrimary: String,
    val iconSecondary: String,
    val iconTertiary: String,
    val iconQuaternary: String,
    // ─── Error / Warning ────────────────────────────────────
    val errorRed: String,
    val errorRedContainer: String,
    val warningYellow: String,
    val warningOrange: String,
    val warningOrangeContainer: String,
    // ─── Surface extensions ─────────────────────────────────
    val surfaceHighlight: String,
    val surfaceHighlightContainer: String,
    // ─── Divider & Overlay ──────────────────────────────────
    val divider: String,
    val dividerVariant: String,
    val pressOverlay: String,
)
