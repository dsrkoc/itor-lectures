
trait IList[+T] {

  def isEmpty: Boolean
  def head: T
  def tail: IList[T]

}

case class Cons[+T](head: T, tail: IList[T]) extends IList[T] {
  override def isEmpty = false
}

case object Nil extends IList[Nothing] {

  override def isEmpty = true
  override def head = sys.error("head of empty list")
  override def tail = sys.error("tail of empty list")

}

object IList {

  def apply[T](xs: T*) = xs.foldRight(empty[T]) { (x, acc) => Cons(x, acc) }

  def empty[T]: IList[T] = Nil

}

object IListOps {

  def map[T, U](xs: IList[T])(f: T => U): IList[U] = xs match {
    case Nil => Nil
    case Cons(h, t) => Cons(f(h), map(t)(f))
  }

  def filter[T](xs: IList[T])(f: T => Boolean): IList[T] = ???

  def nth[T](xs: IList[T], n: Int): T = ???

  def flatten[T](xss: IList[IList[T]]): IList[T] = ???

  def flatMap[T, U](xs: IList[T])(f: T => IList[U]): IList[U] = ???
}
