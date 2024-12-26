package com.viettel.vht.vchecking.navigation

import com.module.core.navigation.BaseNavigatorImpl
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class AppNavigatorImpl @Inject constructor() : BaseNavigatorImpl(), AppNavigation {

}

