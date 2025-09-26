package com.setbadge
import android.app.NotificationManager

import android.content.Context
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import me.leolin.shortcutbadger.ShortcutBadger

class SetbadgeModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String = NAME

  @ReactMethod
  fun setBadge(count: Int) {   // nhận Int trực tiếp
    val context: Context = reactApplicationContext
    ShortcutBadger.applyCount(context, count)
  }

  @ReactMethod
  fun clearBadge() {
    val context: Context = reactApplicationContext
    ShortcutBadger.removeCount(context)
    val notificationManager =
      context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    notificationManager.cancelAll()
  }

  companion object {
    const val NAME = "Setbadge"
  }
}
