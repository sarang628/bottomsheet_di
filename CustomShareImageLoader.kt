package com.sarang.torang.di.bottomsheet_di

import androidx.compose.ui.unit.dp
import com.sarang.torang.compose.bottomsheet.share.components.ShareImageLoadType
import com.sarang.torang.di.image.TorangAsyncImageData
import com.sarang.torang.di.image.provideTorangAsyncImage

val CustomShareImageLoader : ShareImageLoadType = {
    provideTorangAsyncImage().invoke(
        TorangAsyncImageData(
            it.modifier,
            it.model.toString(),
            it.width ?: 30.dp,
            it.height ?: 30.dp,
            it.contentScale
        )
    )
}