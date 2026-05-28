package com.composelib.ui.media

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.composelib.ui.theme.LocalComposeLibTheme

enum class CircularImageStyle {
    Plain,
    Bordered,
    Elevated,
    StatusRing,
}

object CircularImageDefaults {
    val style: CircularImageStyle = CircularImageStyle.Plain
}

@Composable
fun CircularImage(
    painter: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier,
    style: CircularImageStyle = CircularImageDefaults.style,
) {
    val colors = MaterialTheme.colorScheme
    val theme = LocalComposeLibTheme.current

    val styledModifier = when (style) {
        CircularImageStyle.Plain -> modifier
        CircularImageStyle.Bordered -> modifier.border(1.dp, colors.outline.copy(alpha = 0.48f), CircleShape)
        CircularImageStyle.Elevated -> modifier.shadow(6.dp, CircleShape)
        CircularImageStyle.StatusRing -> modifier.border(
            width = 2.dp,
            color = colors.primary.copy(alpha = theme.foundation.media.overlayAlpha + 0.3f),
            shape = CircleShape,
        )
    }

    Image(
        painter = painter,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = styledModifier
            .size(56.dp)
            .clip(CircleShape),
    )
}

@Composable
fun CircularImage(
    imageBitmap: ImageBitmap,
    contentDescription: String,
    modifier: Modifier = Modifier,
    style: CircularImageStyle = CircularImageDefaults.style,
) {
    CircularImage(
        painter = BitmapPainter(imageBitmap),
        contentDescription = contentDescription,
        modifier = modifier,
        style = style,
    )
}

@Composable
fun RectangularImage(
    painter: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier,
    cornerRadiusDp: Int = 12,
    aspectRatio: Float = 4f / 3f,
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(aspectRatio)
            .clip(RoundedCornerShape(cornerRadiusDp.dp)),
    )
}

@Composable
fun RectangularImage(
    imageBitmap: ImageBitmap,
    contentDescription: String,
    modifier: Modifier = Modifier,
    cornerRadiusDp: Int = 12,
    aspectRatio: Float = 4f / 3f,
) {
    RectangularImage(
        painter = BitmapPainter(imageBitmap),
        contentDescription = contentDescription,
        modifier = modifier,
        cornerRadiusDp = cornerRadiusDp,
        aspectRatio = aspectRatio,
    )
}

