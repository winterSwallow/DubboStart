# DubboStart
a simple dubbo project demo

一、 搭建zookeeper环境（本项目使用的3.6.1版本）
===

1. 下载zookeeper：https://zookeeper.apache.org/releases.html
1. 在根目录新建data文件夹
1. 打开conf目录，复制zoo_sample.cfg重命名为zoo.cfg
1. 修改zoo.cfg文件中属性dataDir为刚创建的data路径
![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/zoo_cfg.png)
1. 打开bin目录，双击zkServer.cmd启动zookeeper

二、 springboot集成dubbo
===

1、项目目录结构
---
（1）api目录：存放消费者与提供者调用的service接口  
（2）consumer目录：消费者目录 调用提供者远程提供的接口实现  
（3）provider目录：提供者目录 提供给消费者接口实现  

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/project_directory.png)

2、代码编写
---
（1）api模块中新增接口服务ApiService.java

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/ApiService.png)

（2）consumer模块中引入api模块和dubbo依赖，resources目录下添加dubbo属性配置，启动类配置@EnableDubbo注解

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/consumer_dubbo.png)
![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/consumer_properties.png)
![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/ConsumerApplication.png)

（3）consumer模块中新增服务接口ProductService.java和服务接口实现ConsumerServiceImpl.java，并远程调用ApiService.java

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/ConsumerServiceImpl.png)

（4）consumer模块中新增控制器ConsumerController.java

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/ConsumerController.png)

（5）provider模块中引入api模块和dubbo依赖，resources目录下添加dubbo属性配置，启动类配置@EnableDubbo注解

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/provider_dubbo.png)
![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/provider_properties.png)
![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/ProviderApplication.png)

（6）provider模块中新增服务实现ProviderServiceImpl.java

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/ProviderServiceImpl.png)

3、测试运行
---
（1）启动consumer和provider
（2）浏览器访问：http://localhost:8062/hello?name=dubbo

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/start_success.png)

4、dubbo管理平台
---
（1）dubbo运维地址： https://github.com/apache/incubator-dubbo-ops/tree/master  
（2）修改dubbo-admin\src\main\resources\application.properties配置文件zookeeper地址  

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/zoo_cfg.png)

（3）启动项目，浏览器访问：http://localhost:8001，输入账号密码：root/root  

![](https://github.com/winterSwallow/wiki/blob/master/DubboStart/image/dubbo_ops.png)