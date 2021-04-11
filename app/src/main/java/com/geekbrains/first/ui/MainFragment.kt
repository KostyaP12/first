package com.geekbrains.first.ui

import android.content.Context
import android.graphics.Insets
import android.graphics.Point
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.geekbrains.first.R


class MainFragment : Fragment() {

    companion object {
        const val HEIGHT_VALUE_KEY = "KEY"
        fun newInstance(displayHeight: Int): MainFragment {
            val fragment = MainFragment()
            val bundle = Bundle().apply {
                putInt(HEIGHT_VALUE_KEY, displayHeight)
            }
            fragment.arguments = bundle
            return fragment
        }
    }

    private lateinit var fragmentViewModel: MainFragmentViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val fragmentLayout = inflater.inflate(R.layout.main_fragment, container, false)
        val navController = NavHostFragment.findNavController(this)

        val wm = context!!.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val display = wm.defaultDisplay
        val height = display.height



        return fragmentLayout
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fragmentViewModel = ViewModelProvider(this).get(MainFragmentViewModel::class.java)
        // TODO: Use the ViewModel
    }
}