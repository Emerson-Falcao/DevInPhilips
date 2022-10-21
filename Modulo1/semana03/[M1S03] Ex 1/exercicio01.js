const procuraMinMax = valores => {
    if(valores && valores.length){
        valores.sort((a,b) => a-b)
        console.log(`O menor valor é ${valores[0]} e o maior valor é ${valores[valores.length-1]}`)
    }else{
        console.log('Não é possível encontrar!')
    }
}

const teste1 = [56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47]
procuraMinMax(teste1)

const teste2 = []
procuraMinMax(teste2)

const teste3 = [1]
procuraMinMax(teste3)

const teste4 = [1,-1]
procuraMinMax(teste4)

const teste5 = null
procuraMinMax(teste5)

const teste6 = [-2,-2,-2,-2]
procuraMinMax(teste6)

const teste7 = [20,10, 30]
procuraMinMax(teste7)
