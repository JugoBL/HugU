package com.hafizhsapplication.app.modules.akun.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hafizhsapplication.app.R
import com.hafizhsapplication.app.appcomponents.base.BaseActivity
import com.hafizhsapplication.app.databinding.ActivityAkunBinding
import com.hafizhsapplication.app.modules.akun.`data`.viewmodel.AkunVM
import com.hafizhsapplication.app.modules.akundetail.ui.AkunDetailActivity
import com.hafizhsapplication.app.modules.akunlogindata.ui.AkunLoginDataActivity
import kotlin.String
import kotlin.Unit

class AkunActivity : BaseActivity<ActivityAkunBinding>(R.layout.activity_akun) {
  private val viewModel: AkunVM by viewModels<AkunVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.akunVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGroupTwo.setOnClickListener {
      val destIntent = AkunDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupThree.setOnClickListener {
      val destIntent = AkunLoginDataActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "AKUN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AkunActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
