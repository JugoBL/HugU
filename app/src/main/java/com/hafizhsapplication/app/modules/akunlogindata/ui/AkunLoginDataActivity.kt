package com.hafizhsapplication.app.modules.akunlogindata.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hafizhsapplication.app.R
import com.hafizhsapplication.app.appcomponents.base.BaseActivity
import com.hafizhsapplication.app.databinding.ActivityAkunLoginDataBinding
import com.hafizhsapplication.app.modules.akunlogindata.`data`.viewmodel.AkunLoginDataVM
import kotlin.String
import kotlin.Unit

class AkunLoginDataActivity :
    BaseActivity<ActivityAkunLoginDataBinding>(R.layout.activity_akun_login_data) {
  private val viewModel: AkunLoginDataVM by viewModels<AkunLoginDataVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.akunLoginDataVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AKUN_LOGIN_DATA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AkunLoginDataActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
