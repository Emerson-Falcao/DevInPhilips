function parse(str) {
    return Function(`return (${str})`)()
}
let primeiro = Number(prompt('Digite o primeiro valor:'))
let ope = primeiro+prompt('Digite a Operação desejada: + - * /')
let segundo = ope+Number(prompt('Digite o segundo valor:'))
alert(`O resultado do seu cálculo é: ${parse(segundo)}`)