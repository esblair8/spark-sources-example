package sources

/**
  * Trait for defining the context of a source
  *
  * @tparam T The type of the context
  */
trait SourceContext[T] {

  /**
    * Get the source context
    */
  def sourceContext: T
}
