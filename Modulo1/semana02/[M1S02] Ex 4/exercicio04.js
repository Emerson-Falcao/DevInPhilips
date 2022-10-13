let soma = 0
let valor = 0;
while(true){
    valor = parseInt(prompt('Digite um valor a ser somado.\nDigite -1 para finalizar'))
    if(valor==-1)
    break
    soma += valor
}
alert(soma)