package se.toggle.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;
import se.toggle.ToggleFeatures;

@RestController
public class BookController {

  private final FeatureManager featureManager;

  public BookController(FeatureManager featureManager) {
    this.featureManager = featureManager;
  }

  @GetMapping("/books")
  public String getBooks() {
    if (featureManager.isActive(ToggleFeatures.GET_BOOKS_TOGGLE)) {
      return "Return all books";
    } else {
      return "Toggle disabled for returning all books";
    }
  }

  @DeleteMapping("/books")
  public String deleteBook() {
    if (featureManager.isActive(ToggleFeatures.DELETE_BOOK_TOGGLE)) {
      return "All books deleted";
    } else {
      return "Toggle disabled for deleting all books";
    }
  }
}