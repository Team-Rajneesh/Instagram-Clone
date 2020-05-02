package com.rajneesh.instagramclone.activities.login.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.rajneesh.instagramclone.R
import com.rajneesh.instagramclone.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mBinding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)

        mBinding.registerBtn.setOnClickListener(this)
        mBinding.loginScreenBtn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.register_btn ->{
                //Todo:  Register user
            }
            R.id.login_screen_btn -> {
                finish()
            }
        }
    }
}
