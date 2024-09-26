package br.senai.sp.jandira.transportaweb.utilities

import br.senai.sp.jandira.transportaweb.model.Motorista

fun validarLogin(motoristas: List<Motorista>, nome: String, senha: String): Boolean {
    val motorista = motoristas.find { it.nome == nome }

    return motorista != null && motorista.senha == senha
}
