package br.senai.sp.jandira.transportaweb.utilities

import android.content.Context
import br.senai.sp.jandira.transportaweb.model.Motorista

class MotoristaRepository(context: Context) {

    fun validarLogin(motoristas: List<Motorista>, nome: String, senha: String): Boolean {
        val motorista = motoristas.find { it.nome == nome }

        return motorista != null && motorista.senha == senha
    }
}