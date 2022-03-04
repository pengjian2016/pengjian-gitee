###docker 开源 GO语言开发
```
+ 虚拟机：虚拟一台或多台电脑，笨重
+ 容器： 隔离，镜像 轻巧

镜像（image）==模板  
    tomcat镜像 ==》run==>tomcat01容器提供服务
容器（container）==通过镜像创建 简易的linux系统
    启动，停止，删除，基本命令
仓库（repository）
    docker hub 国外
    阿里云
```


###docker 命令

|  表头   | 表头  |
| : ---- | :---- : |
| docker version  | docker 版本信息 |
| docker info  | docker 系统信息,包括镜像和容器的数量 |
| docker images  | 查看镜像  |
| docker search xx  | 搜索 --filter=STARS=5000 过滤条件等   |
| docker pull  xx   | 下载 可以指定版本 pull xx:5.7 |
| docker rmi   | 删除镜像  空格分割可以多个 |
| docker rmi -f ${docker images -qa}  | 删除所有镜像  |
| docker run image | 启动容器  --name="xx" 容器名称 -d 后台运行 -it 交互运行 -P 指定端口 -P 8080:8888 -p 随机端口|
| docker ps | 查看现在运行的容器  -a 之前运行的容器（all） -n=? 最近创建的容器|
| docker start 容器id| 启动|
| docker restart 容器id|重启|
| docker stop 容器id|停止|
| docker kill 容器id|杀死|
| docker ||
| docker ||
| docker ||

