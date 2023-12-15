package com.hafizhsapplication.app.modules.splashthree.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.hafizhsapplication.app.R
import com.hafizhsapplication.app.appcomponents.base.BaseActivity
import com.hafizhsapplication.app.databinding.ActivitySplashThreeBinding
import com.hafizhsapplication.app.modules.akun.ui.AkunActivity
import com.hafizhsapplication.app.modules.splashthree.`data`.viewmodel.SplashThreeVM
import kotlin.String
import kotlin.Unit

class SplashThreeActivity : BaseActivity<ActivitySplashThreeBinding>(R.layout.activity_splash_three)
    {
  private val viewModel: SplashThreeVM by viewModels<SplashThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashThreeVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = AkunActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPLASH_THREE_ACTIVITY"

    }
  }
