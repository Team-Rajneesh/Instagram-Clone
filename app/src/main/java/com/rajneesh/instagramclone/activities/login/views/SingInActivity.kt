package com.rajneesh.instagramclone.activities.login.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.rajneesh.instagramclone.R
import com.rajneesh.instagramclone.databinding.ActivitySingnInBinding

class SingInActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mBinding: ActivitySingnInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_singn_in)

        mBinding.loginBtn.setOnClickListener(this)
        mBinding.signUpTv.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.login_btn ->{
             //Todo:: Login user
            }
            R.id.sign_up_tv -> {
                startActivity(Intent(this, SignUpActivity::class.java))
            }
        }
    }
}
