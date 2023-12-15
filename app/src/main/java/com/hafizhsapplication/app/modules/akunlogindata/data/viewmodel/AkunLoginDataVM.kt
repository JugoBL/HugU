package com.hafizhsapplication.app.modules.akunlogindata.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hafizhsapplication.app.modules.akunlogindata.`data`.model.AkunLoginDataModel
import org.koin.core.KoinComponent

class AkunLoginDataVM : ViewModel(), KoinComponent {
  val akunLoginDataModel: MutableLiveData<AkunLoginDataModel> =
      MutableLiveData(AkunLoginDataModel())

  var navArguments: Bundle? = null
}
