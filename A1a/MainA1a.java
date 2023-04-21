import java.util.Scanner;
import java.awt.Graphics;

public class MainA1a {
  private String[] database;
  Scanner input;

  private static Graphics graphics;
  private GUIA1a gui;
  

  // Constructor initializes a database array, a new Scanner, and a GUI object
  public MainA1a(GUIA1a gui) {
    database = new String[0];
    input = new Scanner(System.in);

    this.gui = gui;
  }

  // Add person to database
  public void add(final String name) {
    String[] temp = new String[database.length + 1];
    System.arraycopy(database, 0, temp, 0, database.length);
    temp[database.length] = name;
    database = temp;
  }

  // Search for a person in database
  public int search(final String name) {
    String name2;

    for (int pos = 0; pos < database.length; pos++) {
      Scanner extract = new Scanner(database[pos]);
      name2 = extract.next();

      if (name.compareToIgnoreCase(name2) == 0) {
        return pos;
      }
    }
    return -1;
  }

  // Display a person in database
  public void display(int pos) {
    String name, phone;
    Scanner extract = new Scanner(database[pos]);
    name = extract.next();
    phone = extract.next();

    gui.displayMsg("Person found", name + "    " + phone);
  }

  // Display all people in database
  public void displayAll() {
    gui.display(database);
  }

  // Remove a person from database
  public boolean remove(final String name) {
    int pos = search(name);
    if (pos >= 0) {
      String[] temp = new String[database.length - 1];
      System.arraycopy(database, 0, temp, 0, pos);
      System.arraycopy(database, pos + 1, temp, pos, database.length - pos - 1);
      database = temp;
      return true;
    }
    return false;
  }

  // Display menu options
  public void displayMenu() {
    gui.paint(graphics);
  }

  // Get a person's data and call method to add them to database
  public void addPerson() {
    String person = "";
    try {
      person = gui.readPerson();
    } catch (Exception e) {}

    add(person);
    gui.displayMsg("Person added", person + " was added successfully");
  }

  // Get a person's data and call method to remove them from database
  public void deletePerson() {
    String name = "";
    try {
      name = gui.readName();
    } catch (Exception e) {
    }
    if (!remove(name)) {
      gui.displayErrorMsg("Could not delete " + name);
    } else {
      gui.displayMsg("Person deleted", name + " was deleted successfully");
    }
  }

  // Find a person in database
  public void findPerson() {
    String name = "";
    try {
      name = gui.readName();
    } catch (Exception e) {
    }
    int pos = search(name);
    if (pos >= 0) {
      display(pos);
    } else {
      gui.displayErrorMsg("No such person");
    }
  }

  // Runs the program and displays menu options
  public void run() {
    gui.paint(graphics);
  }

  public static void main(String[] args) {
    GUIA1a gui = new GUIA1a();
    MainA1a main = new MainA1a(gui);
    gui.run(main);
  }
}
