package com.hafizhsapplication.app.modules.splashthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hafizhsapplication.app.modules.splashthree.`data`.model.SplashThreeModel
import org.koin.core.KoinComponent

class SplashThreeVM : ViewModel(), KoinComponent {
  val splashThreeModel: MutableLiveData<SplashThreeModel> = MutableLiveData(SplashThreeModel())

  var navArguments: Bundle? = null
}
