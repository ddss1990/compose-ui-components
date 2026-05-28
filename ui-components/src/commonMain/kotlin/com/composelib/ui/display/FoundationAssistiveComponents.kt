package com.composelib.ui.display

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composelib.ui.theme.LocalComposeLibTheme

enum class TagChipVariant {
    Neutral,
    Success,
    Warning,
}

@Composable
fun TagChip(
    text: String,
    variant: TagChipVariant,
    modifier: Modifier = Modifier,
) {
    val colors = MaterialTheme.colorScheme
    val theme = LocalComposeLibTheme.current
    val container = when (variant) {
        TagChipVariant.Neutral -> colors.surfaceVariant
        TagChipVariant.Success -> colors.primaryContainer
        TagChipVariant.Warning -> colors.secondaryContainer
    }
    val contentColor = when (variant) {
        TagChipVariant.Neutral -> colors.onSurfaceVariant
        TagChipVariant.Success -> colors.onPrimaryContainer
        TagChipVariant.Warning -> colors.onSecondaryContainer
    }

    Surface(
        modifier = modifier,
        color = container,
        contentColor = contentColor,
        shape = androidx.compose.foundation.shape.RoundedCornerShape(theme.foundation.shapes.pillCornerRadiusDp.dp),
    ) {
        Row(
            modifier = Modifier
                .defaultMinSize(minHeight = 24.dp)
                .padding(horizontal = theme.foundation.spacing.compactDp.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                text = text,
                textAlign = TextAlign.Center,
                fontSize = theme.foundation.typography.captionSizeSp.sp,
                fontWeight = FontWeight(theme.foundation.typography.captionWeight),
                maxLines = 1,
            )
        }
    }
}

@Composable
fun SectionHeader(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    action: (@Composable () -> Unit)? = null,
) {
    val colors = MaterialTheme.colorScheme
    val theme = LocalComposeLibTheme.current

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
            Text(
                text = title,
                color = colors.onSurface,
                fontSize = theme.foundation.typography.titleSizeSp.sp,
                fontWeight = FontWeight(theme.foundation.typography.titleWeight),
            )
            subtitle?.let {
                Text(
                    text = it,
                    color = colors.onSurfaceVariant,
                    fontSize = theme.foundation.typography.bodySizeSp.sp,
                    fontWeight = FontWeight(theme.foundation.typography.bodyWeight),
                )
            }
        }
        action?.invoke()
    }
}

@Composable
fun DividerText(
    text: String,
    modifier: Modifier = Modifier,
) {
    val colors = MaterialTheme.colorScheme
    val theme = LocalComposeLibTheme.current

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(theme.foundation.spacing.compactDp.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        HorizontalDivider(modifier = Modifier.weight(1f), color = colors.outline.copy(alpha = 0.35f))
        Text(
            text = text,
            color = colors.onSurfaceVariant,
            fontSize = theme.foundation.typography.captionSizeSp.sp,
            fontWeight = FontWeight(theme.foundation.typography.captionWeight),
            textAlign = TextAlign.Center,
            maxLines = 1,
            modifier = Modifier
                .defaultMinSize(minHeight = 20.dp),
        )
        HorizontalDivider(modifier = Modifier.weight(1f), color = colors.outline.copy(alpha = 0.35f))
    }
}
