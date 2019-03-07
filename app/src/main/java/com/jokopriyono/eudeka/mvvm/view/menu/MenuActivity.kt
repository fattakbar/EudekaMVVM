package com.jokopriyono.eudeka.mvvm.view.menu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jokopriyono.eudeka.mvvm.R
import com.jokopriyono.eudeka.mvvm.view.login.LoginActivity
import kotlinx.android.synthetic.main.activity_menu.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        card_football_team.onClick {
            startActivity<LoginActivity>()
            finish()
        }
    }
}
