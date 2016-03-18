import org.scalatest._

class IListTest extends FlatSpec {
  import IListOps._

  "map" should "return Nil if given Nil" in {
    assert( map(Nil)((x: Int) => x + 1) === Nil )
  }

  it should "return a list with mapped elements otherwise" in {
    val list     = Cons(1, Cons(2, Cons(3, Nil)))
    val expected = Cons(2, Cons(4, Cons(6, Nil)))
    val times2   = (a: Int) => a * 2

    assert( map(list)(times2) === expected )
  }

  // ---

  "filter" should "return Nil if given Nil" in {
    assert( filter(Nil)((x: Int) => true) === Nil )
  }

  it should "return a list with just the elements that satisfy a predicate" in {
    val list     = Cons(1, Cons(2, Cons(3, Nil)))
    val expected = Cons(3, Nil)
    val pred     = (a: Int) => a > 2

    assert( filter(list)(pred) === expected )
  }

  // ---

  "nth" should "return n-th element of the list" ignore {
    ???
  }

  ignore should "throw exception if `n` is out of bounds" in {
    ???
  }

  // ---

  "flatten" should "return Nil if given Nil" ignore {
    ???
  }

  ignore should "take content from the inner list and put into outer" in {
    ???
  }

  ignore should "go only one level deep" in {
    ???
  }

  // ---

  "flatMap" should "return Nil if given Nil" ignore {
    ???
  }

  ignore should "map over element and then flatten the result" in {
    ???
  }

}
