public class Main {
  public static void main(String[] args) {
    UI ui = null;
    AddressBook book;

    if (args.length > 0) {
      // If argument passed is console, create ConsoleUI object
      if (args[0].compareToIgnoreCase("console") == 0)
        ui = new ConsoleUI();
      // If argument passed is gui, create GUI object
      else if (args[0].compareToIgnoreCase("gui") == 0)
        ui = new GUI();
    }

    // Call method to run the program
    if (ui != null) {
      book = new AddressBook(ui);
      ui.run(book);
    }

  }
}