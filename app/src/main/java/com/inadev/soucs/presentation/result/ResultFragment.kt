package com.inadev.soucs.presentation.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.inadev.soucs.R
import com.oit.soucs.ResultFragmentArgs

class ResultFragment : Fragment() {

    private val args: ResultFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_result,container,false)
        val titleTextView: TextView = view.findViewById(R.id.result_title)
        when(args.grade){
            0 -> titleTextView.text = getText(R.string.inclusion_farmer)
            1 -> titleTextView.text = getText(R.string.inclusion_rookie)
            2 -> titleTextView.text = getText(R.string.inclusion_champion)
            3 -> titleTextView.text = getText(R.string.inclusion_captain)
            4 -> titleTextView.text = getText(R.string.inclusion_pro)
        }
        return view
    }
}