package com.example.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.feed.databinding.FeedFragmentBinding

class FeedFragment: Fragment(R.layout.feed_fragment) {

    private var _binding: FeedFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: FeedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FeedFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.currentUser.observe(viewLifecycleOwner) { currentUser ->
            binding.helloMessage.text = getString(R.string.hello_message, currentUser.username)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}