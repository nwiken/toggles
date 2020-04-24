package se.toggle;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;

public enum ToggleFeatures implements Feature {
  @Label("Retrieve all books")
  GET_BOOKS_TOGGLE,

  @Label("Delete all books")
  DELETE_BOOK_TOGGLE
}
