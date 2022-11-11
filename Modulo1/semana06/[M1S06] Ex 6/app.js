async function idadeMedia(nome){
    let result =  await fetch(`https://api.agify.io/?country_id=BR&name=${nome}`)
    result =  await result.json()
    console.log(`Nome: ${result.name} Idade Média:${result.age}`)
}

idadeMedia('Emerson')