open class Pessoa (
    var cpf:String,
    var senha:String,
    var nome:String,
    var telefone:String,

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
