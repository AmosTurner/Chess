package ca.sheridancollege.chess

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class View(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private final val xCoordinate = 20f
    private final val yCoordinate = 200f
    private final val cellSide = 130f

    override fun onDraw(canvas: Canvas?) {
        // Paint specifies what to draw
        val paint = Paint()

        for (i in 0..7) {
            for (j in 0..7) {
                paint.color = if ((i + j) % 2 == 1) Color.DKGRAY else Color.LTGRAY
                canvas?.drawRect(
                    xCoordinate + i * cellSide,
                    yCoordinate + j * cellSide,
                    xCoordinate + (i + 1) * cellSide,
                    yCoordinate + (j + 1) * cellSide,
                    paint
                )
            }
        }
    }
}