package com.composelib.catalog.themes

import com.composelib.catalog.MaterialColorTokens
import com.composelib.catalog.SemanticColorTokens
import com.composelib.catalog.ThemeColorTokens
import com.composelib.catalog.ThemeDefinition
import com.composelib.catalog.ThemeMode
import com.composelib.catalog.ThemeShapeTokens
import com.composelib.catalog.ThemeSpacingTokens
import com.composelib.catalog.ThemeTypographyTokens
import com.composelib.catalog.defaultFoundation

val ecHmiDarkTheme = ThemeDefinition(
    key = "ec-hmi-dark",
    name = "EC HMI Dark",
    mode = ThemeMode.Dark,
    description = "Automotive HMI dark theme — neutral grey system with bright blue accent for low-light driving.",
    colors = ThemeColorTokens(
        material = MaterialColorTokens(
            primary = "#0091FF",
            onPrimary = "#001D36",
            primaryContainer = "#00325A",
            onPrimaryContainer = "#D6ECFF",
            secondary = "#787880",
            onSecondary = "#FFFFFF",
            background = "#000000",
            onBackground = "#FFFFFF",
            surface = "#1C1C1E",
            onSurface = "#FFFFFF",
            surfaceVariant = "#2C2C2E",
            onSurfaceVariant = "#AEAEB2",
            outline = "#636366",
        ),
        semantic = SemanticColorTokens(
            textPrimary = "#FFFFFFFF",
            textSecondary = "#E6FFFFFF",
            textTertiary = "#99FFFFFF",
            textQuaternary = "#40FFFFFF",
            textDisabled = "#4DFFFFFF",
            textHighlight = "#FF0091FF",
            textOnHighlight = "#FFFFFFFF",
            iconPrimary = "#FFFFFFFF",
            iconSecondary = "#E6FFFFFF",
            iconTertiary = "#99FFFFFF",
            iconQuaternary = "#40FFFFFF",
            errorRed = "#FF453A",
            errorRedContainer = "#93000A",
            warningYellow = "#FFCC00",
            warningOrange = "#FF9F0A",
            warningOrangeContainer = "#663C00",
            surfaceHighlight = "#FF0091FF",
            surfaceHighlightContainer = "#FF00325A",
            divider = "#52787880",
            dividerVariant = "#52787880",
            pressOverlay = "#1A000000",
        ),
    ),
    foundation = defaultFoundation(overlayAlpha = 0.25f).copy(
        typography = ThemeTypographyTokens(
            titleSizeSp = 22,
            titleWeight = 600,
            bodySizeSp = 16,
            bodyWeight = 300,
            captionSizeSp = 12,
            captionWeight = 300,
        ),
        spacing = ThemeSpacingTokens(
            compactDp = 10,
            regularDp = 16,
            spaciousDp = 20,
            sectionDp = 28,
        ),
        shapes = ThemeShapeTokens(
            cardCornerRadiusDp = 24,
            mediaCornerRadiusDp = 18,
            pillCornerRadiusDp = 999,
        ),
    ),
)
