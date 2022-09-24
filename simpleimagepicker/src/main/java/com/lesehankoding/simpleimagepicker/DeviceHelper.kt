package com.lesehankoding.simpleimagepicker

import android.annotation.*
import android.content.Context
import android.content.Intent
import android.provider.MediaStore
import android.widget.Toast

object DeviceHelper {

    @SuppressLint("QueryPermissionsNeeded")
    fun checkCameraAvailability(context: Context): Boolean {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        val isAvailable = intent.resolveActivity(context.packageManager) != null
        if (!isAvailable) {
            val appContext = context.applicationContext
            Toast.makeText(
                appContext,
                appContext.getString(R.string.eip_no_camera_ready),
                Toast.LENGTH_LONG
            ).show()
        }
        return isAvailable
    }
}