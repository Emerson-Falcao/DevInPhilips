export default class CalculadoraDeArea{
    constructor(tipo,base,altura){
        this.tipo = tipo
        this.base = parseInt(base)
        this.altura = parseInt(altura)
    }
    calcular(){
        let result
        this.tipo == 'triangulo'? result = (this.base * this.altura)/2 : result =  this.base * this.altura
        return result
    }
}