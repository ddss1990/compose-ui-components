package com.composelib.ui.display

import androidx.compose.foundation.background
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composelib.catalog.ThemeDefinition
import com.composelib.ui.theme.LocalComposeLibTheme

data class InfoDisplayCardData(
    val eyebrow: String? = null,
    val title: String,
    val body: String,
    val metadata: List<String> = emptyList(),
    val mediaLabel: String? = null,
)

object InfoDisplayCardDefaults {
    val sample = InfoDisplayCardData(
        eyebrow = "Product update",
        title = "Editorial summaries stay readable at a glance",
        body = "A compact media block and restrained text stack keep important information easy to scan in both dark and light themes.",
        metadata = listOf("Design system", "Preview ready", "Responsive"),
        mediaLabel = "Preview image",
    )
}

@Composable
fun InfoDisplayCard(
    data: InfoDisplayCardData,
    modifier: Modifier = Modifier,
    mediaContent: @Composable (() -> Unit)? = null,
) {
    val theme = LocalComposeLibTheme.current
    val colors = MaterialTheme.colorScheme
    val shape = RoundedCornerShape(theme.foundation.shapes.cardCornerRadiusDp.dp)
    val mediaShape = RoundedCornerShape(
        topStart = theme.foundation.shapes.mediaCornerRadiusDp.dp,
        topEnd = theme.foundation.shapes.mediaCornerRadiusDp.dp,
    )
    val padding = theme.foundation.spacing.regularDp.dp
    val compactPadding = theme.foundation.spacing.compactDp.dp
    val sectionSpacing = theme.foundation.spacing.sectionDp.dp

    Card(
        modifier = modifier,
        shape = shape,
        colors = CardDefaults.cardColors(containerColor = colors.surface),
        border = BorderStroke(1.dp, colors.outline.copy(alpha = 0.18f)),
    ) {
        Column {
            if (mediaContent != null || data.mediaLabel != null) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(theme.foundation.media.heroAspectRatio)
                        .clip(mediaShape)
                        .background(
                            Brush.linearGradient(
                                listOf(
                                    colors.primaryContainer,
                                    colors.surfaceVariant,
                                ),
                            ),
                        ),
                    contentAlignment = Alignment.BottomStart,
                ) {
                    if (mediaContent != null) {
                        mediaContent()
                    } else {
                        DefaultMediaPlaceholder(
                            label = data.mediaLabel.orEmpty(),
                            theme = theme,
                            modifier = Modifier.fillMaxWidth(),
                        )
                    }
                }
            }

            Column(
                modifier = Modifier.padding(all = padding),
                verticalArrangement = Arrangement.spacedBy(compactPadding),
            ) {
                data.eyebrow?.let { eyebrow ->
                    Text(
                        text = eyebrow.uppercase(),
                        color = colors.primary,
                        fontSize = theme.foundation.typography.captionSizeSp.sp,
                        fontWeight = FontWeight(theme.foundation.typography.captionWeight),
                        letterSpacing = 1.1.sp,
                    )
                }

                Text(
                    text = data.title,
                    color = colors.onSurface,
                    fontSize = theme.foundation.typography.titleSizeSp.sp,
                    fontWeight = FontWeight(theme.foundation.typography.titleWeight),
                    lineHeight = (theme.foundation.typography.titleSizeSp + 8).sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )

                Text(
                    text = data.body,
                    color = colors.onSurfaceVariant,
                    fontSize = theme.foundation.typography.bodySizeSp.sp,
                    fontWeight = FontWeight(theme.foundation.typography.bodyWeight),
                    lineHeight = (theme.foundation.typography.bodySizeSp + 6).sp,
                )

                if (data.metadata.isNotEmpty()) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(compactPadding),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        data.metadata.forEach { tag ->
                            Surface(
                                shape = RoundedCornerShape(theme.foundation.shapes.pillCornerRadiusDp.dp),
                                color = colors.surfaceVariant.copy(alpha = 0.65f),
                                contentColor = colors.onSurfaceVariant,
                            ) {
                                Text(
                                    text = tag,
                                    modifier = Modifier.padding(
                                        horizontal = compactPadding,
                                        vertical = compactPadding / 2,
                                    ),
                                    fontSize = theme.foundation.typography.captionSizeSp.sp,
                                    fontWeight = FontWeight(theme.foundation.typography.captionWeight),
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.size(sectionSpacing - compactPadding))
            }
        }
    }
}

@Composable
private fun DefaultMediaPlaceholder(
    label: String,
    theme: ThemeDefinition,
    modifier: Modifier = Modifier,
) {
    val colors = MaterialTheme.colorScheme

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(theme.foundation.spacing.regularDp.dp),
        contentAlignment = Alignment.BottomStart,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(theme.foundation.media.thumbnailAspectRatio)
                .clip(RoundedCornerShape(theme.foundation.shapes.mediaCornerRadiusDp.dp))
                .background(
                    Brush.linearGradient(
                        listOf(
                            colors.primary,
                            colors.primaryContainer,
                            colors.surfaceVariant,
                        ),
                    ),
                )
                .border(
                    width = 1.dp,
                    color = Color.White.copy(alpha = theme.foundation.media.overlayAlpha),
                    shape = RoundedCornerShape(theme.foundation.shapes.mediaCornerRadiusDp.dp),
                ),
            contentAlignment = Alignment.Center,
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(Color.White.copy(alpha = 0.22f)),
                )
                Spacer(modifier = Modifier.size(theme.foundation.spacing.compactDp.dp))
                Text(
                    text = label,
                    color = colors.onPrimary,
                    fontSize = theme.foundation.typography.captionSizeSp.sp,
                    fontWeight = FontWeight(theme.foundation.typography.captionWeight),
                )
            }
        }
    }
}
