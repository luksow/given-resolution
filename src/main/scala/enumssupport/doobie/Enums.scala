package enumssupport.doobie

import doobie.Meta

import enumssupport.EnumOf

trait Enums {
  inline given[E](using e: EnumOf[E]): Meta[E] = Meta.StringMeta.imap(e.`enum`.valueOf)(_.toString)
}

object enums extends Enums