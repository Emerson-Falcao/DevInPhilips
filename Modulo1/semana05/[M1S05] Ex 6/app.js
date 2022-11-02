import Juros from "./Juros.js";

const juros1 = new Juros(10000,0.07,24)
console.log(juros1.calcularJurosSimples())
console.log(juros1.calcularJurosCompostos())

const juros2 = new Juros(10000, 0.15,120)
console.log(juros2.calcularJurosSimples())
console.log(juros2.calcularJurosCompostos())
