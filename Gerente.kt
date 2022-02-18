abstract class Gerente (
    salario:String,
    turno:String,

    // infos da mae

    cpf:String,
    senha:String,
    nome:String,
    telefone:String,
    saldo: String,
    agencia:String,
    numeroDaConta:Byte,
    gerente:String,
    cliente:String,


    ): Pessoa(

    cpf = cpf,
    senha = senha,
    nome = nome,
    telefone = telefone,
    saldo = saldo,
    agencia = agencia,
    numeroDaConta = numeroDaConta,
    gerente = gerente,
    cliente = cliente,


    )