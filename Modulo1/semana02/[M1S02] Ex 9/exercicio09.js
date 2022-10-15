let inicial = Number(prompt('Informe o valor inicial:'))
let raiz = Number(prompt('Informe a raiz:'))
let alerta = ''
for(let i = 0; i<10;i++){
    alerta+=`| ${inicial} |`
    inicial+=raiz
}
alert(`P.A. ${alerta}`)