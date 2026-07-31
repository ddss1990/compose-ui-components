package com.composelib.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.composelib.catalog.ThemeDefinition
import com.composelib.catalog.ThemeMode

val LocalComposeLibTheme = staticCompositionLocalOf<ThemeDefinition> {
    error("ComposeLibTheme was not provided")
}

fun ThemeDefinition.toMaterialColorScheme(): ColorScheme = when (mode) {
    ThemeMode.Light -> lightColorScheme(
        primary = colors.material.primary.toColor(),
        onPrimary = colors.material.onPrimary.toColor(),
        primaryContainer = colors.material.primaryContainer.toColor(),
        onPrimaryContainer = colors.material.onPrimaryContainer.toColor(),
        secondary = colors.material.secondary.toColor(),
        onSecondary = colors.material.onSecondary.toColor(),
        background = colors.material.background.toColor(),
        onBackground = colors.material.onBackground.toColor(),
        surface = colors.material.surface.toColor(),
        onSurface = colors.material.onSurface.toColor(),
        surfaceVariant = colors.material.surfaceVariant.toColor(),
        onSurfaceVariant = colors.material.onSurfaceVariant.toColor(),
        outline = colors.material.outline.toColor(),
        error = colors.semantic.errorRed.toColor(),
        errorContainer = colors.semantic.errorRedContainer.toColor(),
        tertiary = colors.semantic.surfaceHighlight.toColor(),
        tertiaryContainer = colors.semantic.surfaceHighlightContainer.toColor(),
    )

    ThemeMode.Dark -> darkColorScheme(
        primary = colors.material.primary.toColor(),
        onPrimary = colors.material.onPrimary.toColor(),
        primaryContainer = colors.material.primaryContainer.toColor(),
        onPrimaryContainer = colors.material.onPrimaryContainer.toColor(),
        secondary = colors.material.secondary.toColor(),
        onSecondary = colors.material.onSecondary.toColor(),
        background = colors.material.background.toColor(),
        onBackground = colors.material.onBackground.toColor(),
        surface = colors.material.surface.toColor(),
        onSurface = colors.material.onSurface.toColor(),
        surfaceVariant = colors.material.surfaceVariant.toColor(),
        onSurfaceVariant = colors.material.onSurfaceVariant.toColor(),
        outline = colors.material.outline.toColor(),
        error = colors.semantic.errorRed.toColor(),
        errorContainer = colors.semantic.errorRedContainer.toColor(),
        tertiary = colors.semantic.surfaceHighlight.toColor(),
        tertiaryContainer = colors.semantic.surfaceHighlightContainer.toColor(),
    )
}

@Composable
fun ComposeLibTheme(
    theme: ThemeDefinition,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalComposeLibTheme provides theme) {
        MaterialTheme(
            colorScheme = theme.toMaterialColorScheme(),
            content = content,
        )
    }
}

private fun String.toColor(): Color {
    val normalized = removePrefix("#")
    require(normalized.length == 6 || normalized.length == 8) {
        "Expected hex color in #RRGGBB or #AARRGGBB format, got '$this'"
    }
    val argb = normalized
        .let { if (it.length == 6) "FF$it" else it }
        .toLong(16)
    return Color(argb)
}
