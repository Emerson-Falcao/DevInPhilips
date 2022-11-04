import Usuario from "./Usuario.js";

function autenticacao(){
    const userAdmin = new Usuario('Admin','admin@gmail.com','admin1234')

    const email = document.getElementById('email').value
    const senha = document.getElementById('senha').value

    userAdmin.autenticar(email,senha)? alert('Usuário Autenticado'): alert('Credenciais Inválidas')
}

document.getElementById('loginBtn').addEventListener('click',autenticacao)