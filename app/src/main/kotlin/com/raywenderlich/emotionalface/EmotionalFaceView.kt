package com.raywenderlich.emotionalface

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class EmotionalFaceView(context: Context, attrs: AttributeSet) : View(context, attrs)
{
	private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

	private var faceColor = Color.YELLOW
	private val eyesColor = Color.BLACK
	private val mouthColor = Color.BLACK
	private val borderColor = Color.BLACK
	private var borderWidth = 4.0f
	private var size = 320


	override fun onDraw(canvas: Canvas){
		super.onDraw(canvas)

		drawFaceBackground(canvas)
		drawEyes(canvas)
		drawMounth(canvas)
	}

	private fun drawFaceBackground(canvas:Canvas) {
		paint.color = faceColor
		paint.style = Paint.Style.FILL

		val radius = size / 2f

		canvas.drawCircle(size / 2f, size / 2f, radius, paint)

		paint.color = borderColor
		paint.style = Paint.Style.STROKE
		paint.strokeWidth = borderWidth

		canvas.drawCircle(size/2f, size/2f, radius - borderWidth / 2f, paint)
	}

	private fun drawEyes(canvas:Canvas) {
	}

	private fun drawMounth(canvas: Canvas) {
	}
}
