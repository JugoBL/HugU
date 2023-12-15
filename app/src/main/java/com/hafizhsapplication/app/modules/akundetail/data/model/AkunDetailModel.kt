package com.hafizhsapplication.app.modules.akundetail.`data`.model

import com.hafizhsapplication.app.R
import com.hafizhsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AkunDetailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
