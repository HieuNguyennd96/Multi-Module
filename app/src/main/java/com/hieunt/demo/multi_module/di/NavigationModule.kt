package com.hieunt.demo.multi_module.di

import com.hieunt.demo.multi_module.navigation.AppNavigation
import com.hieunt.demo.multi_module.navigation.AppNavigatorImpl
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