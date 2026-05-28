package com.composelib.ui.input

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton as MaterialTextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composelib.ui.theme.LocalComposeLibTheme

enum class FoundationButtonSize {
    Medium,
    Large,
}

@Immutable
data class FoundationButtonState(
    val enabled: Boolean = true,
    val loading: Boolean = false,
    val size: FoundationButtonSize = FoundationButtonSize.Medium,
) {
    val interactive: Boolean get() = enabled && !loading
}

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: FoundationButtonState = FoundationButtonState(),
) {
    Button(
        onClick = onClick,
        enabled = state.interactive,
        modifier = modifier
            .defaultMinSize(minHeight = buttonHeight(state.size))
            .padding(horizontal = buttonHorizontalPadding()),
        contentPadding = ButtonDefaults.ContentPadding,
    ) {
        FoundationButtonContent(text = text, state = state)
    }
}

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: FoundationButtonState = FoundationButtonState(),
) {
    OutlinedButton(
        onClick = onClick,
        enabled = state.interactive,
        modifier = modifier
            .defaultMinSize(minHeight = buttonHeight(state.size))
            .padding(horizontal = buttonHorizontalPadding()),
        contentPadding = ButtonDefaults.ContentPadding,
    ) {
        FoundationButtonContent(text = text, state = state)
    }
}

@Composable
fun TextButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: FoundationButtonState = FoundationButtonState(),
) {
    MaterialTextButton(
        onClick = onClick,
        enabled = state.interactive,
        modifier = modifier
            .defaultMinSize(minHeight = buttonHeight(state.size))
            .padding(horizontal = buttonHorizontalPadding()),
        contentPadding = ButtonDefaults.TextButtonContentPadding,
    ) {
        FoundationButtonContent(text = text, state = state)
    }
}

@Composable
private fun FoundationButtonContent(
    text: String,
    state: FoundationButtonState,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (state.loading) {
            CircularProgressIndicator(
                modifier = Modifier.size(16.dp),
                strokeWidth = 2.dp,
            )
        }
        Text(text = text)
    }
}

@Composable
private fun buttonHeight(size: FoundationButtonSize) = when (size) {
    FoundationButtonSize.Medium -> 40.dp
    FoundationButtonSize.Large -> 48.dp
}

@Composable
private fun buttonHorizontalPadding() = LocalComposeLibTheme.current.foundation.spacing.compactDp.dp / 2

