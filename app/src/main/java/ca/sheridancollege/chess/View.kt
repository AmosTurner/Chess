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

        for (j in 0..3) {
            for (i in 0..3) {
                paint.color = Color.LTGRAY
                canvas?.drawRect(
                    xCoordinate + 2 * i * cellSide,
                    yCoordinate + 2 * j * cellSide,
                    xCoordinate + (2 * i + 1) * cellSide,
                    yCoordinate + (2 * j + 1) * cellSide,
                    paint
                )
                canvas?.drawRect(
                    xCoordinate + (2 * i + 1) * cellSide,
                    yCoordinate + (2 * j + 1) * cellSide,
                    xCoordinate + (2 * i + 2) * cellSide,
                    yCoordinate + (2 * j + 2) * cellSide,
                    paint
                )

                paint.color = Color.DKGRAY
                canvas?.drawRect(
                    xCoordinate + (2 * i + 1) * cellSide,
                    yCoordinate + 2 * j * cellSide,
                    xCoordinate + (2 * i + 2) * cellSide,
                    yCoordinate + (2 * j + 1) * cellSide,
                    paint
                )
                canvas?.drawRect(
                    xCoordinate + (2 * i) * cellSide,
                    yCoordinate + (2 * j + 1) * cellSide,
                    xCoordinate + (2 * i + 1) * cellSide,
                    yCoordinate + (2 * j + 2) * cellSide,
                    paint
                )
            }
        }
    }
}