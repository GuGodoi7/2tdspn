package com.caiosilva.aula28fev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.caiosilva.aula28fev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showFragments()

    }
    private fun showFragments() {
        val primeiroFragment = PrimeiroFragment()
        val SegundoFragment = SegundoFragment()
        val args = Bundle()
        args.putString("NomeDoUsuario", "Gustavo")
        args.putString("IdadeDoUsuario", "18")

        SegundoFragment.arguments = args

        supportFragmentManager
            .beginTransaction()
            .replace(binding.framePrimeiroFragment.id, primeiroFragment)
            .commit()

        supportFragmentManager
            .beginTransaction()
            .replace(binding.frameLoyoutsegundoFragment.id , SegundoFragment)
            .commit()
    }
}
