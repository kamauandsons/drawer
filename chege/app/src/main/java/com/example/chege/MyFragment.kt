package com.example.chege


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.chege.databinding.FragmentMyBinding


class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentMyBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_my, container, false
        )
    var args=MyFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context,"Name: ${args.nm}",Toast.LENGTH_LONG).show()

        return binding.root
    }


}
