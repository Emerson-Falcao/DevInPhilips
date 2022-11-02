import Funcionario from './Funcionario.js'

let ada
try{
    ada = new Funcionario("0", "Ada Lovelace", 1000);
    console.log(ada.salario); 
    ada.promover(50);
    console.log(ada.salario);
}catch(e){
    console.log(e)
}
