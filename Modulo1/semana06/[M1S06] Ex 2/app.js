function timer(){
    setInterval(()=> {
        let hora = new Date()
        console.log(hora.toLocaleTimeString())
    },2000)
}

timer()