abstract class ContaCorrente(
    limite: String,
    transacoesMonetarias:String,
    renda:String,
    enderecoResidencial:String,
    taxamensal:String,

    // infos da mae

     saldo: String,
     agencia:String,
     numeroDaConta:Byte,
     gerente:String,
     cliente:String,

):Conta(
    saldo = saldo,
    agencia=agencia,
    numeroDaConta=numeroDaConta,
    gerente=gerente,
    cliente=cliente,

)