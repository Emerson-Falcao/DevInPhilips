export default class Fatura{
    constructor(id, desc, quantia,preco){
        this.id = parseInt(id)
        this.desc = desc
        quantia<0? this.quantia = 0 : this.quantia = quantia
        preco<0? this.preco = 0 : this.preco = preco
    }

    obterValorTotal(){
        return this.preco*this.quantia
    }

    get valorTotal(){
        return this.preco*this.quantia
    }
}