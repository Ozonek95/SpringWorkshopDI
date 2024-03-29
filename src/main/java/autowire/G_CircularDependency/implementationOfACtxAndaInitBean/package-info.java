/**
 * Ostatnią aletrnatywą jest zaimplementowanie intrfejsów
 * {@code ApplicationContextAware} : <a href = "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContextAware.html">ApplicationContextAware</a>
 * <br><br>
 * {@code InitializingBean}: <a href = "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html">InitializingBean</a>
 * <br><br>
 * Pierwszy daje nam dostęp do kontekstu aplikacji.
 * Drugi pozwala nam nadpisać metodę afterPropertiesSet() która pozwala z kontekstu utworzyc ziarno.
 *
 * <ol>
 *   {@link autowire.G_CircularDependency.implementationOfACtxAndaInitBean.ZiarnoA ZiarnoA}
 *   <li>
 *     Dodaj do implemntacji {@code ApplicationContextAware} i {@code InitializingBean}. metoda setApplicationContext powinna umożliwić Ci wyciagnięcie do zmiennej kontekstu,
 *     w metodzie afterPropertiesSet z pomocą kontekstu zapisz {@link ZiarnoA#ziarnoB} w zmiennej.
 *   </li>
 * </ol>
 *
 *
 * @author Jakub Czajka
 */
package autowire.G_CircularDependency.implementationOfACtxAndaInitBean;