package com.example.song.reducelayouthierarchy

import android.animation.LayoutTransition
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

/**
 * @package com.example.song.reducelayouthierarchy
 * @fileName NewCustomItem
 * @date on 5/30/2020 7:16 PM
 * @author Listensong
 * @desc TODO
 * @email No
 */
class NewCustomItem: ConstraintLayout {

    private var titleTextView: TextView? = null

    constructor(context: Context): super(context) {
        initStyle(context, null, 0)
    }

    constructor(context: Context,
                attributeSet: AttributeSet?
    ): super(context, attributeSet) {
        initStyle(context, attributeSet, 0)
    }

    constructor(context: Context,
                attributeSet: AttributeSet?,
                defStyleAttr: Int
    ): super(context, attributeSet, defStyleAttr) {
        initStyle(context, attributeSet, defStyleAttr)
    }

    @Suppress("UNUSED_PARAMETER")
    private fun initStyle(context: Context,
                          attrs: AttributeSet?,
                          defStyleAttr: Int) {
        setWillNotDraw(false)
        layoutTransition = LayoutTransition().apply {
            enableTransitionType(LayoutTransition.CHANGE_APPEARING)
        }
        applyLayoutFromXml()
    }

    private fun applyLayoutFromXml() {
        val view = View.inflate(context, R.layout.layout_old_custom_item, null)
        if (view is ConstraintLayout) {
            val titleView = view.findViewById<TextView>(R.id.tv_old_item)

            view.removeView(titleView)
            this.addView(titleView)
            this.titleTextView = titleView
            this.titleTextView?.text = "这是NewCustomItem"
        }
    }
}