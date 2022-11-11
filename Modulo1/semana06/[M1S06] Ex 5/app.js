async function obterClienteNoBancoDeDados(idCliente) {
    return { nome: 'bruce wayne', id: idCliente }
}

async function processar() {
    console.log(await obterClienteNoBancoDeDados(7))
}

processar();