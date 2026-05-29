package com.composelib.ui.wrapped

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.composelib.catalog.ThemeCatalog
import com.composelib.ui.input.PrimaryButton
import com.composelib.ui.theme.ComposeLibTheme

@Composable
fun ScaffoldWrappedRootScreen(
    greetingText: String,
    modifier: Modifier = Modifier,
) {
    ComposeLibTheme(theme = wrappedScreenDefaultTheme()) {
        ScaffoldWrappedRootScreenContent(
            greetingText = greetingText,
            modifier = modifier,
        )
    }
}

internal fun wrappedScreenDefaultTheme() = ThemeCatalog.defaultThemes().first()

@Composable
private fun ScaffoldWrappedRootScreenContent(
    greetingText: String,
    modifier: Modifier = Modifier,
) {
    var showContent by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .background(MaterialTheme.colorScheme.primaryContainer)
            .safeContentPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        PrimaryButton(
            text = "Click me!",
            onClick = { showContent = !showContent },
        )

        AnimatedVisibility(visible = showContent) {
            WrappedGreetingContent(greetingText = greetingText)
        }
    }
}

@Composable
internal fun WrappedGreetingContent(
    greetingText: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        DecorativeComposeImage()
        Text(text = "Compose: $greetingText")
    }
}

@Composable
private fun DecorativeComposeImage(
    modifier: Modifier = Modifier,
) {
    val colors = MaterialTheme.colorScheme
    Canvas(
        modifier = modifier
            .size(120.dp)
            .padding(bottom = 12.dp),
    ) {
        drawRoundRect(
            color = colors.surface,
            cornerRadius = CornerRadius(20.dp.toPx(), 20.dp.toPx()),
        )
        drawRoundRect(
            color = colors.primary.copy(alpha = 0.3f),
            cornerRadius = CornerRadius(20.dp.toPx(), 20.dp.toPx()),
            style = Stroke(width = 4.dp.toPx()),
        )
        drawCircle(
            color = colors.primary,
            radius = 18.dp.toPx(),
            center = Offset(size.width * 0.35f, size.height * 0.42f),
        )
        drawCircle(
            color = colors.secondary,
            radius = 14.dp.toPx(),
            center = Offset(size.width * 0.62f, size.height * 0.6f),
        )
    }
}
