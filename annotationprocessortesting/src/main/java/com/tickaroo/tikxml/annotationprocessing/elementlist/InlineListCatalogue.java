/*
 * Copyright (C) 2015 Hannes Dorfmann
 * Copyright (C) 2015 Tickaroo, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.tickaroo.tikxml.annotationprocessing.elementlist;

import com.tickaroo.tikxml.annotation.Element;
import com.tickaroo.tikxml.annotation.Xml;
import java.util.List;
import java.util.Objects;

/**
 * @author Hannes Dorfmann
 */
@Xml(name = "catalogue")
public class InlineListCatalogue {

  @Element(name = "book")
  List<Book> books;

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof InlineListCatalogue)) return false;

    InlineListCatalogue that = (InlineListCatalogue) o;

    return Objects.equals(books, that.books);
  }

  @Override public int hashCode() {
    return books != null ? books.hashCode() : 0;
  }
}
