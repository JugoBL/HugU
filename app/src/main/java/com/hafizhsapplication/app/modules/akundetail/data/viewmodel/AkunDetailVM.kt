package com.hafizhsapplication.app.modules.akundetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hafizhsapplication.app.modules.akundetail.`data`.model.AkunDetailModel
import org.koin.core.KoinComponent

class AkunDetailVM : ViewModel(), KoinComponent {
  val akunDetailModel: MutableLiveData<AkunDetailModel> = MutableLiveData(AkunDetailModel())

  var navArguments: Bundle? = null
}
