const destruturador = ({nome,idade,profissao} = objeto) => `Esta é ${nome}, tem ${idade} anos e é ${profissao}`

const pessoa = {
    nome: 'Ada',
    idade: 36,
    profissao: 'matemática'
}

console.log(destruturador(pessoa))
