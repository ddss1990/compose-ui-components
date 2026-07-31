package com.composelib.catalog.themes

import com.composelib.catalog.MaterialColorTokens
import com.composelib.catalog.SemanticColorTokens
import com.composelib.catalog.ThemeColorTokens
import com.composelib.catalog.ThemeDefinition
import com.composelib.catalog.ThemeMode
import com.composelib.catalog.defaultFoundation

val editorialDarkTheme = ThemeDefinition(
    key = "editorial-dark",
    name = "Editorial Dark",
    mode = ThemeMode.Dark,
    description = "Low-light editorial theme with softened contrast.",
    colors = ThemeColorTokens(
        material = MaterialColorTokens(
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
        semantic = SemanticColorTokens(
            textPrimary = "#F2ECE2",
            textSecondary = "#CFC9C0",
            textTertiary = "#9A938A",
            textQuaternary = "#666059",
            textDisabled = "#706A62",
            textHighlight = "#A7C4DD",
            textOnHighlight = "#0B1D2D",
            iconPrimary = "#F2ECE2",
            iconSecondary = "#CFC9C0",
            iconTertiary = "#9A938A",
            iconQuaternary = "#666059",
            errorRed = "#FFB4AB",
            errorRedContainer = "#93000A",
            warningYellow = "#FFCC00",
            warningOrange = "#FF9F0A",
            warningOrangeContainer = "#663C00",
            surfaceHighlight = "#A7C4DD",
            surfaceHighlightContainer = "#183247",
            divider = "#645D55",
            dividerVariant = "#8E877E",
            pressOverlay = "#1A000000",
        ),
    ),
    foundation = defaultFoundation(overlayAlpha = 0.18f),
)
