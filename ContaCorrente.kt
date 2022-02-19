abstract class ContaCorrente(
    limite: String,
    transacoesMonetarias:String,
    renda:String,
    enderecoResidencial:String,
    taxamensal:String,

    // infos da mae

     agencia:String,
     numeroDaConta:Byte,
     gerente:String,
     cliente:String,

):Conta(
  
    agencia=agencia,
    numeroDaConta=numeroDaConta,
    gerente=gerente,
    cliente=cliente,

)

fun transacoesMonetarias(value: String) {
    println("Transação feita")
}

fun taxaMensal(value: String) {
    println("Taxa Mensal")
}    
