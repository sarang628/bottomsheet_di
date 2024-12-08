package com.sarang.torang.di.bottomsheet_di

import androidx.compose.runtime.Composable
import com.sarang.torang.compose.bottomsheet.feed.FeedMenuBottomSheetDialog

fun provideFeedMenuBottomSheetDialog(): @Composable (reviewId: Int, onClose: () -> Unit, onReport: (Int) -> Unit, onDelete: (Int) -> Unit, onEdit: (Int) -> Unit) -> Unit =
    { reviewId, onClose, onReport, onDelete, onEdit ->
        FeedMenuBottomSheetDialog(
            isExpand = true,
            reviewId = reviewId,
            onReport = { onReport.invoke(reviewId) },
            onDelete = { onDelete.invoke(reviewId) },
            onEdit = { onEdit.invoke(reviewId) },
            onClose = onClose
        )
    }