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

### 基本命令
> docker version  __版本信息__
*** 
> docker info  __docker 系统信息__
***
### 镜像命令
> docker images __所有镜像__  
> > -a 所有
> > -q 只显示镜像id
***
> docker search __搜索镜像__
> > --filter  __docker search mysql --filter=STARS=3000__  
> > --limit  
***
> docker pull __下载镜像__
> > docker pull mysql:5.7  
***
> docker rmi __删除镜像__
> > docker rmi -f 镜像id 镜像id2 镜像id3
> > docker rmi -f $(docker images -aq)
***
###容器命令
> docker run 
> > docker rum -name='名字' __指定容器名字__  
> > docker rum -d __后台方式运行__  
> > docker rum -it __交互方式运行__  
> > docker rum -p 主机端口:容器端口 __交互方式运行__  

> docker ps __列出当前正在运行的容器__