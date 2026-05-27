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
        primary = colors.primary.toColor(),
        onPrimary = colors.onPrimary.toColor(),
        primaryContainer = colors.primaryContainer.toColor(),
        onPrimaryContainer = colors.onPrimaryContainer.toColor(),
        secondary = colors.secondary.toColor(),
        onSecondary = colors.onSecondary.toColor(),
        background = colors.background.toColor(),
        onBackground = colors.onBackground.toColor(),
        surface = colors.surface.toColor(),
        onSurface = colors.onSurface.toColor(),
        surfaceVariant = colors.surfaceVariant.toColor(),
        onSurfaceVariant = colors.onSurfaceVariant.toColor(),
        outline = colors.outline.toColor(),
    )

    ThemeMode.Dark -> darkColorScheme(
        primary = colors.primary.toColor(),
        onPrimary = colors.onPrimary.toColor(),
        primaryContainer = colors.primaryContainer.toColor(),
        onPrimaryContainer = colors.onPrimaryContainer.toColor(),
        secondary = colors.secondary.toColor(),
        onSecondary = colors.onSecondary.toColor(),
        background = colors.background.toColor(),
        onBackground = colors.onBackground.toColor(),
        surface = colors.surface.toColor(),
        onSurface = colors.onSurface.toColor(),
        surfaceVariant = colors.surfaceVariant.toColor(),
        onSurfaceVariant = colors.onSurfaceVariant.toColor(),
        outline = colors.outline.toColor(),
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
