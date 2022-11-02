import { Animal } from "./Animal.js";

export class Gato extends Animal{
    constructor(nome,idade){
        super()
        this.nome = nome
        this.idade = idade
        super.som = 'miado'
    }
}