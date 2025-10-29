package com.sarang.torangbottomsheet.di.bottomsheet

import com.sarang.torang.BuildConfig
import com.sarang.torang.api.ApiProfile
import com.sarang.torang.core.database.dao.LoggedInUserDao
import com.sarang.torang.session.SessionService
import com.sarang.torang.data.bottomsheet.User
import com.sarang.torang.usecase.GetFollowerUseCase
import com.sarang.torang.usecase.SendShareUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.delay


@Module
@InstallIn(SingletonComponent::class)
class SendShareUseCaseImpl
{
    @Provides
    fun providesGetFollowerUseCase(apiProfile: ApiProfile, sessionService: SessionService): SendShareUseCase
    {
        return object : SendShareUseCase
        {
            override suspend fun invoke(reviewId: Int, userId: List<Int>)
            {
                delay(2000)
            }
        }
    }

}