package com.composelib.catalog

enum class ThemeMode {
    Light,
    Dark,
}

data class ThemeColorTokens(
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

data class ThemeTypographyTokens(
    val titleSizeSp: Int,
    val titleWeight: Int,
    val bodySizeSp: Int,
    val bodyWeight: Int,
    val captionSizeSp: Int,
    val captionWeight: Int,
)

data class ThemeSpacingTokens(
    val compactDp: Int,
    val regularDp: Int,
    val spaciousDp: Int,
    val sectionDp: Int,
)

data class ThemeShapeTokens(
    val cardCornerRadiusDp: Int,
    val mediaCornerRadiusDp: Int,
    val pillCornerRadiusDp: Int,
)

data class ThemeMediaTokens(
    val thumbnailAspectRatio: Float,
    val heroAspectRatio: Float,
    val overlayAlpha: Float,
)

data class ThemeFoundationTokens(
    val typography: ThemeTypographyTokens,
    val spacing: ThemeSpacingTokens,
    val shapes: ThemeShapeTokens,
    val media: ThemeMediaTokens,
)

data class ThemeDefinition(
    val key: String,
    val name: String,
    val mode: ThemeMode,
    val description: String,
    val colors: ThemeColorTokens,
    val foundation: ThemeFoundationTokens = defaultFoundation(),
)

object ThemeCatalog {
    fun defaultThemes(): List<ThemeDefinition> = listOf(
        ThemeDefinition(
            key = "editorial-light",
            name = "Editorial Light",
            mode = ThemeMode.Light,
            description = "Warm, gallery-like light theme.",
            colors = ThemeColorTokens(
                primary = "#1B3A57",
                onPrimary = "#FFFFFF",
                primaryContainer = "#D7E4F1",
                onPrimaryContainer = "#10253A",
                secondary = "#5C5A7D",
                onSecondary = "#FFFFFF",
                background = "#F7F4EE",
                onBackground = "#1D1B17",
                surface = "#FFFBF4",
                onSurface = "#1D1B17",
                surfaceVariant = "#E5E0D8",
                onSurfaceVariant = "#4A4540",
                outline = "#77726B",
            ),
            foundation = defaultFoundation(),
        ),
        ThemeDefinition(
            key = "editorial-dark",
            name = "Editorial Dark",
            mode = ThemeMode.Dark,
            description = "Low-light editorial theme with softened contrast.",
            colors = ThemeColorTokens(
                primary = "#A7C4DD",
                onPrimary = "#0B1D2D",
                primaryContainer = "#183247",
                onPrimaryContainer = "#D7E4F1",
                secondary = "#B8B4D7",
                onSecondary = "#17162C",
                background = "#151311",
                onBackground = "#F2ECE2",
                surface = "#1D1A17",
                onSurface = "#F2ECE2",
                surfaceVariant = "#403B35",
                onSurfaceVariant = "#CFC7BA",
                outline = "#8E877E",
            ),
            foundation = defaultFoundation(overlayAlpha = 0.18f),
        ),
    )
}

private fun defaultFoundation(
    overlayAlpha: Float = 0.12f,
): ThemeFoundationTokens = ThemeFoundationTokens(
    typography = ThemeTypographyTokens(
        titleSizeSp = 20,
        titleWeight = 600,
        bodySizeSp = 14,
        bodyWeight = 400,
        captionSizeSp = 12,
        captionWeight = 500,
    ),
    spacing = ThemeSpacingTokens(
        compactDp = 8,
        regularDp = 12,
        spaciousDp = 16,
        sectionDp = 24,
    ),
    shapes = ThemeShapeTokens(
        cardCornerRadiusDp = 20,
        mediaCornerRadiusDp = 16,
        pillCornerRadiusDp = 999,
    ),
    media = ThemeMediaTokens(
        thumbnailAspectRatio = 4f / 3f,
        heroAspectRatio = 16f / 9f,
        overlayAlpha = overlayAlpha,
    ),
)
