package com.gfd.music.entity

import com.gfd.common.ui.adapter.MultiItemEntity

data class RadioData(var type: Int, var logo: String, var title: String,
                     var name: String, var count: String, var avatar: String = "", var id: Int = 0,var color:Int = 0) : MultiItemEntity {
    override fun getItemType(): Int {
        return type
    }

}