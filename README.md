# Java微服务文档
[Github](https://github.com/PTJ12/chain.git)

springCloud与各个中间件使用各版本对应关系可查看`https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E`
+ 示例
  -[x] 注册中心（nacos）
  -[x] 微服务调用（dubbo）
  -[x] 分布式定时任务（xxl-job）
  -[ ] 分布式事务（seata）
  -[ ] 分布式锁（Redisson）
  -[ ] 服务治理：限流、熔断、降级
  -[ ] 

### nacos(注册中心)
+ 下载地址
  + `https://github.com/alibaba/nacos/releases/tag/2.1.1`
+ windows启动
  + `startup.cmd -m standalone`
+ Linux单机启动
  + `./startup.sh -m standalone`
  + `docker run --env MODE=standalone --name nacos --restart=always -d -p 8848:8848 nacos/nacos-server:2.1.1`
```shell
docker run -d \
-e MODE=standalone \
-e SPRING_DATASOURCE_PLATFORM=mysql \
-e MYSQL_SERVICE_HOST=192.168.220.1 \
-e MYSQL_SERVICE_PORT=3306 \
-e MYSQL_SERVICE_USER=root \
-e MYSQL_SERVICE_PASSWORD=Pl@1221view \
-e MYSQL_SERVICE_DB_NAME=nacos \
-p 8848:8848 \
--restart=always \
--name nacos \
-v /root/docker/nacos/logs/:/home/nacos/logs \
nacos/nacos-server:v2.1.1

```

### dubbo(Rpc调用)
+ `https://cn.dubbo.apache.org/zh-cn/overview/quickstart/java/spring-boot/`

### xxl-job(分布式定时任务)
+ 官网地址、下载地址
  + `https://www.xuxueli.com/xxl-job/#%E3%80%8A%E5%88%86%E5%B8%83%E5%BC%8F%E4%BB%BB%E5%8A%A1%E8%B0%83%E5%BA%A6%E5%B9%B3%E5%8F%B0XXL-JOB%E3%80%8B`
  + `https://github.com/xuxueli/xxl-job/releases`
+ 运行
  + `nohup java -jar xxl-job-admin-2.3.0.jar &`

### seata(分布式事务)
+ 官网地址、下载地址
  + `https://seata.io/zh-cn/docs/ops/deploy-guide-beginner.html`
  + `https://github.com/seata/seata/releases/tag/v1.4.2`

### redisson(分布式锁)
+ 官网地址
  + `https://github.com/redisson/redisson#quick-start`


```shell
docker run -d -p 28000:80 --name test_nginx --privileged=true -v /data/new/cloudpivot/middleware/nginx/conf/nginx.conf:/etc/nginx/nginx.conf -v /data/new/cloudpivot/program/frontEnd:/etc/nginx/html nginx
```

611
```shell
cd /data/new/cloudpivot/program/backEnd/webapi
java -Dsun.misc.URLClassPath.disableJarChecking=true -Xms4g -Xmx4g -Xss256k -XX:MetaspaceSize=512m -XX:MaxMetaspaceSize=512m -XX:+HeapDumpOnOutOfMemoryError -XX:+DisableExplicitGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCApplicationStoppedTime -Xloggc:logs/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=32 -XX:GCLogFileSize=32m -jar web-api-6.11.1.jar -server --spring.profiles.active=prod
```

6.13
```shell
java -Dsun.misc.URLClassPath.disableJarChecking=true -Xms2g -Xmx6g -Xss512k -XX:MetaspaceSize=512m -XX:MaxMetaspaceSize=512m -XX:+HeapDumpOnOutOfMemoryError -XX:+DisableExplicitGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCApplicationStoppedTime -Xloggc:logs/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=32 -XX:GCLogFileSize=32m -Dloader.path=extensions,extensions/common -jar web-api-6.13.21.jar -server --spring.profiles.active=prod
```