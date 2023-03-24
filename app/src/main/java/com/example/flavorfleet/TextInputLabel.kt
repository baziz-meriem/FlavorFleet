package com.example.flavorfleet

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

@SuppressLint("ResourceAsColor")
class TextInputLabel @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    init {
        context.theme.obtainStyledAttributes(
            attrs, R.styleable.TextInputLabel, 0, 0
        ).apply {
            try {
                val labelText = getString(R.styleable.TextInputLabel_labelText)
                val labelTextColor = getColor(R.styleable.TextInputLabel_labelTextColor,Color.DKGRAY )
                val labelTextSize = getDimension(R.styleable.TextInputLabel_labelTextSize, 16f)

                text = labelText
                setTextColor(labelTextColor)
                textSize = labelTextSize / resources.displayMetrics.density
                typeface = Typeface.createFromAsset(
                    context.assets,
                    "font/Quicksand-Bold.ttf"
                )
            } finally {
                recycle()
            }
        }
    }
}
