package com.example.myapplication.viewModel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.asLiveData
import com.example.myapplication.RoomDB.Pessoa
import kotlinx.coroutines.launch

class PessoaViewModel(private val view: view) : ViewModel() {

    fun getPessoa() = view.getAllPessoa().asLiveData(viewModelScope.coroutineContext)

    fun upsertPessoa(pessoa: Pessoa) {
        viewModelScope.launch {
            view.upsertPessoa(pessoa)
        }
    }

    fun deletePessoa(pessoa: Pessoa) {
        viewModelScope.launch {
            view.deletePessoa(pessoa)
        }
    }
}
