object CaesarCipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val s = "CORONA"
 
  val Encrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
  val Decrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)

  val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))
  
  //cipher text(encrypted message)
  val ct=cipher(Encrypt,s,5,alphabet)
  //plain text(input message)
  val pt=cipher(Decrypt,ct,5,alphabet)
  
  println("Secret Word: " +s)
  println("Encryption: "+ct)
  println("Decryption: "+pt)

}
