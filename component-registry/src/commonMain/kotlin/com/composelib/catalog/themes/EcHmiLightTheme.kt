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

val ecHmiLightTheme = ThemeDefinition(
    key = "ec-hmi-light",
    name = "EC HMI Light",
    mode = ThemeMode.Light,
    description = "Automotive HMI light theme — iOS-style neutral grey system with blue accent.",
    colors = ThemeColorTokens(
        material = MaterialColorTokens(
            primary = "#0088FF",
            onPrimary = "#FFFFFF",
            primaryContainer = "#D6ECFF",
            onPrimaryContainer = "#001D36",
            secondary = "#787880",
            onSecondary = "#FFFFFF",
            background = "#FFFFFF",
            onBackground = "#000000",
            surface = "#F2F2F7",
            onSurface = "#000000",
            surfaceVariant = "#E5E5EA",
            onSurfaceVariant = "#48484A",
            outline = "#8E8E93",
        ),
        semantic = SemanticColorTokens(
            textPrimary = "#FF000000",
            textSecondary = "#D9000000",
            textTertiary = "#99000000",
            textQuaternary = "#40000000",
            textDisabled = "#4D000000",
            textHighlight = "#FF0088FF",
            textOnHighlight = "#FFFFFFFF",
            iconPrimary = "#FF000000",
            iconSecondary = "#D9000000",
            iconTertiary = "#99000000",
            iconQuaternary = "#40000000",
            errorRed = "#FF3B30",
            errorRedContainer = "#FFDAD6",
            warningYellow = "#B8860B",
            warningOrange = "#FF6B00",
            warningOrangeContainer = "#FFE0C2",
            surfaceHighlight = "#FF0088FF",
            surfaceHighlightContainer = "#FFD6ECFF",
            divider = "#33787880",
            dividerVariant = "#52787880",
            pressOverlay = "#1A000000",
        ),
    ),
    foundation = defaultFoundation(overlayAlpha = 0.15f).copy(
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
