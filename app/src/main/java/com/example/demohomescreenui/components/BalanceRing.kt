package com.example.demohomescreenui.components
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.Color
import com.example.demohomescreenui.model.RingSegment

@Composable
fun BalanceRing(
    modifier: Modifier = Modifier,
    segments: List<RingSegment>,
    strokeWidth: Float = 12f
) {
    Canvas(modifier = modifier.size(95.dp)) {

        val total = segments.sumOf { it.value.toDouble() }.toFloat()
        var startAngle = -90f  // start from top

        segments.forEach { segment ->
            val sweepAngle = (segment.value / total) * 360f

            drawArc(
                color = segment.color,
                startAngle = startAngle,
                sweepAngle = sweepAngle,
                useCenter = false,
                style = Stroke(
                    width = strokeWidth,
                    cap = StrokeCap.Round
                )
            )

            startAngle += sweepAngle
        }
    }
}