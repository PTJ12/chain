### mysql连接配置
```yaml
spring:
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource
    driver-class-name: com.mysql.jdbc.Driver
    url: jdbc:mysql://ip:port/db?useUnicode=true&characterEncoding=utf8&useSSL=false&allowPublicKeyRetrieval=true
    username: username
    password: password
    druid:
      initial-size: 5
      min-idle: 5
      maxActive: 20
      maxWait: 60000
      timeBetweenEvictionRunsMillis: 60000
      minEvictableIdleTimeMillis: 300000
      validationQuery: SELECT 1 FROM DUAL
      testWhileIdle: true
      testOnBorrow: false
      testOnReturn: false
      poolPreparedStatements: true
      maxPoolPreparedStatementPerConnectionSize: 20
      filters: stat,wall
      connectionProperties: druid.stat.mergeSql\=true;druid.stat.slowSqlMillis\=5000
      web-stat-filter:
        enabled: true
        url-pattern: "/*"
        exclusions: "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*"

mybatis-plus:
  mapper-locations: classpath:mapper/*Mapper.xml
  typeAliasesPackage: top.xpit.ums.entity
  configuration:
    map-underscore-to-camel-case: true
    cache-enabled: true
```