import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'capitalizePhilips'
})
export class CapitalizePhilipsPipe implements PipeTransform {

  transform(frase: string): string {
    const array = frase.split(' ')
    array.forEach((palavra: string, index: number) => {
      array[index] = palavra[0].toUpperCase() + palavra.substring(1)
    })
    return array.join(" ")
  }

}
