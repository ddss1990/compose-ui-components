package com.composelib.catalog.themes

import com.composelib.catalog.MaterialColorTokens
import com.composelib.catalog.SemanticColorTokens
import com.composelib.catalog.ThemeColorTokens
import com.composelib.catalog.ThemeDefinition
import com.composelib.catalog.ThemeMode
import com.composelib.catalog.ThemeShapeTokens
import com.composelib.catalog.ThemeTypographyTokens
import com.composelib.catalog.defaultFoundation

val neonArcadeDarkTheme = ThemeDefinition(
    key = "neon-arcade-dark",
    name = "Neon Arcade Dark",
    mode = ThemeMode.Dark,
    description = "High-energy cyber palette with sharp neon contrast.",
    colors = ThemeColorTokens(
        material = MaterialColorTokens(
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
        semantic = SemanticColorTokens(
            textPrimary = "#EAF3FF",
            textSecondary = "#C7D0DB",
            textTertiary = "#959DA7",
            textQuaternary = "#626972",
            textDisabled = "#6C737D",
            textHighlight = "#33F1FF",
            textOnHighlight = "#001519",
            iconPrimary = "#EAF3FF",
            iconSecondary = "#C7D0DB",
            iconTertiary = "#959DA7",
            iconQuaternary = "#626972",
            errorRed = "#FFB4AB",
            errorRedContainer = "#93000A",
            warningYellow = "#FFCC00",
            warningOrange = "#FF9F0A",
            warningOrangeContainer = "#663C00",
            surfaceHighlight = "#33F1FF",
            surfaceHighlightContainer = "#01333A",
            divider = "#3A3B4D",
            dividerVariant = "#5D6790",
            pressOverlay = "#1A000000",
        ),
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
)
