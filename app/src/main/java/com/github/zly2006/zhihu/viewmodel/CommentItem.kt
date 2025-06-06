package com.github.zly2006.zhihu.viewmodel

import com.github.zly2006.zhihu.CommentHolder
import com.github.zly2006.zhihu.data.DataHolder

data class CommentItem(
    val item: DataHolder.Comment,
    val clickTarget: CommentHolder?
)
