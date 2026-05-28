package com.composelib.ui.text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composelib.ui.theme.LocalComposeLibTheme

object PrimarySecondaryTextDefaults {
    const val enabled: Boolean = true
}

@Composable
fun PrimarySecondaryTextRow(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = PrimarySecondaryTextDefaults.enabled,
    trailing: (@Composable () -> Unit)? = null,
) {
    val colors = MaterialTheme.colorScheme
    val theme = LocalComposeLibTheme.current
    val titleColor = if (enabled) colors.onSurface else colors.onSurface.copy(alpha = 0.42f)
    val subtitleColor = if (enabled) colors.onSurfaceVariant else colors.onSurfaceVariant.copy(alpha = 0.42f)

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = theme.foundation.spacing.compactDp.dp / 2),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(2.dp),
            modifier = Modifier.weight(1f),
        ) {
            Text(
                text = title,
                color = titleColor,
                fontSize = theme.foundation.typography.bodySizeSp.sp,
                fontWeight = FontWeight(theme.foundation.typography.titleWeight),
            )
            Text(
                text = subtitle,
                color = subtitleColor,
                fontSize = theme.foundation.typography.captionSizeSp.sp,
                fontWeight = FontWeight(theme.foundation.typography.bodyWeight),
            )
        }
        trailing?.invoke()
    }
}
