import java.util.ServiceLoader
import com.github.shaneedcm.asdb.ConnectionFactoryMethod

object Main extends App {
  val services = ServiceLoader.load(classOf[ConnectionFactoryMethod])
  val i = services.iterator()
  while(i.hasNext()) {
    val g=  i.next()
    val c = g("ss").get
    val a = c.getConnection
    println(a)
  }
  
}