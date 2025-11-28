package com.sarang.torang.di.bottomsheet_di

import androidx.compose.runtime.Composable
import com.sarang.torang.compose.bottomsheet.feed.FeedMenuModalBottomSheet
import com.sarang.torang.dialogsbox.compose.type.MenuBottomSheetTypeData

fun provideFeedMenuBottomSheetDialog(): @Composable (MenuBottomSheetTypeData) -> Unit =
    {
        FeedMenuModalBottomSheet(
            isExpand = true,
            reviewId = it.reviewId,
            onReport = { it.onReport.invoke(it.reviewId) },
            onDelete = { it.onDelete.invoke(it.reviewId) },
            onEdit = { it.onEdit.invoke(it.reviewId) },
            onClose = it.onClose
        )
    }