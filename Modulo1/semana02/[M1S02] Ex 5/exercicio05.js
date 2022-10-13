let limite = prompt('Digite o número final')
let pares = Math.floor(limite/2)
let impares = limite%2? pares+1:pares
alert(`Quantidade de Pares: ${pares}\nQuantidade de Impares: ${impares}`)
