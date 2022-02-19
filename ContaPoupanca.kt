 class ContaPoupanca (
    rendimento:String,
    investimentoDeBaixoRisco:String,


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
 
 fun saquesRestantes(value: String) {
      println("você tem * de saques restantes")
  }

  fun saldo(value: String) {
      println("Você tem o saldo *")
  }
