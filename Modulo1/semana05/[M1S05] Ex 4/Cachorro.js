import { Animal } from "./Animal.js";

export class Cachorro extends Animal{
    constructor(nome,idade){
        super()
        this.nome = nome
        this.idade = idade
        super.som = 'latido'
    }
}