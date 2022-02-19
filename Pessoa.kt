open class Pessoa (
    var cpf:String,
    var senha:String,
    var nome:String,
    var telefone:String,

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
