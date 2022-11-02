export default class Personagem{
    percentualVida = 100
    
    constructor(nome){
        this.nome = nome
    }

    sofreuDano(percentualDano){
        let novaVida = this.percentualVida-percentualDano
        novaVida<0? this.percentualVida = 0 : this.percentualVida = novaVida
    }

    usouKitMedico(){
        let novaVida = this.percentualVida + 10
        novaVida>100? this.percentualVida = 100 : this.percentualVida = novaVida
    }
}