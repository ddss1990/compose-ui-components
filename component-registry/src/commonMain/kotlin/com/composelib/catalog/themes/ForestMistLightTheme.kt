package com.composelib.catalog.themes

import com.composelib.catalog.MaterialColorTokens
import com.composelib.catalog.SemanticColorTokens
import com.composelib.catalog.ThemeColorTokens
import com.composelib.catalog.ThemeDefinition
import com.composelib.catalog.ThemeMode
import com.composelib.catalog.ThemeShapeTokens
import com.composelib.catalog.ThemeSpacingTokens
import com.composelib.catalog.defaultFoundation

val forestMistLightTheme = ThemeDefinition(
    key = "forest-mist-light",
    name = "Forest Mist Light",
    mode = ThemeMode.Light,
    description = "Soft natural palette with calm earthy accents.",
    colors = ThemeColorTokens(
        material = MaterialColorTokens(
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
        semantic = SemanticColorTokens(
            textPrimary = "#1E2A22",
            textSecondary = "#454F47",
            textTertiary = "#7A827A",
            textQuaternary = "#B1B7AF",
            textDisabled = "#A4AAA2",
            textHighlight = "#2D6A4F",
            textOnHighlight = "#FFFFFF",
            iconPrimary = "#1E2A22",
            iconSecondary = "#454F47",
            iconTertiary = "#7A827A",
            iconQuaternary = "#B1B7AF",
            errorRed = "#BA1A1A",
            errorRedContainer = "#FFDAD6",
            warningYellow = "#B8860B",
            warningOrange = "#FF6B00",
            warningOrangeContainer = "#FFE0C2",
            surfaceHighlight = "#2D6A4F",
            surfaceHighlightContainer = "#CFEBDC",
            divider = "#353F37",
            dividerVariant = "#546258",
            pressOverlay = "#1A000000",
        ),
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
)
