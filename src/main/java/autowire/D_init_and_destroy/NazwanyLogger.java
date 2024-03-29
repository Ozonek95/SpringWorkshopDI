package autowire.D_init_and_destroy;

import autowire.D_init_and_destroy.api.Logger;

/**
 * @author Kacper Staszek
 */
class NazwanyLogger implements Logger {
  private final String nazwa;

  NazwanyLogger(String nazwa) {
    this.nazwa = nazwa;
  }

  public void loguj(String wiadomość) {
    System.out.println("Log "+nazwa+" treść: "+wiadomość);
  }


  public void afterPropertiesSet() {
    System.out.println("InitializingBean z nazwany logger.");
  }

  public void destroy() {
    System.out.println("DisposableBean z nazwany logger. ");
  }
}
