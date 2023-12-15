package com.hafizhsapplication.app.modules.akundetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hafizhsapplication.app.R
import com.hafizhsapplication.app.appcomponents.base.BaseActivity
import com.hafizhsapplication.app.databinding.ActivityAkunDetailBinding
import com.hafizhsapplication.app.modules.akundetail.`data`.viewmodel.AkunDetailVM
import kotlin.String
import kotlin.Unit

class AkunDetailActivity : BaseActivity<ActivityAkunDetailBinding>(R.layout.activity_akun_detail) {
  private val viewModel: AkunDetailVM by viewModels<AkunDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.akunDetailVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AKUN_DETAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AkunDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
