package com.example.song.reducelayouthierarchy

import android.animation.LayoutTransition
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

/**
 * @package com.example.song.reducelayouthierarchy
 * @fileName OldCustomItem
 * @date on 5/30/2020 6:56 PM
 * @author Listensong
 * @desc TODO
 * @email No
 */
class OldCustomItem: ConstraintLayout {

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
        initCustomView()
    }

    private fun initCustomView() {
        LayoutInflater.from(context).inflate(R.layout.layout_old_custom_item, this)
        titleTextView = findViewById(R.id.tv_old_item)
        titleTextView?.text = "这是OldCustomItem"
    }
}