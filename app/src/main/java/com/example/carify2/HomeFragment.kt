package com.example.carify2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@Suppress("UNREACHABLE_CODE")
class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
  
    val listMembers = listOf<MemberModel>(

        MemberModel("Mohit"),
        MemberModel("kumar"),
        MemberModel("Sahu"),
        MemberModel("Rahul")


    )
        val adapter = MemberAdapter(listMembers)
        val recycler = requireView().findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager= LinearLayoutManager(requireContext())
        recycler.adapter = adapter

    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeFragment().apply {

            }
    }
}