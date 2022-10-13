let fator = prompt('Digite o fator para calculo da tabuada:')
let tabuada = '';
for(let i = 1;i<=10;i++){
    tabuada += `${fator} X ${i} = ${fator*i} \n`
}
alert(tabuada)