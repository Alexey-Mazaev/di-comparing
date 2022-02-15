package com.example.onboarding.login

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import com.example.onboarding.OnboardingComponentProvider
import com.example.onboarding.R
import com.example.onboarding.databinding.LoginFragmentBinding
import com.example.share.di.ViewModelFactory
import com.example.share.ui.Navigator
import javax.inject.Inject

class LoginFragment: Fragment(R.layout.login_fragment) {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private var _binding: LoginFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: LoginViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (requireActivity().application as OnboardingComponentProvider)
            .provideOnboardingComponent()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this, viewModelFactory).get(LoginViewModel::class.java)
        _binding = LoginFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.login.setOnClickListener {
            viewModel.login(
                userName = binding.username.text.toString(),
                password = binding.password.text.toString()
            )
        }

        viewModel.loginSuccess.observe(viewLifecycleOwner) { loginSuccess ->
            if (loginSuccess) {
                (requireActivity() as Navigator).showFeed()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}