let dia = new Date(`${new Date().getMonth()+1} ${new Date().getDate()}`)
if(dia <= new Date('03-21') || dia >= new Date('12-22')){
    alert('Verão')
} else if(dia >= new Date('03-22') && dia <= new Date('06-21')){
    alert('Outono')
} else if(dia >= new Date('06-22') && dia <= new Date('09-21')){
    alert('Inverno')
} else{
    alert('Primavera')
}
