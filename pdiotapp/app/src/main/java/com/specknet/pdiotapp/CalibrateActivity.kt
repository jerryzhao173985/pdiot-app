package com.specknet.pdiotapp

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import com.google.android.material.snackbar.Snackbar
import com.parse.ParseUser
import com.specknet.pdiotapp.bluetooth.BluetoothSpeckService
import com.specknet.pdiotapp.bluetooth.ConnectingActivity
import com.specknet.pdiotapp.live.LiveDataActivity
import com.specknet.pdiotapp.live.MLActivity
import com.specknet.pdiotapp.onboarding.OnBoardingActivity
import com.specknet.pdiotapp.utils.Constants
import com.specknet.pdiotapp.utils.Utils
import com.specknet.pdiotapp.help.HelpActivity
import com.specknet.pdiotapp.live.OnlineActivity
import com.specknet.pdiotapp.live.OnlinePrediction
import kotlinx.android.synthetic.main.activity_home.*

class CalibrateActivity : AppCompatActivity() {

    //image buttons
    lateinit var activity1: AppCompatImageButton
    lateinit var activity2: AppCompatImageButton
    lateinit var activity3: AppCompatImageButton
    lateinit var activity4: AppCompatImageButton
    lateinit var activity5: AppCompatImageButton
    lateinit var activity6: AppCompatImageButton
    lateinit var activity7: AppCompatImageButton
    lateinit var activity8: AppCompatImageButton
    lateinit var activity9: AppCompatImageButton
    lateinit var activity10: AppCompatImageButton
    lateinit var activity11: AppCompatImageButton
    lateinit var activity12: AppCompatImageButton
    lateinit var activity13: AppCompatImageButton
    lateinit var activity14: AppCompatImageButton
    lateinit var activity15: AppCompatImageButton
    lateinit var activity16: AppCompatImageButton
    lateinit var activity17: AppCompatImageButton
    lateinit var activity18: AppCompatImageButton
    lateinit var onlinePrediction: Button

    // permissions
    lateinit var permissionAlertDialog: AlertDialog.Builder
    val permissionsForRequest = arrayListOf<String>()

    var locationPermissionGranted = false
    var cameraPermissionGranted = false
    var readStoragePermissionGranted = false
    var writeStoragePermissionGranted = false

    // broadcast receiver
    val filter = IntentFilter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calibration)

        //initialize gif image buttons
        activity1 = findViewById(R.id.activity1)
        activity2 = findViewById(R.id.activity2)
        activity3 = findViewById(R.id.activity3)
        activity4 = findViewById(R.id.activity4)
        activity5 = findViewById(R.id.activity5)
        activity6 = findViewById(R.id.activity6)
        activity7 = findViewById(R.id.activity7)
        activity8 = findViewById(R.id.activity8)
        activity9 = findViewById(R.id.activity9)
        activity10 = findViewById(R.id.activity10)
        activity11 = findViewById(R.id.activity11)
        activity12 = findViewById(R.id.activity12)
        activity13 = findViewById(R.id.activity13)
        activity14 = findViewById(R.id.activity14)
        activity15 = findViewById(R.id.activity15)
        activity16 = findViewById(R.id.activity16)
        activity17 = findViewById(R.id.activity17)
        activity18 = findViewById(R.id.activity18)

        onlinePrediction = findViewById(R.id.onlineperdiction)

        permissionAlertDialog = AlertDialog.Builder(this)

        setupClickListeners()

        // register a broadcast receiver for respeck status
        filter.addAction(Constants.ACTION_RESPECK_CONNECTED)
        filter.addAction(Constants.ACTION_RESPECK_DISCONNECTED)

    }

    fun setupClickListeners() {

        activity1.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 1)
            startActivity(intent)
        }
        activity2.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 2)
            startActivity(intent)
        }
        activity3.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 3)
            startActivity(intent)
        }
        activity4.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 4)
            startActivity(intent)
        }
        activity5.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 5)
            startActivity(intent)
        }
        activity6.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 6)
            startActivity(intent)
        }
        activity7.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 7)
            startActivity(intent)
        }
        activity8.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 8)
            startActivity(intent)
        }
        activity9.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 9)
            startActivity(intent)
        }
        activity10.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 10)
            startActivity(intent)
        }
        activity11.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 11)
            startActivity(intent)
        }
        activity12.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 12)
            startActivity(intent)
        }
        activity13.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 13)
            startActivity(intent)
        }
        activity14.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 14)
            startActivity(intent)
        }
        activity15.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 15)
            startActivity(intent)
        }
        activity16.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 16)
            startActivity(intent)
        }
        activity17.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 17)
            startActivity(intent)
        }
        activity18.setOnClickListener {
            val intent = Intent(this, OnlineActivity::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 18)
            startActivity(intent)
        }

        onlinePrediction.setOnClickListener {
            val intent = Intent(this, OnlinePrediction::class.java)
            val username = getIntent().getStringExtra("username");
            intent.putExtra("username", username)
            intent.putExtra("activity_index", 18)
            startActivity(intent)
        }

    }

}