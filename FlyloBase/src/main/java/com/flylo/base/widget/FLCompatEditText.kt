package com.flylo.base.widget

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView

/**
 *
 * @ProjectName:    FlyloKotlinAndroid
 * @Package:        com.flylo.base.widget
 * @ClassName:      FLImageView
 * @Author:         ANWEN
 * @CreateDate:     2020/6/14 2:41 PM
 * @UpdateUser:
 * @UpdateDate:     2020/6/14 2:41 PM
 * @UpdateRemark:
 * @Version:
 */
internal class FLCompatEditText : AppCompatEditText {

    constructor(context: Context?) : super(context!!)

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!,
        attrs
    )

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context!!, attrs, defStyleAttr)
}