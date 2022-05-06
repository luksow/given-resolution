import doobie.{given, _}
import doobie.implicits.{given, _}
import doobie.postgres.{given, _}
import doobie.postgres.implicits.{given, _}
//import enumssupport.doobie.enums.given // WON'T COMPILE WITH THIS, BUT WHY?

enum Color {
  case Red, Blue, Green, Other
}

class MySuite extends munit.FunSuite {
  test("example test that succeeds") {
    implicitly[Get[List[String]]]
  }
}
