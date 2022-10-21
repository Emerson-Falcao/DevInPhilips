const somaTudo = (...args) =>{
    let soma = 0
    args.forEach((item)=>soma+=item)
    return soma 
}
const resultado = somaTudo(1, 2, 3, 4);
console.log(resultado);