package com.shomazzapp.ststest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shomazzapp.ststest.layoutWrappers.AbstractLayoutWrapper

class DetailsFragment : Fragment() {

    private val ARG_PARAM = "layoutWrapper"
    private lateinit var layoutWrapper: AbstractLayoutWrapper<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            layoutWrapper = it.getSerializable(ARG_PARAM) as AbstractLayoutWrapper<*>
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutWrapper.getResourceId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) =
        layoutWrapper.onViewCreated(view)

    companion object {

        @JvmStatic
        fun newInstance(layoutWrapper: AbstractLayoutWrapper<*>): DetailsFragment {
            return DetailsFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM, layoutWrapper)
                }
            }
        }
    }
}
