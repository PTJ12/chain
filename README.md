# Java微服务文档

springCloud与各个中间件使用各版本对应关系可查看`https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E`
+ 示例
  -[x] 注册中心（nacos）
  -[x] 微服务调用（dubbo）
  -[x] 分布式定时任务（xxl-job）
  -[ ] 分布式事务（seta）
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

### dubbo(Rpc调用)
+ `https://cn.dubbo.apache.org/zh-cn/overview/quickstart/java/spring-boot/`

### xxl-job(分布式定时任务)
+ 官网地址、下载地址
  + `https://www.xuxueli.com/xxl-job/#%E3%80%8A%E5%88%86%E5%B8%83%E5%BC%8F%E4%BB%BB%E5%8A%A1%E8%B0%83%E5%BA%A6%E5%B9%B3%E5%8F%B0XXL-JOB%E3%80%8B`
  + `https://github.com/xuxueli/xxl-job/releases`
+ 运行
  + `nohup java -jar xxl-job-admin-2.3.0.jar &`

### seta(分布式事务)
+ 官网地址、下载地址
  + `https://seata.io/zh-cn/docs/ops/deploy-guide-beginner.html`
  + `https://github.com/seata/seata/releases/tag/v1.4.2`

### redisson(分布式锁)
+ 官网地址
  + `https://github.com/redisson/redisson#quick-start`