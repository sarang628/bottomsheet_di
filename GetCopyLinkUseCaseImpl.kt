package com.sarang.torang.di.bottomsheet_di

import com.sarang.torang.usecase.GetCopyLinkUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.delay

@Module
@InstallIn(SingletonComponent::class)
class GetCopyLinkUseCaseImpl {
    @Provides
    fun providesGetFollowerUseCase(): GetCopyLinkUseCase {
        return object : GetCopyLinkUseCase {
            override suspend fun invoke(reviewId: Int): String {
                delay(2000)
                return ""
            }
        }
    }
}