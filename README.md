# spring-crud
## 간단하게 스프링 게시판 crud 구현하기
### SpringBoot intellij(IDE) mysql mybaits java15 thymeleaf Gradle

#### 겪은 오류
##### this inspection performs unresolved sql references check. unable to resolve table intellij
###### database source and driver 에서 datasource 추가하기


##### Consider defining a bean of type 'com.example.springcrud.mapper.BoardMapper' in your configuration.
###### SpringcrudApplication에 추가
  @MapperScan(basePackages = "com.example.springcrud")
  
 
  
