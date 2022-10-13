let soma = 0
let valor = 0;
while(true){
    valor = parseFloat(prompt('Digite um valor a ser somado.\nDigite -1 para finalizar'))
    soma += valor
    if(valor==-1)
    break
}
alert(soma)