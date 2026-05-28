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
        ThemeDefinition(
            key = "neon-arcade-dark",
            name = "Neon Arcade Dark",
            mode = ThemeMode.Dark,
            description = "High-energy cyber palette with sharp neon contrast.",
            colors = ThemeColorTokens(
                primary = "#33F1FF",
                onPrimary = "#001519",
                primaryContainer = "#01333A",
                onPrimaryContainer = "#9CFBFF",
                secondary = "#FF4FD8",
                onSecondary = "#22001A",
                background = "#0A0A12",
                onBackground = "#EAF3FF",
                surface = "#111221",
                onSurface = "#EAF3FF",
                surfaceVariant = "#1D1F35",
                onSurfaceVariant = "#B4BDD9",
                outline = "#5D6790",
            ),
            foundation = defaultFoundation(overlayAlpha = 0.26f).copy(
                typography = ThemeTypographyTokens(
                    titleSizeSp = 22,
                    titleWeight = 700,
                    bodySizeSp = 14,
                    bodyWeight = 450,
                    captionSizeSp = 12,
                    captionWeight = 600,
                ),
                shapes = ThemeShapeTokens(
                    cardCornerRadiusDp = 14,
                    mediaCornerRadiusDp = 12,
                    pillCornerRadiusDp = 999,
                ),
            ),
        ),
        ThemeDefinition(
            key = "forest-mist-light",
            name = "Forest Mist Light",
            mode = ThemeMode.Light,
            description = "Soft natural palette with calm earthy accents.",
            colors = ThemeColorTokens(
                primary = "#2D6A4F",
                onPrimary = "#FFFFFF",
                primaryContainer = "#CFEBDC",
                onPrimaryContainer = "#123526",
                secondary = "#A56A2A",
                onSecondary = "#FFFFFF",
                background = "#F3F6F1",
                onBackground = "#1E2A22",
                surface = "#FCFEFA",
                onSurface = "#1E2A22",
                surfaceVariant = "#E2EADF",
                onSurfaceVariant = "#46554B",
                outline = "#738378",
            ),
            foundation = defaultFoundation(overlayAlpha = 0.14f).copy(
                spacing = ThemeSpacingTokens(
                    compactDp = 10,
                    regularDp = 14,
                    spaciousDp = 18,
                    sectionDp = 26,
                ),
                shapes = ThemeShapeTokens(
                    cardCornerRadiusDp = 24,
                    mediaCornerRadiusDp = 18,
                    pillCornerRadiusDp = 999,
                ),
            ),
        ),
        ThemeDefinition(
            key = "imperial-lux-dark",
            name = "Imperial Lux Dark",
            mode = ThemeMode.Dark,
            description = "Luxury editorial dark mode with deep navy and gold accents.",
            colors = ThemeColorTokens(
                primary = "#D4AF37",
                onPrimary = "#1E1500",
                primaryContainer = "#4A3A10",
                onPrimaryContainer = "#FCECB5",
                secondary = "#8FA2FF",
                onSecondary = "#09123D",
                background = "#101319",
                onBackground = "#F0EEE9",
                surface = "#171C24",
                onSurface = "#F0EEE9",
                surfaceVariant = "#2A313D",
                onSurfaceVariant = "#C2C8D6",
                outline = "#7D8699",
            ),
            foundation = defaultFoundation(overlayAlpha = 0.22f).copy(
                typography = ThemeTypographyTokens(
                    titleSizeSp = 21,
                    titleWeight = 650,
                    bodySizeSp = 14,
                    bodyWeight = 420,
                    captionSizeSp = 12,
                    captionWeight = 550,
                ),
                shapes = ThemeShapeTokens(
                    cardCornerRadiusDp = 18,
                    mediaCornerRadiusDp = 14,
                    pillCornerRadiusDp = 999,
                ),
            ),
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
