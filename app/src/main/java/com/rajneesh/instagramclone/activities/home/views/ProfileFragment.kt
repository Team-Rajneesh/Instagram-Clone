package com.rajneesh.instagramclone.activities.home.views


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rajneesh.instagramclone.R
import com.rajneesh.instagramclone.activities.editProfile.views.EditProfileActivity
import com.rajneesh.instagramclone.databinding.FragmentProfileBinding
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * A simple [Fragment] subclass.
 *
 */
class ProfileFragment : Fragment(), View.OnClickListener {
    private lateinit var mbinding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mbinding = FragmentProfileBinding.inflate(inflater, container, false)
        return mbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       edit_profile_tv.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.edit_profile_tv ->{
                startActivity(Intent(context, EditProfileActivity::class.java))
            }
        }
    }
}

