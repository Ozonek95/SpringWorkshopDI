package autowire.exerciseOne.szpiedzy;

import autowire.exerciseOne.drinki.Drink;
import autowire.exerciseOne.złoczyńcy.Złoczyńca;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka imie = Austin nazwisko = Powers złoczyńca = DrEvil drink = CubaLibre
 */
@Component
public class AustinPowers extends Szpieg {

  public AustinPowers(Złoczyńca złoczyńca, Drink drink, String imię, String nazwisko) {
    super(złoczyńca, drink, imię, nazwisko);
  }
}
