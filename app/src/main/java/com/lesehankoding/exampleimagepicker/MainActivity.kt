package com.lesehankoding.exampleimagepicker

import android.net.*
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import com.lesehankoding.exampleimagepicker.databinding.ActivityMainBinding
import com.lesehankoding.simpleimagepicker.*
import java.io.*

class MainActivity : AppCompatActivity() {

	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		val config = EIPConfig(
				isCropAspectRatio = true,
				cropRatio = RATIO.WIDE
		)
		binding.fab.setOnClickListener { view ->
			launcherEIP.launchCamera(config)
		}
	}

	val launcherEIP = registerEIP {

//		get file path , Simple use with 1 lines code
		val file = File(it.path!!)

//		and load to image or send file to server
		binding.img.setImageURI(Uri.parse(file.absolutePath))
	}

}