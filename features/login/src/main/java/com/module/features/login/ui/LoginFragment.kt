package com.module.features.login.ui

import android.view.View
import android.view.WindowInsetsController
import androidx.fragment.app.viewModels
import com.module.core.ui.base.BaseFragment
import com.module.features.login.R
import com.module.features.login.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {

    override val layoutId
        get() = R.layout.fragment_login

    private val mViewModel: LoginViewModel by viewModels()

    override fun getVM() = mViewModel

    override fun initView() {
        super.initView()

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
            val windowInsetsController = activity?.window?.insetsController
            windowInsetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
            activity?.window?.statusBarColor = resources.getColor(com.module.core.ui.R.color.color_D61841, null)
        } else {
            activity?.window?.statusBarColor = resources.getColor(com.module.core.ui.R.color.color_D61841, null)
            activity?.window?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    }
}