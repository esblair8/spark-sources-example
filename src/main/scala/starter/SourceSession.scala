package starter

/**
  * Trait for defining the context of a source
  *
  * @tparam T The type of the context
  */
trait SourceSession[T] {

  /**
    * Get the source context
    */
  def sourceSession: T
}
