package com.hafizhsapplication.app.modules.akun.`data`.model

import com.hafizhsapplication.app.R
import com.hafizhsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AkunModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHUGU: String? = MyApp.getInstance().resources.getString(R.string.lbl_hug_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_akunmu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_profilmu)

)
