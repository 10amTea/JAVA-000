# Week05 作业题目

## 2020-11-12（周四）：

1. （必做）写代码实现 Spring Bean 的装配，方式越多越好（XML、Annotation 都可以）, 提交到 Github。

共实现了6种方法，分别为：

- [通过 XmlBeanFactory 方式](/Week_05/spring-test/src/test/java/com/gerry/pang/loadbean/ByXmlBeanFactoryTest.java)
- [通过 DefaultListableBeanFactory 方式](/Week_05/spring-test/src/test/java/com/gerry/pang/loadbean/ByDefaultListableBeanFactoryTest.java)
- [通过 ClassPathXmlApplicationContext 方式](/Week_05/spring-test/src/test/java/com/gerry/pang/loadbean/ByClassPathXmlApplicationContextTest.java.java)
- [通过 AnnotationConfigApplicationContext 方式](/Week_05/spring-test/src/test/java/com/gerry/pang/loadbean/ByAnnotationConfigApplicationContextTest.java)
- [通过 SpringBootApplication 方式](/Week_05/spring-test/src/test/java/com/gerry/pang/loadbean/BySpringBootApplicationTest.java)
- [通过 SpringBootTest 方式](/Week_05/spring-test/src/test/java/com/gerry/pang/loadbean/BySpringBootTestTest.java)

## 2020-11-14（周六）：

1. （必做）给前面课程提供的 Student/Klass/School 实现自动配置和 Starter。

核心操作：

- [spring.factories 添加自定义stater配置类路径 ](/Week_05/spring-test/src/main/resources/META-INF/spring.factories)
- [基于@Configuration和@Condition注解 创建自定义configuration 类](/Week_05/spring-test/src/main/java/com/gerry/pang/config/MySpringTestAutoConfiguration.java)
- [自定义 stater 开关注解](/Week_05/spring-test/src/main/java/com/gerry/pang/config/EnableMySpringTestConfiguration.java)
- [properties 配置类](/Week_05/spring-test/src/main/java/com/gerry/pang/)
- [meta-data.json](/Week_05/spring-test/src/main/resources/META-INF/spring-test-metadata.json)
- [properties配置文件](/Week_05/spring-test/src/main/resources/application.properties)

2. （必做）研究一下 JDBC 接口和数据库连接池，掌握它们的设计和用法：

- 使用 JDBC 原生接口，实现数据库的增删改查操作。
- 使用事务，PrepareStatement 方式，批处理方式，改进上述操作。
- 配置 Hikari 连接池，改进上述操作。提交代码到 Github。
