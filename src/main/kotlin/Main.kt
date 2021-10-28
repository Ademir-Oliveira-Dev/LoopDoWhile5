fun main(args: Array<String>) {
    /*5 - Crie um programa que leia um número do teclado até que encontre
    um número igual a zero. No final, mostre:

- A soma dos números digitados.
- A média deles
- O menor número digitado
- O maior número digitado

     */

    var soma = 0
    var contador = 0
    var media = 0.0
    var menorNum = 0
    var maiorNum = 0

    do {
        print("Digite um número inteiro e positivo: ")
        var numero = readLine()!!.toInt()

        if (numero != 0){
            soma += numero

            if(contador == 0){
                maiorNum = numero
                menorNum = numero
            }else{
                if (numero > maiorNum){
                    maiorNum = numero
                }
                if (numero < menorNum){
                    menorNum = numero
                }
            }
            contador++
        }

    }while (numero != 0)

    media = soma/contador.toDouble()

    println("A soma dos números é: $soma")
    println("A média dos números é: $media")
    println("O menor número é: $menorNum")
    println("O maior número é: $maiorNum")
    
}