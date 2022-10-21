const mensagemOla = () => {
    const nome = document.getElementById('nome').value
    document.getElementById('paragrafo').innerText = `Olá, ${nome}!`
}
