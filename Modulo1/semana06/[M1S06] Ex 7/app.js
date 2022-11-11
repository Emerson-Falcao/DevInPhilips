async function precoBitcoin(){
    let result =  await fetch(`https://api.coincap.io/v2/assets/bitcoin`)
    result =  await result.json()
    console.log(`O preço do Bitcoin - ${result.data.symbol} em dólares hoje é $${result.data.priceUsd}`)
}

precoBitcoin()