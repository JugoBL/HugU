package com.hafizhsapplication.app.modules.akun.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hafizhsapplication.app.modules.akun.`data`.model.AkunModel
import org.koin.core.KoinComponent

class AkunVM : ViewModel(), KoinComponent {
  val akunModel: MutableLiveData<AkunModel> = MutableLiveData(AkunModel())

  var navArguments: Bundle? = null
}
