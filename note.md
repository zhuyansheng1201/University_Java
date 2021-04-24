## 常用依赖
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.6.RELEASE</version>
</dependency>
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>RELEASE</version>
    <scope>test</scope>
</dependency>
```
## 注解说明
- @Autowired:自动装配通过 类型->名字<br>
  如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier（value="xx")
- @Nullable 字段标记了这个注解，说明这个字段可以为null
- @Resource:自动装配通过 名字->类型