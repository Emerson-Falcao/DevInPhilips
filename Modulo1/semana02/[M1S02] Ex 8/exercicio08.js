let qtd = 0;
for(let n = 2;n<=1000;n++){
    let primo = true
    for(let i = 2;i<n;i++){
        if(n%i===0)
            primo = false
    }
    if(primo){
        qtd++
        console.log(n)
    }
}
console.log(`Existem ${qtd} números primos entre 0 e 1000`)