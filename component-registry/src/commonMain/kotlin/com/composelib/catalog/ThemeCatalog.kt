package com.composelib.catalog

import com.composelib.catalog.themes.ecHmiDarkTheme
import com.composelib.catalog.themes.ecHmiLightTheme
import com.composelib.catalog.themes.editorialDarkTheme
import com.composelib.catalog.themes.editorialLightTheme
import com.composelib.catalog.themes.forestMistLightTheme
import com.composelib.catalog.themes.imperialLuxDarkTheme
import com.composelib.catalog.themes.neonArcadeDarkTheme

enum class ThemeMode {
    Light,
    Dark,
}

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
        editorialLightTheme,
        editorialDarkTheme,
        neonArcadeDarkTheme,
        forestMistLightTheme,
        imperialLuxDarkTheme,
        ecHmiLightTheme,
        ecHmiDarkTheme,
    )
}

fun defaultFoundation(
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

/**
 * Alpha-composite [fg] over [bg] at the given opacity.
 *
 * Both colors must be in `#RRGGBB` format. Returns a `#RRGGBB` string with the
 * pre-multiplied result, useful for computing semantic token defaults from a
 * theme's base palette.
 */
fun blend(fg: String, bg: String, fgAlpha: Float): String {
    val fgR = fg.substring(1, 3).toInt(16)
    val fgG = fg.substring(3, 5).toInt(16)
    val fgB = fg.substring(5, 7).toInt(16)
    val bgR = bg.substring(1, 3).toInt(16)
    val bgG = bg.substring(3, 5).toInt(16)
    val bgB = bg.substring(5, 7).toInt(16)
    val a = fgAlpha.coerceIn(0f, 1f)
    val r = (fgR * a + bgR * (1 - a)).toInt().coerceIn(0, 255)
    val g = (fgG * a + bgG * (1 - a)).toInt().coerceIn(0, 255)
    val b = (fgB * a + bgB * (1 - a)).toInt().coerceIn(0, 255)
    return "#" +
        r.toString(16).padStart(2, '0').uppercase() +
        g.toString(16).padStart(2, '0').uppercase() +
        b.toString(16).padStart(2, '0').uppercase()
}
