package com.varol.boynews.util.listener

import android.view.View

interface ItemClickListener<ModelType> {
    fun onItemClick(view: View, item: ModelType, position: Int)
}