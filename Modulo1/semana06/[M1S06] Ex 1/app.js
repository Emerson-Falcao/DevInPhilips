function sleep(valor){
    return new Promise(()=>{
        setTimeout(console.log,3000, valor)
    })
}
sleep('Teste')