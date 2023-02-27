package com.example.redeapp.ui.inicial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.redeapp.databinding.FragmentInicialBinding


class InicialFragment : Fragment() {

    lateinit var mBinding: FragmentInicialBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentInicialBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }





}