package com.sarang.torang.di.bottomsheet_di

import com.sarang.torang.compose.bottomsheet.share.components.ShareImageLoadType
import com.sarang.torang.di.image.provideTorangAsyncImage

val CustomShareImageLoader : ShareImageLoadType = {
    provideTorangAsyncImage().invoke(
        it.modifier,
        it.model.toString(),
        it.width,
        it.height,
        it.contentScale
    )
}