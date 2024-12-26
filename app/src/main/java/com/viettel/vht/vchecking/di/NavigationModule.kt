package com.viettel.vht.vchecking.di

import com.viettel.vht.vchecking.navigation.AppNavigation
import com.viettel.vht.vchecking.navigation.AppNavigatorImpl
import com.module.core.navigation.BaseNavigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class NavigationModule {

    @Binds
    abstract fun provideBaseNavigator(navigator: AppNavigatorImpl): BaseNavigator

    @Binds
    abstract fun provideAppNavigator(navigator: AppNavigatorImpl): AppNavigation
}