package com.composelib.catalog.themes

import com.composelib.catalog.MaterialColorTokens
import com.composelib.catalog.SemanticColorTokens
import com.composelib.catalog.ThemeColorTokens
import com.composelib.catalog.ThemeDefinition
import com.composelib.catalog.ThemeMode
import com.composelib.catalog.ThemeShapeTokens
import com.composelib.catalog.ThemeTypographyTokens
import com.composelib.catalog.defaultFoundation

val imperialLuxDarkTheme = ThemeDefinition(
    key = "imperial-lux-dark",
    name = "Imperial Lux Dark",
    mode = ThemeMode.Dark,
    description = "Luxury editorial dark mode with deep navy and gold accents.",
    colors = ThemeColorTokens(
        material = MaterialColorTokens(
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
        semantic = SemanticColorTokens(
            textPrimary = "#F0EEE9",
            textSecondary = "#CCCAC5",
            textTertiary = "#979591",
            textQuaternary = "#63615E",
            textDisabled = "#6E6C68",
            textHighlight = "#D4AF37",
            textOnHighlight = "#1E1500",
            iconPrimary = "#F0EEE9",
            iconSecondary = "#CCCAC5",
            iconTertiary = "#979591",
            iconQuaternary = "#63615E",
            errorRed = "#FFB4AB",
            errorRedContainer = "#93000A",
            warningYellow = "#FFCC00",
            warningOrange = "#FF9F0A",
            warningOrangeContainer = "#663C00",
            surfaceHighlight = "#D4AF37",
            surfaceHighlightContainer = "#4A3A10",
            divider = "#474C55",
            dividerVariant = "#7D8699",
            pressOverlay = "#1A000000",
        ),
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
)
