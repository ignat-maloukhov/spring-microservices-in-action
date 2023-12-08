Данный проект написан на основе книги [Spring Microservices in Action, Second Edition by John Carnell and Illary Huaylupo Sánchez, ISBN 9781617296956](https://www.manning.com/books/spring-microservices-in-action-second-edition) и множества других ресурсов.

Цель проекта: получение практического опыта работы с микросервисами, Spring Cloud, Apache Kafka и другими связанными технологиями, а также многочисленные тесты их возможностей.
Я рассчитываю на то, что буду постоянно переписывать этот проект по мере роста своих навыков.

Я использую REST (REpresentational State Transfer) архитектуру для API и следую принципу HATEOAS (Hypertext as the Engine of Application State), подробнее о нем можно прочитать в статье [An Intro to Spring HATEOAS](https://www.baeldung.com/spring-hateoas-tutorial). Для документирования API я использую OpenAPI 3, подробнее о нем можно прочитать в статье [Documenting a Spring REST API Using OpenAPI 3.0](https://www.baeldung.com/spring-rest-openapi-documentation).

В качестве системы сборки используется Maven, каждый микросервис реализован в виде отдельного модуля, подробнее о многомодульных проектах можно прочитать в статье [Multi-Module Project with Maven](https://www.baeldung.com/maven-multi-module).

Микросервисы запускаются в контейнерах Docker, подробнее об этом можно прочитать в статье [Dockerizing a Spring Boot Application
](https://www.baeldung.com/dockerizing-spring-boot-application).

Ссылки:
2. [Spring Boot - Rest Controller](https://xinghua24.github.io/SpringBoot/Spring-Boot-RestController/)
2. [How Spring MVC Really Works](https://dzone.com/articles/how-spring-mvc-really-works)
3. [What is Spring MVC: @Controllers & @RestControllers](https://www.marcobehler.com/guides/spring-mvc)
4. [Documenting a Spring REST API Using OpenAPI 3.0](https://www.baeldung.com/spring-rest-openapi-documentation)
