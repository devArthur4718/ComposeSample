package com.example.navigationsample1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationsample1.databinding.FragmentABinding

class FragmentA : Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        Log.d("FragmentA", "Fragment A called: onCreateView()")
        _binding = FragmentABinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupUiListeners()
        Log.d("FragmentA", "Fragment A called: onCreate()")
    }

    private fun setupUiListeners() {
        binding.btnNavigateToB.setOnClickListener {
            val action = FragmentADirections.actionFragmentAToFragmentB()
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.d("FragmentA", "Fragment A called: onDestroyView()")
    }
}
