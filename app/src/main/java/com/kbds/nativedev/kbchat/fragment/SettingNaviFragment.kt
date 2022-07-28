package com.kbds.nativedev.kbchat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.kbds.nativedev.kbchat.MainActivity.OnChangeSettingFragment
import com.kbds.nativedev.kbchat.R

class SettingNaviFragment : Fragment() {
    companion object {
        fun newInstance(onChangeSettingFrag: OnChangeSettingFragment): SettingNaviFragment {
            this.onChangeSettingFrag = onChangeSettingFrag
            return SettingNaviFragment()
        }

        private lateinit var onChangeSettingFrag: OnChangeSettingFragment
        const val TAG: String = "SettingFragment2"
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_setting_navi, container, false)

        val btnModify = view.findViewById<Button>(R.id.btn_modify)
        val btnLogout = view.findViewById<Button>(R.id.btn_logout)


        btnModify!!.setOnClickListener{
            onChangeSettingFrag?.onModifyUser()
        }

        btnLogout!!.setOnClickListener{

        }
        return view
    }

}