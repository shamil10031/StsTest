package com.shomazzapp.ststest.layoutWrappers

import android.support.annotation.LayoutRes
import android.view.View
import com.shomazzapp.ststest.viewObjects.Vo
import java.io.Serializable

abstract class AbstractLayoutWrapper<T : Vo>(val viewObject: T) : Serializable {
    //не очень хорошее название (мне кжается wrapper - не совсем о том, что нужно, но ладно)

    @LayoutRes
    abstract fun getResourceId(): Int

    //в этом методе все сеттингы и все заполнение лэйаута
    abstract fun onViewCreated(view: View)

}